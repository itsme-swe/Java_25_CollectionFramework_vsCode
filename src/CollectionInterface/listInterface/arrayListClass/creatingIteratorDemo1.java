package CollectionInterface.listInterface.arrayListClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class creatingIteratorDemo1 {
  public static void main(String[] args) {

    /*
     * Iterator interface provide the facility of iterating the elements in forward
     * direction only.
     */

    List<String> list = new ArrayList<>();

    list.add("Neha");
    list.add("Shaym");
    list.add("Manoj");
    list.add("Mega");
    list.add("Juhu");

    // Creating iterator top traverse the list
    Iterator<String> its = list.iterator();

    while (its.hasNext()) {
      System.out.println("Elements: " + its.next());
    }

  }

}

/*
 * Output⇒
 * Elements: Neha
 * Elements: Shaym
 * Elements: Manoj
 * Elements: Mega
 * Elements: Juhu
 */
