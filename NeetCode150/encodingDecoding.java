package NeetCode150;
import java.util.*;
public class encodingDecoding {

    public static String encode(List<String> enc){
        if(enc.size()==0){
            return Character.toString((char)258);
        }
        String separator = Character.toString((char)257);
        // as ASCII have 256 character that's why we are taking 257th character as separator
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<enc.size(); i++){
            sb.append(enc.get(i));
            sb.append(separator);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static List<String> decode(String s){
        if(s.equals(Character.toString((char)257))){
            return new ArrayList<>();
        }
        String separator = Character.toString((char)257);
        List<String> result = Arrays.asList(s.split(separator,-1));
        return result;
        }
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ritesh", "Rahul", "Rajat");
        String s = encode(list);
        System.out.println("Encoded String is : "+s); 
        List<String> result = decode(s);
        System.out.println("the decoded list is : "+result);
    }
}
