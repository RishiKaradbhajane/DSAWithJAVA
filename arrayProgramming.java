import java.util.*;

public class arrayProgramming {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key)
                return i;
        }
        return -1;
    }

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; // -INFINITY
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest)
                largest = number[i];
        }
        return largest;

    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        int temp = 0;
        while (start <= end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void pairInArray(int numbr[]) {
        for (int i = 0; i <= numbr.length; i++) {
            int curr = numbr[i];
            int j = 0;
            for (j = i + 1; j <= numbr.length; j++) {
                System.out.print(curr + numbr[j] + " ,");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int marks[]= {33,45,33};
        // update(marks);
        // int marks[] = new int [100];
        // System.out.println("enter the values");
        // Scanner sc = new Scanner(System.in);
        // // int phy = sc.nextInt();
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy "+ marks[0]);n
        // System.out.println("che "+ marks[1]);
        // System.out.println("maths "+ marks[2]);
        // System.out.println(marks.length);

        // int number[]={10,14,13,67,34,56};
        // int key = 13;
        // int index=linearSearch(number, 13);
        // if(index== -1)
        // System.out.println("Not Found");
        // else
        // System.out.println("key is found at index "+ index);

        // int number[]={10,14,13,67,34,56};
        // System.out.println("largest value is "+ getLargest(number));

        // int numbers[]={2,4,6,8,10,12};
        // int key =6;
        // reverseArray(numbers);
        // for(int i=0; i<=numbers.length; i++){
        // System.out.print(numbers[i]+" ");}
        // System.out.println();

        int numbr[] = { 2, 4, 6, 8, 10, 12 };
        int f = binarySearch(numbr, 7);
        System.out.println(f);
        // pairInArray(numbr);
        System.out.println(numbr);

    }
}
