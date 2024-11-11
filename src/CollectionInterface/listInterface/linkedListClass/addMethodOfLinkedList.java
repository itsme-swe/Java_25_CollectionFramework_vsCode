package CollectionInterface.listInterface.linkedListClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class addMethodOfLinkedList {

  public static void main(String[] args) {

    List<Integer> ll = new LinkedList<>();

    ll.add(10);
    ll.add(5);
    ll.add(15);

    System.out.println(ll); // Output: [10, 5, 15]

    ll.addFirst(2);
    ll.addLast(20);

    System.out.println(ll); // Output: [2, 10, 5, 15, 20]

    System.out.println();

    Collection<Integer> cl = new ArrayList<>();

    cl.add(20);
    cl.add(40);

    ll.addAll(cl); // By using addAll() method we are adding collection into existing linked list

    System.out.println(ll); // Output: [2, 10, 5, 15, 20, 20, 40]
  }

}
