package LinkedList;

import java.util.ArrayList;

public class stackImplLinkedList {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(list.isEmpty()){
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
