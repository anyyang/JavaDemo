package cn.zzs.day0713;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        //1. 提供读入,写出的文件
        File file1 = new File("a.png");
        File file2 = new File("b.png");
        //2. 提供相应的流
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //3. 实现文件的复制
            byte[] b = new byte[5];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
            fos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
