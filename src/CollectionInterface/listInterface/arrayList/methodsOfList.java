package CollectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class methodsOfList {

  public static void main(String[] args) {

    List<Integer> lst = new ArrayList<>();

    lst.add(10);
    lst.add(5);
    lst.add(2);
    lst.add(20);
    lst.add(15);
    lst.add(22);
    lst.add(30);

    // 💥 Method 1 ⇒ Creating Iterator
    Iterator<Integer> it = lst.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    // Output: 10 5 2 20 15 22 30

    System.out.println();

    // 💥 Method 2 ⇒ Adding element at particular index
    lst.add(1, 40);
    System.out.print(lst); // [10, 40, 5, 2, 20, 15, 22, 30]

    System.out.println();

    // 💥 Method 3 ⇒ Updating element to the list
    lst.set(0, 3);
    System.out.println(lst); // [3, 40, 5, 2, 20, 15, 22, 30]

    // 💥 Method 4 ⇒ Searching element in list
    System.out.println(lst.indexOf(2)); // Output: indexOf method will return index_value of an element

    // 💥 Method 5 ⇒ Accessing particular element in list
    System.out.println(lst.get(4)); // Return an element present at index_value

    // 💥 Method 6 ⇒ Checking if element is present in list or not.
    System.out.println(lst.contains(50)); // Return boolean value false bcoz element is not present in list

    System.out.println(lst.size()); // Return element present in list 8.
  }

}
