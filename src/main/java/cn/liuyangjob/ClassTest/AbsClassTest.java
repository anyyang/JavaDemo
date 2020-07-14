package cn.liuyangjob.ClassTest;


 interface Inter {
    public abstract void print();
}

public class AbsClassTest {
    public static void main(String[] args) {
        new Inter() {
            @Override
            public void print() {
                System.out.println("你好匿名内部类");
            }
        }.print();
    }
    public static void print() {
        System.out.println("print");
    }
}