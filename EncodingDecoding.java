import java.util.ArrayList;
import java.util.List;

public class EncodingDecoding {
    public static String encode(List<String> strs){
        if(strs.size() == 0){
            return Character.toString((char)258);
        }
        String separator = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s);
            sb.append(separator);
        }
        sb.deleteCharAt( sb.length()-1);
        return sb.toString();
    }

    // Decodes a single sgtring to a list of strings..
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() == 1 && s.charAt(0) == (char) 258) {
            return result;
        }
        String separator = Character.toString((char) 257);
        for (String str : s.split(separator)) {
            result.add(str);
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add("This");
        str.add("is");
        str.add("Java");
        String encodedString = encode(str);
        System.out.println("Encoded String: " + encodedString);
        List<String> decodedList = decode(encodedString);
        for (String s : decodedList) {
            System.out.print(s + " ");
        }
        System.out.println("\n"+(char)(260));
    } 
}
