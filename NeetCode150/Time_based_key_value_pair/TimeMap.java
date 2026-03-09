package NeetCode150.Time_based_key_value_pair;
import java.util.*;
/*
IMPORTANT QUESTION WITH RESPECT TO INTERVIEW
USE CASES:
distributed systems
databases
caching systems
configuration management
financial systems

This design is useful when we need to store values that change over time and efficiently retrieve the value valid at a specific timestamp. Real-world examples include configuration versioning, stock price tracking, database history, feature flags, and event sourcing systems.

Operation	    Time Complexity
set()	        O(1)
get()	        O(log M)
Binary Search   O(log M)
Resource	    Space Complexity
Stored entries	O(N) */
class TimestampValue{
    public int key;
    public String value;

    public TimestampValue(int key, String value){
        this.key = key;
        this.value = value;
    }
}
public class TimeMap {
    public static Optional<TimestampValue> binarySearch(ArrayList<TimestampValue> arr, int target){
        int left = 0, right = arr.size()-1;
        int matchIdx = -1;
        while(left<=right){
            int mid = left + (right- left) / 2;
            TimestampValue curr = arr.get(mid);
            if(curr.key<=target){
                matchIdx = mid;
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        if(matchIdx == -1){
            return Optional.empty();
        }
        return Optional.of(arr.get(matchIdx));
    }
    Map<String, ArrayList<TimestampValue>> entriesByKey;
    public TimeMap() {
        entriesByKey = new HashMap<>();
    }
    public void set(String key, String value, int timestamp){
        if(!entriesByKey.containsKey(key)){
            entriesByKey.put(key, new ArrayList<>());
        }
        ArrayList<TimestampValue> entry = entriesByKey.get(key);
        entry.add(new TimestampValue(timestamp, value));
    }
    public String get(String key, int timestamp){
        if(!entriesByKey.containsKey(key)){
            return "";
        }
        ArrayList<TimestampValue> value  = entriesByKey.get(key);
        Optional<TimestampValue> time = binarySearch(value, timestamp);
        if(time.isEmpty()){
            return "";
        }
        return time.get().value;
    }
    public static void main(String[] args){
        TimeMap t1 = new TimeMap();
        t1.set("Ritesh","SP",81);
        t1.set("Ritesh","SPL1",100);
        String role = t1.get("Ritesh",85);
        System.out.println("role : "+role);
    }
}
