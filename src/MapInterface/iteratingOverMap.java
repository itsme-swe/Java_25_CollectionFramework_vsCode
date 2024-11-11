package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class iteratingOverMap {
  public static void main(String[] args) {

    Map<Integer, String> itm = new LinkedHashMap<>();

    itm.put(1, "Bag");
    itm.put(3, "Pants");
    itm.put(2, "Shirt");
    itm.put(5, "Beer");
    itm.put(4, "Food");

    for (Map.Entry<Integer, String> entries : itm.entrySet()) {
      System.out.println("Key: " + entries.getKey() + ", Value: " + entries.getValue());
    }

  }
}
