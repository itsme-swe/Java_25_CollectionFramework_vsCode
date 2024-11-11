package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class containsKey_containsValueMethod {
  public static void main(String[] args) {

    Map<String, String> mp = new HashMap<>();

    mp.put("in", "India");
    mp.put("pak", "Pakistan");
    mp.put("us", "America");
    mp.put("eu", "Europe");
    mp.put("br", "Brazil");

    System.out.println(mp.containsKey("eu")); // true
    System.out.println(mp.containsKey("usa")); // false

    System.out.println(mp.containsValue("India")); // value
  }
}
