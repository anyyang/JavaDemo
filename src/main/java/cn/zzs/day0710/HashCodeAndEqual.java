package cn.zzs.day0710;

import java.util.HashSet;

public class HashCodeAndEqual {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<User>();
        set.add(new User("杰克", 18));
        set.add(new User("肉丝", 17));
        set.add(new User("杰克", 19));
        set.add(new User("肉丝", 16));
        int sum=0;
        for (User u : set) {
            System.out.println(u.getUserName());
            sum+=u.getAge();
        }
        System.out.println(sum/set.size());
    }

}
class User {

    public User(String userName,int age){
        this.userName = userName;
        this.age= age;
    }

    String userName;
    int age;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}