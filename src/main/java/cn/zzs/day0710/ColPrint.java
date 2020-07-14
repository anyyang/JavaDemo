package cn.zzs.day0710;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColPrint {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("刘备");
        set.add("张飞");
        System.out.println("集合大小: " + set.size());
        Iterator<String> iterable = set.iterator();
        while (iterable.hasNext()) {
            String next = iterable.next();
            System.out.println("iterator:"+next);

        }

       for(String str:set){
           System.out.println("for:"+str);
       }
    }

}
