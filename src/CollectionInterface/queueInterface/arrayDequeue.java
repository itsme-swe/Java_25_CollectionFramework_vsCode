package CollectionInterface.queueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDequeue {
  public static void main(String[] args) {

    Deque<Integer> dq = new ArrayDeque<>();

    dq.offer(10);
    dq.offer(20);
    dq.offer(15);

    System.out.println(dq); // Output: [10, 20, 15]

    dq.offerFirst(30); // add element from head side
    dq.offerLast(40); // addd element in rear of the queue

    System.out.println(dq); // Output: [30, 10, 20, 15, 40]
  }
}
