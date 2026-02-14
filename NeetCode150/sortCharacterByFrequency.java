package NeetCode150;
import java.util.*;
class Element implements Comparable<Element>{
    int freq;
    char ch ;
    public Element(int freq, char ch){
        this.freq = freq;
        this.ch = ch;
    }
    public int compareTo(Element that){
        return that.freq - this.freq;
    }
}
public class sortCharacterByFrequency {
    //APPROACH 1
    public static String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Character, Integer> element : map.entrySet()){
            pq.offer(element);
        }
        StringBuilder str = new StringBuilder("");
        while(pq.size()>0){
            int frequency = pq.peek().getValue();
            str.append(String.valueOf(pq.poll().getKey()).repeat(frequency));
        }
        return str.toString();
    }
    //APPROACH 2
    public static String frequencySort2(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Map.Entry<Character, Integer> n : map.entrySet()){
            Element element = new Element(n.getValue(), n.getKey());
            pq.offer(element);
        }
        StringBuilder str = new StringBuilder("");
        while(pq.size()>0){
            Element element = pq.poll();
            while(element.freq>0){
                str.append(element.ch);
                element.freq--;
            }
        }
        return str.toString();
    }
    public static void main(String[] args){
        System.out.println("sorting character using frequency with Approach 1 (without using comparable)");
        String result = frequencySort("treEE");
        System.out.println(result);
        System.out.println("sorting character using frequency with Approach 2 (with using comparable)");
        result = frequencySort2("treEE");
        System.out.println(result);
    }
}
