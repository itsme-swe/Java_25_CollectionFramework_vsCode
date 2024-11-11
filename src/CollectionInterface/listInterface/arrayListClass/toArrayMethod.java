package CollectionInterface.listInterface.arrayListClass;

import java.util.ArrayList;
import java.util.List;

public class toArrayMethod {
  public static void main(String[] args) {

    // toArray() method is used to convert collection into Object[] array

    List<Integer> ls = new ArrayList<>();

    ls.add(5);
    ls.add(20);
    ls.add(10);
    ls.add(50);
    ls.add(2);

    Object[] arr = ls.toArray();

    for (Object obj : arr) {
      System.out.println(obj);
    }
  }

}
