package cn.zzs.day0706;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestOne {

    public static void main(String[] args) {
        List<String> col = new ArrayList<String>();
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");
        print(col);
        printFilterTenChars(col);
        printFilterContainJava(col);
        printFilterRemoveOracle(col);
    }
    public static void  print(Collection col){
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
    public static void  printFilterTenChars(Collection col){
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.length()<10){
                System.out.println("字符小于10的书名："+s);
            }
        }
    }

    public static void  printFilterContainJava(Collection col){
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("Java")){
                System.out.println("包含java的书："+s);
            }
        }
    }


    public static void  printFilterRemoveOracle(Collection col){
        System.out.println("删除oracle");
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("Oracle")){
                System.out.println("删除oracle");
                 it.remove();
            }
            System.out.println(s);
        }
    }
}