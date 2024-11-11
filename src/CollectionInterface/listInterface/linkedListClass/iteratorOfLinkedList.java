package CollectionInterface.listInterface.linkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratorOfLinkedList {
  public static void main(String[] args) {

    LinkedList<Integer> lst = new LinkedList<>();

    lst.add(10);
    lst.add(22);
    lst.add(5);
    lst.add(3);

    // This is used for ascending order
    Iterator<Integer> it = lst.iterator();

    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    // Output: 10 22 5 3

    System.out.println();

    // And, this is used for descending order
    Iterator<Integer> x = lst.descendingIterator();

    while (x.hasNext()) {
      System.out.print(x.next() + " ");
    }

    // Output: 3 5 22 10
  }
}
