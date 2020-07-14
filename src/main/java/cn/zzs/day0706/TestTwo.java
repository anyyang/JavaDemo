package cn.zzs.day0706;

import java.util.ArrayList;
import java.util.List;

public class TestTwo {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);
        //增强for循环打印出所有
        printALL(list);
        //增强for循环打印出所有
        printBuJiGe(list);
        // 计算不及格的分数的数量，和平均分，并打印计算结果。
        printThree(list);
        //求出最高分，并打印
        printMax(list);

    }


    public static void printALL(List<Double> list) {
        System.out.print("打印所有: ");
        for (Double d : list) {
            System.out.print(" "+d);
        }
        System.out.println();
    }



    private static void printBuJiGe(List<Double> list) {
        for (Double d : list) {
            if (d < 60) {
                System.out.println("不及格分数:"+d);
            }

        }
    }

    public static void printThree(List<Double> list) {
        int count = 0;
        double sum = 0;
        for (Double d : list) {
            if (d < 60) {
                sum = sum +d;
                count ++;
            }
        }
        System.out.println("不及格的数量是："+count);
        System.out.println("平均分是："+sum/list.size());
    }


    private static void printMax(List<Double> list) {
         double  max = 0;
        for (Double d : list) {
           if(d>max){
               max = d;
           }
        }
        System.out.println("最高分是:"+max);
    }

}
