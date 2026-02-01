
public class lecture12 {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch =   Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressionString(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            if(count>1){
                newStr = newStr + count.toString();
            }
        }  
        return newStr;         
    }
    public static void main(String args[]){
        String str ="Hello World";
        // System.out.println(str,0,5);

        String fruits[] = {"apple", "MANGO","banana"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

        StringBuilder sc = new StringBuilder("");
        for(char ch ='a'; ch<='z';ch++){            
        sc.append(ch);
        }
        System.out.println(sc);
        System.out.println(toUpperCase(str));
        String abc = "ssscccddd";
        System.out.println(compressionString(abc));

    }
}