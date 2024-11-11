package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class creatingMapUsingHashMap {
  public static void main(String[] args) {

    Map<String, String> mapping = new HashMap<>();

    // 1️⃣ put() method is used to add elements in map
    mapping.put("in", "India");
    mapping.put("us", "America");
    mapping.put("pak", "Pakistan");
    mapping.put("eu", "Europe");

    System.out.println(mapping); // Output: {eu=Europe, in=India, pak=Pakistan, us=America}

    Map<String, String> table = new HashMap<>();

    table.put("br", "Brazil");

    table.putAll(mapping); // Adding one map enteries into another map

    System.out.println(table); // Output: {br=Brazil, eu=Europe, in=India, pak=Pakistan, us=America}

  }
}
