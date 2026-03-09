package NeetCode150.Time_based_key_value_pair;

import java.util.*;

/*
APPROACH2 (Using HashMap and treeMap)
Operation	 Time Complexity
set()	     O(log M)
get()	     O(log M)
Resource	Space Complexity
Storage	    O(N)
 */
public class TimeMap2 {
    Map<String, TreeMap<Integer, String>> map;

    public TimeMap2() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap == null) {
            return "";
        }
        Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }

    public static void main(String[] args) {
        TimeMap2 t1 = new TimeMap2();
        t1.set("Ritesh", "SP", 81);
        t1.set("Ritesh", "SPL1", 100);
        String role = t1.get("Hitanshu", 85);
        System.out.println("role : " + role);
    }
}
