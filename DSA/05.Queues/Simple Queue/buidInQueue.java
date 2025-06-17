import java.util.*;
class buildInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q); // print the queue
        System.out.println(q.poll()); // remove the element
        System.out.println(q.poll()); // remove the element
        System.out.println(q.remove());  // remove the element same as poll
        System.out.println("PEEK ELEMENT :-"+q.peek()); // return the front element
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q); // print the queue

    }
}