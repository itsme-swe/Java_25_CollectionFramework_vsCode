package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class keySet_valueSet_entrySetMethod {
  public static void main(String[] args) {

    Map<String, String> mp = new HashMap<>();

    mp.put("in", "India");
    mp.put("pak", "Pakistan");
    mp.put("us", "America");
    mp.put("eu", "Europe");
    mp.put("br", "Brazil");

    // 1️⃣ Will return all the keys of map
    Set<String> keySet = mp.keySet();

    System.out.println(keySet); // Output: [eu, br, in, pak, us]

    // 2️⃣ Will return all the values of map
    Collection<String> keyValue = mp.values();
    System.out.println(keyValue); // Output: [Europe, Brazil, India, Pakistan, America]

    // 3️⃣ Will return key and value together
    Set<Map.Entry<String, String>> entrySet = mp.entrySet();
    System.out.println(entrySet); // Output: [eu=Europe, br=Brazil, in=India, pak=Pakistan, us=America]
  }
}
