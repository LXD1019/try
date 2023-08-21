package test.Excel.POI;

import com.alibaba.fastjson.JSON;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vvirster@163.com
 * @date 2022-11-24 15:29
 * @description POI导出Excel工具类
 **/
public class ExportExcelUtil {
    private static final Logger logger = LoggerFactory.getLogger(ExportExcelUtil.class);

    /**
     * 生成表格（用于生成复杂表头）
     *
     * home.php?mod=space&uid=952169 sheetName   sheet名称
     * @param wb          表对象
     * @param cellListMap 表头数据 {key=cellRowNum}
     * @param cellRowNum  表头总占用行数
     * @param exportData  行数据
     * home.php?mod=space&uid=155549 HSSFWorkbook 数据表对象
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Workbook createCSVUtil(String sheetName, Workbook wb,
                                         Map<String, List<CellModel>> cellListMap,
                                         Integer cellRowNum, List<LinkedHashMap> exportData) throws Exception {
        //设置表格名称
        Sheet sheet = wb.createSheet(sheetName);
        // 设置打印参数
        PrintSetup printSetup = sheet.getPrintSetup();
        // 纸张大小
        printSetup.setPaperSize(PrintSetup.A4_PAPERSIZE);
        sheet.setDisplayGridlines(false);
        sheet.setPrintGridlines(false);
        // 上边距
        sheet.setMargin(Sheet.TopMargin, 0.5);
        // 下边距
        sheet.setMargin(Sheet.BottomMargin, 0.5);
        // 左边距
        sheet.setMargin(Sheet.LeftMargin, 0.5);
        // 右边距
        sheet.setMargin(Sheet.RightMargin, 0.5);
        sheet.setHorizontallyCenter(true);

        sheet.autoSizeColumn(1, true);
        // 定义title列cell样式
        CellStyle cellStyle = wb.createCellStyle();
        //设置单元格内容水平对齐
        // 文字居中
        cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
        //设置单元格内容垂直对齐
        cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        //设置自动换行
        cellStyle.setWrapText(true);
        cellStyle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
        //cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//背景色
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);
        // 定义title列cell字体
        Font font = wb.createFont();
        // font.setColor(HSSFColor.VIOLET.index);//字体颜色
        font.setFontHeightInPoints((short) 12);
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        cellStyle.setFont(font);

        // 定义数据内容单元格样式
        CellStyle cellDataStyle = wb.createCellStyle();
        //设置单元格内容水平对齐
        // 文字居中
        cellDataStyle.setAlignment(CellStyle.ALIGN_CENTER);
        //设置单元格内容垂直对齐
        cellDataStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        //设置自动换行
        cellDataStyle.setWrapText(true);
        cellDataStyle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
        cellDataStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellDataStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellDataStyle.setBorderRight(CellStyle.BORDER_THIN);
        cellDataStyle.setBorderTop(CellStyle.BORDER_THIN);

        for (int t = 0; t < cellRowNum; t++) {
            Row row = sheet.createRow(t);
            List<CellModel> cellNameList = cellListMap.get(String.valueOf(t));

            for (CellModel cellModel : cellNameList) {
                // 遍历插入表头
                if (cellModel.getStartColumn() != null) {
                    Cell cell = row.createCell(cellModel.getStartColumn());
                    cell.setCellValue(cellModel.getCellName());
                    cell.setCellStyle(cellStyle);
                }
            }
            // 解决合并单元格后出现部分单元格没有边框的问题
            if (t != 0) {
                int lastCellNum = sheet.getRow(0).getLastCellNum();
                for (int cellIndex = 0; cellIndex < lastCellNum; cellIndex++) {
                    Cell cell = sheet.getRow(t).getCell(cellIndex);
                    if (cell == null) {
                        cell = sheet.getRow(t).createCell(cellIndex);
                        cell.setCellValue("");
                    }
                    cell.setCellStyle(cellStyle);
                }
            }
            // 合并单元格
            for (CellModel cellModel : cellNameList) {
                logger.info("cellModelInfo,{}", JSON.toJSONString(cellModel));
                if (cellModel.getStartRow() != null) {
                    //合并单元格
                    CellRangeAddress region = new CellRangeAddress(cellModel.getStartRow(),
                            cellModel.getEndRow(), cellModel.getStartColumn(), cellModel.getEndColumn());
                    /**
                     * 1.合并单元格区域必须为2个或2个以上的单元格，一个单元格进行合并时会报错。
                     * 2.设置合并单元格之前先判断合并单元格区域是否只有一个单元格。
                     */
                    if (cellModel.getEndRow() == cellModel.getStartRow() && cellModel.getEndColumn() == cellModel.getStartColumn()) {
                        break;
                    }
                    //给定要合并的单元格范围
                    sheet.addMergedRegion(region);
                }
                // 根据标题设置单元格宽度
                if (cellModel.getWidth() != null) {
                    sheet.setColumnWidth(cellModel.getStartColumn(), cellModel.getWidth() * 256);
                } else {
                    sheet.setColumnWidth(cellModel.getStartColumn(), cellModel.getCellName().getBytes().length * 256);
                }
            }

        }
        // 导出具体的数据
        for (LinkedHashMap hashMap : exportData) {
            Row rowValue = sheet.createRow(cellRowNum);
            for (Map.Entry entryRow : (Iterable<Map.Entry>) hashMap.entrySet()) {
                int key = Integer.parseInt(entryRow.getKey().toString());
                String value = "";
                if (entryRow.getValue() != null) {
                    value = entryRow.getValue().toString();
                } else {
                    value = "";
                }
                Cell cellValue = rowValue.createCell(key);
                cellValue.setCellValue(value);
                cellValue.setCellStyle(cellDataStyle);
            }
            cellRowNum++;
        }
        return wb;
    }

    /**
     * 通过HTTP请求下载Excel
     * @param cellListMap    表格标题
     * @param exportData     需要导出的数据
     * @param sheetName      表格名称
     * @param exportFileName 导出文件名称
     * @param response       servletResponse
     */
    //main函数中调用http的方法会报错
    /*public static void downloadExcel(Map<String, List<CellModel>> cellListMap, List<LinkedHashMap> exportData,
                                     String sheetName, String exportFileName, HttpServletResponse response) throws Exception {
        OutputStream out = null;
        String fileType = ".xlsx";
        try {
            Workbook wb = createCSVUtil(sheetName, new HSSFWorkbook(), cellListMap, cellListMap.size(), exportData);

            String s_attachment = "attachment; filename=" + exportFileName + fileType;

            // 设置字符编码的格式
            s_attachment = new String(s_attachment.getBytes("gb2312"), "ISO8859-1");
            // 设定输出文件头
            response.setHeader("Content-disposition", s_attachment);
            // 定义输出类型
            response.setContentType("application/vnd.ms-excel");
            response.setContentType("text/plain;charset=UTF-8");
            out = response.getOutputStream();
            wb.write(out);
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException("导出Excel失败！");
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }*/

}
