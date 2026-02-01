import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        System.out.println("list before swapping " + list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("list after swapping " + list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); // T.C. O(1)
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(13);
        System.out.println(list); // T.C. O(1)
        list.remove(0); // O(N)
        list.set(0, 15); // O(N)
        System.out.println(list);
        System.out.println(list.contains(11)); // O(N)
        System.out.println();
        Collections.sort(list); //sorting in ascending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // Reverse print
        System.out.println("Reverse of arraylist");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("Maximum in an arraylist");
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            // if(max < list.get(i)){
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("maximum is " + max);

        swap(list, 1, 2);
        System.out.println();
        Collections.sort(list);
        System.out.println("Arraylist after sorting "+list);
        
        //Sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in descending order "+list);

        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false) ;

         //two-dimensional arraylist
         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         ArrayList<Integer> subList = new ArrayList<>();
         subList.add(1); subList.add(2); 
         mainList.add(subList);

         ArrayList<Integer> subList2 = new ArrayList<>();
         subList2.add(3); subList2.add(4);
         mainList.add(subList2);

         //Retrieving the 2D arrayList elements
         for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
         }
         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
         ArrayList<Integer> prime = new ArrayList<>();
         prime.add(2); prime.add(3);
         ArrayList<Integer> even = new ArrayList<>();
         even.add(2); even.add(4);
         mainList.add(even);
         mainList.add(prime);
        //  System.out.println(mainlist);
        //  for(int i =0;i<mainList.size();i++){
        //     ArrayList<Integer> curr = mainList.get(i);
        //     for(int j=0;j<curr.size();j++){
        //         System.out.print(curr.get(j)+" ");
        //     }
        //     System.out.println();
        //  }
         System.out.println(mainList);
    }
}
