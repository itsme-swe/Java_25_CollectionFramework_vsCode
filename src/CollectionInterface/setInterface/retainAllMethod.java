package CollectionInterface.setInterface;

import java.util.HashSet;
import java.util.Set;

public class retainAllMethod {
  public static void main(String[] args) {

    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();

    s1.add(1);
    s1.add(2);
    s1.add(3);
    s1.add(4);

    s2.add(3);
    s2.add(4);
    s2.add(5);
    s2.add(6);

    System.out.println(s1); // Output: [1, 2, 3, 4]

    s1.retainAll(s2);

    System.out.println(s1); // Output: [3, 4]

  }
}
