package cn.zzs.day0710;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student stu1 = new Student("zzs", "male", 27);
        Student stu2 = new Student("zzs", "male", 27);
        Student stu3 = new Student("xiaobai", "male", 30);
        Student stu4 = new Student("xiaoming", "male", 27);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        for (Student student : set) {
            System.out.println(student.getName() + "-" + student.getSex() + "-" + student.getAge());
        }
    }
}

class Student {
    String name;
    String sex;
    int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return false;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (o instanceof Student) {
            Student student = (Student) o;
            return name.equals(student.name) && age == student.age;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}