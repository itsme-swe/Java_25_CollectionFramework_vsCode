package CollectionInterface.listInterface.arrayListClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingList {
  public static void main(String[] args) {

    // By using sort method we can sort list in ascending or descending order

    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(12);
    list.add(9);
    list.add(5);
    list.add(20);
    list.add(2);

    Collections.sort(list);
    System.out.println("List in Ascending order: " + list); // Output:List in Ascending order: [2, 5, 9, 10, 12, 20]

    System.out.println();

    Collections.sort(list, Collections.reverseOrder());
    System.out.println("List in descending order: " + list); // Output: List in descending order: [20, 12, 10, 9, 5, 2]
  }

}
