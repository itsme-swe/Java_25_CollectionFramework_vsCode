package CollectionInterface.queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class offer_poll_peekMethod {
  public static void main(String[] args) {

    Queue<Integer> q = new PriorityQueue<>();

    // We generally used offer() insread of add() bcoz add() method throws an
    // exception.
    q.offer(10);
    q.offer(15);
    q.offer(12);
    q.offer(20);
    q.offer(10);

    System.out.println(q); // Output: [10, 10, 12, 20, 15]

    Iterator<Integer> qi = q.iterator();

    while (qi.hasNext()) {
      System.out.println(qi.next());
    }

    System.out.println(q.poll()); // Return and remove head of the queue 10
    System.out.println(q); // Output: [10, 15, 12, 20]

    System.out.println(q.peek()); // Output: 10

  }
}
