package CollectionInterface.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class creatingQueue {
  public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();

    q.offer(10);
    q.offer(20);
    q.offer(5);
    q.offer(25);
    q.offer(15);

    System.out.println(q); // Output: [10, 20, 5, 25, 15]
  }
}
