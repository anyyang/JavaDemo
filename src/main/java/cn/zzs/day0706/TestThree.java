package cn.zzs.day0706;

import java.util.ArrayList;

public class TestThree {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStudent> list4 = new ArrayList<>();
        ArrayList<UIStudent> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeacher> list7 = new ArrayList<>();
        ArrayList<UITeacher> list8 = new ArrayList<>();

        //请测试哪些集合可以调用print1()方法
         print1(list1);
         print1(list2);
         print1(list3);
         print1(list4);
         print1(list5);
         print1(list6);
         print1(list7);
         print1(list8);
        //请测试哪些集合可以调用print2()方法
        print2(list2);
        //请测试哪些集合可以调用print3()方法
        print3(list3);
        //请测试哪些集合可以调用print4()方法
        print4(list4);
    }
    //要求：参数可以接收任何泛型的ArrayList参数
    public static void print1(ArrayList list){

    }
    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList<Person> list){
    }
    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList<Student> list){
    }
    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList<JavaStudent> list){
    }

}



class Person {
}

class Student extends Person {
}

class JavaStudent extends Student {
}

class UIStudent extends Student {
}

class Teacher extends Person {
}

class JavaTeacher extends Teacher {
}

class UITeacher extends Teacher {
}