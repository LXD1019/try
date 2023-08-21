package test.Excel.POI;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;

public class ExcelUtilTest {
    /**
     * 生成Excel表头
     **/
    public static Map<String, List<CellModel>> genExcelTitleCel() {
        //表头数据
        Map<String, List<CellModel>> cellTitleMap = new HashMap<String, List<CellModel>>();
        // 第一行表头数据
        List<CellModel> firstRow = new ArrayList<CellModel>();
        CellModel first_cellModel1 = new CellModel();
        first_cellModel1.setCellName("项目名称");
        first_cellModel1.setStartRow(0);
        first_cellModel1.setWidth(20);
        first_cellModel1.setEndRow(1);
        first_cellModel1.setStartColumn(0);
        first_cellModel1.setEndColumn(0);

        CellModel first_cellModel2 = new CellModel();
        first_cellModel2.setCellName("计划类别");
        first_cellModel2.setStartRow(0);
        first_cellModel2.setEndRow(1);
        first_cellModel2.setStartColumn(1);
        first_cellModel2.setEndColumn(1);

        CellModel first_cellModel3 = new CellModel();
        first_cellModel3.setCellName("项目负责人");
        first_cellModel3.setStartRow(0);
        first_cellModel3.setEndRow(1);
        first_cellModel3.setStartColumn(2);
        first_cellModel3.setEndColumn(2);

        CellModel first_cellModel4 = new CellModel();
        first_cellModel4.setCellName("项目编号");
        first_cellModel4.setStartRow(0);
        first_cellModel4.setEndRow(1);
        first_cellModel4.setStartColumn(3);
        first_cellModel4.setEndColumn(3);

        CellModel first_cellModel5 = new CellModel();
        first_cellModel5.setCellName("2022年度发表受本项目资助的论文（篇）");
        first_cellModel5.setStartRow(0);
        first_cellModel5.setEndRow(0);
        first_cellModel5.setStartColumn(4);
        first_cellModel5.setEndColumn(10);

        CellModel first_cellModel6 = new CellModel();
        first_cellModel6.setCellName("2022年专著出版（册）");
        first_cellModel6.setWidth(100);
        first_cellModel6.setStartRow(0);
        first_cellModel6.setEndRow(0);
        first_cellModel6.setStartColumn(11);
        first_cellModel6.setEndColumn(12);

        CellModel first_cellModel7 = new CellModel();
        first_cellModel7.setCellName("2022年申请专利（项）");
        first_cellModel7.setStartRow(0);
        first_cellModel7.setEndRow(0);
        first_cellModel7.setStartColumn(13);
        first_cellModel7.setEndColumn(14);

        CellModel first_cellModel8 = new CellModel();
        first_cellModel8.setCellName("2022年授权专利（项）");
        first_cellModel8.setStartRow(0);
        first_cellModel8.setEndRow(0);
        first_cellModel8.setStartColumn(15);
        first_cellModel8.setEndColumn(16);

        CellModel first_cellModel9 = new CellModel();
        first_cellModel9.setCellName("2022年学术交流（次）");
        first_cellModel9.setStartRow(0);
        first_cellModel9.setEndRow(0);
        first_cellModel9.setStartColumn(17);
        first_cellModel9.setEndColumn(18);

        CellModel first_cellModel10 = new CellModel();
        first_cellModel10.setCellName("2022年人才培养（人）");
        first_cellModel10.setStartRow(0);
        first_cellModel10.setEndRow(0);
        first_cellModel10.setStartColumn(19);
        first_cellModel10.setEndColumn(20);

        CellModel first_cellModel11 = new CellModel();
        first_cellModel11.setCellName("2022年培育新立项纵向项目（项）");
        first_cellModel11.setStartRow(0);
        first_cellModel11.setEndRow(1);
        first_cellModel11.setStartColumn(21);
        first_cellModel11.setEndColumn(21);

        CellModel first_cellModel12 = new CellModel();
        first_cellModel12.setCellName("2022年获得省部级及以上科技奖励（项）");
        first_cellModel12.setStartRow(0);
        first_cellModel12.setEndRow(1);
        first_cellModel12.setStartColumn(22);
        first_cellModel12.setEndColumn(22);

        firstRow.add(first_cellModel1);
        firstRow.add(first_cellModel2);
        firstRow.add(first_cellModel3);
        firstRow.add(first_cellModel4);
        firstRow.add(first_cellModel5);
        firstRow.add(first_cellModel6);
        firstRow.add(first_cellModel7);
        firstRow.add(first_cellModel8);
        firstRow.add(first_cellModel9);
        firstRow.add(first_cellModel10);
        firstRow.add(first_cellModel11);
        firstRow.add(first_cellModel12);
        //第二行表头数据
        List<CellModel> secondRow = new ArrayList<CellModel>();
        CellModel second_cellModel1 = new CellModel();
        second_cellModel1.setCellName("发表学术论文总计");
        second_cellModel1.setStartRow(1);
        second_cellModel1.setEndRow(1);
        second_cellModel1.setStartColumn(4);
        second_cellModel1.setEndColumn(4);

        CellModel second_cellModel2 = new CellModel();
        second_cellModel2.setCellName("英文论文");
        second_cellModel2.setStartRow(1);
        second_cellModel2.setEndRow(1);
        second_cellModel2.setStartColumn(5);
        second_cellModel2.setEndColumn(5);

        CellModel second_cellModel3 = new CellModel();
        second_cellModel3.setCellName("SCI");
        second_cellModel3.setStartRow(1);
        second_cellModel3.setWidth(10);
        second_cellModel3.setEndRow(1);
        second_cellModel3.setStartColumn(6);
        second_cellModel3.setEndColumn(6);

        CellModel second_cellModel4 = new CellModel();
        second_cellModel4.setCellName("EI");
        second_cellModel4.setStartRow(1);
        second_cellModel4.setEndRow(1);
        second_cellModel4.setWidth(10);
        second_cellModel4.setStartColumn(7);
        second_cellModel4.setEndColumn(7);

        CellModel second_cellModel5 = new CellModel();
        second_cellModel5.setCellName("国内核心");
        second_cellModel5.setStartRow(1);
        second_cellModel5.setEndRow(1);
        second_cellModel5.setStartColumn(8);
        second_cellModel5.setEndColumn(8);

        CellModel second_cellModel6 = new CellModel();
        second_cellModel6.setCellName("国外学术期刊");
        second_cellModel6.setStartRow(1);
        second_cellModel6.setEndRow(1);
        second_cellModel6.setStartColumn(9);
        second_cellModel6.setEndColumn(9);

        CellModel second_cellModel7 = new CellModel();
        second_cellModel7.setCellName("其他");
        second_cellModel7.setStartRow(1);
        second_cellModel7.setEndRow(1);
        second_cellModel7.setStartColumn(10);
        second_cellModel7.setEndColumn(10);

        CellModel second_cellModel8 = new CellModel();
        second_cellModel8.setCellName("主编");
        second_cellModel8.setStartRow(1);
        second_cellModel8.setEndRow(1);
        second_cellModel8.setStartColumn(11);
        second_cellModel8.setEndColumn(11);

        CellModel second_cellModel9 = new CellModel();
        second_cellModel9.setCellName("参编");
        second_cellModel9.setStartRow(1);
        second_cellModel9.setEndRow(1);
        second_cellModel9.setStartColumn(12);
        second_cellModel9.setEndColumn(12);

        CellModel second_cellModel10 = new CellModel();
        second_cellModel10.setCellName("发明专利");
        second_cellModel10.setStartRow(1);
        second_cellModel10.setEndRow(1);
        second_cellModel10.setStartColumn(13);
        second_cellModel10.setEndColumn(13);

        CellModel second_cellModel11 = new CellModel();
        second_cellModel11.setCellName("其他专利");
        second_cellModel11.setStartRow(1);
        second_cellModel11.setEndRow(1);
        second_cellModel11.setStartColumn(14);
        second_cellModel11.setEndColumn(14);

        CellModel second_cellModel12 = new CellModel();
        second_cellModel12.setCellName("发明专利");
        second_cellModel12.setStartRow(1);
        second_cellModel12.setEndRow(1);
        second_cellModel12.setStartColumn(15);
        second_cellModel12.setEndColumn(15);

        CellModel second_cellModel13 = new CellModel();
        second_cellModel13.setCellName("其他专利");
        second_cellModel13.setStartRow(1);
        second_cellModel13.setEndRow(1);
        second_cellModel13.setStartColumn(16);
        second_cellModel13.setEndColumn(16);

        CellModel second_cellModel14 = new CellModel();
        second_cellModel14.setCellName("举办学术会议");
        second_cellModel14.setStartRow(1);
        second_cellModel14.setEndRow(1);
        second_cellModel14.setStartColumn(17);
        second_cellModel14.setEndColumn(17);

        CellModel second_cellModel15 = new CellModel();
        second_cellModel15.setCellName("参加学术会议");
        second_cellModel15.setStartRow(1);
        second_cellModel15.setEndRow(1);
        second_cellModel15.setStartColumn(18);
        second_cellModel15.setEndColumn(18);

        CellModel second_cellModel16 = new CellModel();
        second_cellModel16.setCellName("博士");
        second_cellModel16.setStartRow(1);
        second_cellModel16.setEndRow(1);
        second_cellModel16.setStartColumn(19);
        second_cellModel16.setEndColumn(19);

        CellModel second_cellModel17 = new CellModel();
        second_cellModel17.setCellName("硕士");
        second_cellModel17.setStartRow(1);
        second_cellModel17.setEndRow(1);
        second_cellModel17.setStartColumn(20);
        second_cellModel17.setEndColumn(20);

        secondRow.add(second_cellModel1);
        secondRow.add(second_cellModel2);
        secondRow.add(second_cellModel3);
        secondRow.add(second_cellModel4);
        secondRow.add(second_cellModel5);
        secondRow.add(second_cellModel6);
        secondRow.add(second_cellModel7);
        secondRow.add(second_cellModel8);
        secondRow.add(second_cellModel9);
        secondRow.add(second_cellModel10);
        secondRow.add(second_cellModel11);
        secondRow.add(second_cellModel12);
        secondRow.add(second_cellModel13);
        secondRow.add(second_cellModel14);
        secondRow.add(second_cellModel15);
        secondRow.add(second_cellModel16);
        secondRow.add(second_cellModel17);

        // 组装第一行表头标题
        cellTitleMap.put("0", firstRow);
        // 组装第二行表头标题
        cellTitleMap.put("1", secondRow);
        return cellTitleMap;
    }

    public static void main(String[] args) {
        //向指定的Excel中写入数据
        OutputStream out = null;
        Workbook wb = null;
        try {
            String tabName = "POI-test";
            Map<String, List<CellModel>> excelTitleCel = genExcelTitleCel();

            System.out.println(JSONObject.toJSONString(excelTitleCel));
            List<LinkedHashMap> exportData = new ArrayList<LinkedHashMap>();
            //生成10条行记录
            for (int i = 0; i < 10; i++) {
                LinkedHashMap<String, String> rowPut = new LinkedHashMap<String, String>();
                // 根据实际列数生成数据
                for (int j = 0; j <= 22; j++) {
                    rowPut.put(j + "", "数据11===" + i);
                }
                exportData.add(rowPut);
            }
            System.out.println(JSONObject.toJSONString(exportData));
            // 用于写入文件
            wb = ExportExcelUtil.createCSVUtil("生成Excel测试", new XSSFWorkbook(), excelTitleCel, excelTitleCel.size(),
                    exportData);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\桌面文件\\自用草稿\\" + tabName + ".xlsx");
            wb.write(fos);
            fos.flush();
            fos.close();

            //在servlet/web环境下测试此方法
            // ExportExcelUtil.downloadExcel(excelTitleCel,exportData,"生成Excel测试","生成Excel测试",response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
