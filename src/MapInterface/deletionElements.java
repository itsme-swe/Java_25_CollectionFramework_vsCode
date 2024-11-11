package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class deletionElements {
  public static void main(String[] args) {

    Map<String, String> mp = new HashMap<>();

    mp.put("in", "India");
    mp.put("pak", "Pakistan");
    mp.put("us", "America");
    mp.put("eu", "Europe");
    mp.put("br", "Brazil");

    System.out.println(mp); // Output: {eu=Europe, br=Brazil, in=India, pak=Pakistan, us=America}

    mp.remove("eu");
    System.out.println(mp); // Output: {br=Brazil, in=India, pak=Pakistan, us=America}

    System.out.println(mp.size()); // 4

    mp.clear();
    System.out.println(mp); // Output: {} To make map fully empty
  }
}
