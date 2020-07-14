package cn.zzs.day0704;

import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        String[] strs = {"kkbJava", "asdjavaccc", "Jaasdhva", "siaiq", "javacjavaz", "iloveJava"};
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].toUpperCase();
            if (strs[i].contains("JAVA")) {
                strs[i]=  strs[i].replace("JAVA","");
            }
        }
        System.out.println(Arrays.toString(strs));
    }
}
