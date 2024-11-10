package CollectionInterface.listInterface.linkedList;

import java.util.LinkedList;

public class peekGetIndexOfMethods {
  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(10);
    ll.add(5);
    ll.add(8);
    ll.add(1);
    ll.add(5);

    System.out.println(ll.peek()); // Output: 10

    System.out.println(ll.indexOf(8)); // Output: 2 is indexValue

    System.out.println(ll.get(3)); // Output: Will return 1 present at indexVal 3.

    System.out.println(ll.lastIndexOf(5)); // Output: 4th indexVal will be returened bcoz it is last occurence
  }
}
