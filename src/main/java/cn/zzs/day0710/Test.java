package cn.zzs.day0710;

import java.util.HashMap;
import java.util.Map;
public class Test {
    public static void main(String[] args) {
        String str = "fjekwFDQFjfeAFEajfeo2FAFEjfew";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            Integer count = map.get(ch);
            if (count == null) {
                map.put(ch, 1);
            } else {
                count = count + 1;
                map.put(ch, count);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
