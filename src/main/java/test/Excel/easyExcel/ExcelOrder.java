package test.Excel.easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//生成get、set方法
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成有参构造
public class ExcelOrder {

    // @ExcelProperty：指定当前字段对应excel中的那一列。
    @ExcelProperty("订单编号")
    private String orderId;//订单编号

    @ExcelProperty("商品名称")
    private String tradeName;//商品名称

    @ExcelProperty("成本价")
    private Double costPrice;//成本价

    @ExcelProperty("销售价")
    private Double sellingPrice;//销售价
}
