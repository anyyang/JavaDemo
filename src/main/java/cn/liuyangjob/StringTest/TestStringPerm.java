package cn.liuyangjob.StringTest;

/**
 * Created by  liuyang
 * 2019/9/3    11:07
 * cn.liuyangjob.StringTest
 * All Right Reserved by liuyang.
 **/

public class TestStringPerm {
    private static final String MESSAGE="taobao";
    public static void main(String [] args) {
        String a ="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
        test3();
    }
    public static void test3(){
        final String a = "ab";
        String b = "abc";
        String c = a + "c";
        String d = "ab" + "c";
        System.out.println("***");
        System.out.println(b == c);// false
        System.out.println(d == c);// false
        System.out.println(b == d);// true
        System.out.println("***");
        final String x = "x";
        String y = "y";
        String z1 = "xy";
        String z2 = x + "y";//只要有一个是变量，结果就在堆中
        String z3 = x + y;
        System.out.println(z1 == z2);// true
        System.out.println(z1 == z3.intern());// true
        System.out.println(z1 == z3);// false
    }}
