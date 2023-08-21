package test.Excel.easyExcel;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriteTest {

    @Test
    public void excelWrite(){
        //1、创建一个文件对象
        File excelFile = new File("C:\\Users\\Administrator\\Desktop\\桌面文件\\自用草稿\\EasyExcel-test.xlsx");
        //2、判断文件是否存在，不存在则创建一个Excel文件
        if (!excelFile.exists()) {
            try {
                excelFile.createNewFile();//创建一个新的文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //3、指定需要那个class去写。然后写到第一个sheet，名字为模版，然后文件流会自动关闭
        EasyExcel.write(excelFile, ExcelOrder.class).sheet("订单模版").doWrite(data());
    }

    private List<ExcelOrder> data(){
        //创建一个List集合
        List excelOrderList = new ArrayList<>();

        /*
         *xls版本的Excel最多一次可写0 ...65535行
         * xlsx 版本的Excel最多一次可写0...1048575行
         */
        //超出报异常：java.lang.IllegalArgumentException: Invalid row number (65536) outside allowable range (0..65535)
        for (int i=0;i<65535;i++){
            ExcelOrder data = new ExcelOrder();
            data.setOrderId("20220224"+(i+1));
            data.setTradeName("商品名称"+i);
            data.setCostPrice(i+5.0);
            data.setSellingPrice(i+10.0);
            excelOrderList.add(data);
        }

        return excelOrderList;//返回list集合
    }
}
