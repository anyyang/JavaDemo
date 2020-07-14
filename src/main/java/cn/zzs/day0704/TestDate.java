package cn.zzs.day0704;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        // 获取键盘输入的字符串
        String str = sc.next();
        System.out.println("入职日期:" + str);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date inTime = sdf.parse(str);
        long time = System.currentTimeMillis() - inTime.getTime();
        System.out.println("入职年限:" + time / 1000 / 60 / 60 / 24 / 365);
    }
}
