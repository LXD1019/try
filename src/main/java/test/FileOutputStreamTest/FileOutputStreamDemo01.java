package test.FileOutputStreamTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream三种写入文件方式：
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建文件输入流 指定写入文件：
        // FileOutputStream fos=new FileOutputStream(new File("D:\\桌面\\毕业\\基本信息.txt"));
        String path = "C:\\Users\\Administrator\\Desktop\\桌面文件\\自用草稿\\测试测试\\";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        FileOutputStream fos = new FileOutputStream(path + "111.txt");

        /**
         * 方式一：将指定字节写入文件
         */
        fos.write(97);
        fos.write(98);
        fos.write(99);

        /**
         * 方式二：将指定字节数组写入此文件
         */
        byte[] by={'H','E','L','L','O'};
        fos.write(by);

        /**
         * 方式三：指定片段写入
         */
        //最后一定记得关闭,释放资源
        fos.write(by,1,2);
        fos.close();
    }
}
