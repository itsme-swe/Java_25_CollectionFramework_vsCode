package CollectionInterface.setInterface;

import java.util.HashSet;
import java.util.Set;

public class creatingSet {
  public static void main(String[] args) {

    Set<Integer> s = new HashSet<>();

    s.add(5);
    s.add(10);
    s.add(20);
    s.add(2);
    s.add(5);

    System.out.println(s); // output: [2, 20, 5, 10] Set is unordered and don't allow duplicates
  }
}
