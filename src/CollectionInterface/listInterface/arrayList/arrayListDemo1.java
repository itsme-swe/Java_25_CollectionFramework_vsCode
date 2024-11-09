package CollectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayListDemo1 {
  public static void main(String[] args) {

    // Creating ArrayList object using List Interface
    List<Integer> ll = new ArrayList<>();

    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(10);
    ll.add(50);

    System.out.println(ll); // [10, 20, 30, 10, 50]

    System.out.println(ll.size()); // output: 5

    System.out.println();

    ll.remove(2);
    System.out.println(ll); // [10, 20, 10, 50]

    System.out.println(ll.size()); // output: 4

  }

}
