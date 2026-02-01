import java.util.*;
public class permutationSequence {
    public static String getPermutation(int n, int k){
        ArrayList<Integer> list = new ArrayList<>();
        int fact = 1;
        for(int i=1; i<n; i++){
            fact = fact * i;
            list.add(i);
        }
        list.add(n);
        k = k - 1;
        StringBuilder ans =  new StringBuilder("");
        while(true){
            ans.append(list.get(k/fact));
            list.remove(k/fact);
            if(list.size()==0) break;
            k = k %fact;
            fact = fact / list.size();
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String result = getPermutation(4,24);
        System.out.println(result);
    }
}
