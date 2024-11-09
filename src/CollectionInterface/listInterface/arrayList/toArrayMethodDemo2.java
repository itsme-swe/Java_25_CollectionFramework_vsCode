package CollectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class toArrayMethodDemo2 {
  public static void main(String[] args) {

    /*
     * toArray(T[] a) this variant allow us to specify the type of array. It takes
     * an array as an argument and returns an array as same type.
     */

    List<String> lst = new ArrayList<>();

    lst.add("Harsh");
    lst.add("Mukul");
    lst.add("Juhu");
    lst.add("Vandana");

    String[] str = lst.toArray(new String[0]);

    for (String ele : str) {
      System.out.print(ele + " ");
    }

    // Output: Harsh Mukul Juhu Vandana
  }

}
