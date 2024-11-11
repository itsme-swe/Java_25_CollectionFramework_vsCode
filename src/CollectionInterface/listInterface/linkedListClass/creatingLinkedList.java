package CollectionInterface.listInterface.linkedListClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class creatingLinkedList {

  public static void main(String[] args) {

    List<Integer> ll = new LinkedList<>();

    ll.add(12);
    ll.add(10);
    ll.add(20);
    ll.add(5);

    System.out.println(ll); // Output: [12, 10, 20, 5]

    System.out.println(ll.contains(20)); // Output: true

    System.out.println(ll.indexOf(5)); // Output: returning an indexValue 3

    // Used to iterate over the LinkedList
    Iterator<Integer> lt = ll.iterator();

    while (lt.hasNext()) {
      System.out.println(lt.next());
    }
  }

}
