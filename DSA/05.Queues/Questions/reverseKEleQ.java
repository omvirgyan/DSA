import java.util.*;
class reverseKEleQ{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            Stack<Integer> st = new Stack<>();
            while (!queue.isEmpty()) {
                st.push(queue.remove());
            }

            while (!st.isEmpty()) {
                queue.add(st.pop());
            }
            System.out.println(queue);

    }
}