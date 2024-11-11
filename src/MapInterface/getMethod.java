package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class getMethod {
  public static void main(String[] args) {

    Map<String, String> mp = new HashMap<>();

    mp.put("in", "India");
    mp.put("pak", "Pakistan");
    mp.put("us", "America");
    mp.put("eu", "Europe");
    mp.put("br", "Brazil");

    System.out.println(mp.get("pak")); // Will return the value correspond to key Pakistan

    System.out.println();
  }
}
