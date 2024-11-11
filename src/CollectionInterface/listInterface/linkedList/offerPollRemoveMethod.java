package CollectionInterface.listInterface.linkedList;

import java.util.LinkedList;

public class offerPollRemoveMethod {
  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(10);
    ll.add(5);
    ll.add(30);
    ll.add(25);
    ll.add(45);

    System.out.println(ll); // Output: [10, 5, 30, 25, 45]

    ll.offer(20); // add an element as tail in list

    System.out.println(ll); // Output: [10, 5, 30, 25, 45, 20]

    System.out.println(ll.poll()); // remove head of an list 10

    System.out.println(ll); // Output: [5, 30, 25, 45, 20]

    ll.remove(); // work similar to poll() method
    System.out.println(ll);
  }
}
