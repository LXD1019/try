package test.Excel.POI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * home.php?mod=space&uid=686208 vvirster@163.com
 * home.php?mod=space&uid=686237 2022-11-24 15:28
 * @description 复杂表格表头单元格
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CellModel {
    /**
     * 表头列名称
     */
    private String cellName;
    /**
     * 起始行
     */
    private Integer startRow;
    /**
     * 结束行
     */
    private Integer endRow;
    /**
     * 起始列
     */
    private Integer startColumn;

    /**
     * 结束列
     */
    private Integer endColumn;
    /**
     * 设置单元格宽度
     */
    private Integer width;

    // setter getter省略。。
}
