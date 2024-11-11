package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class put_putIfAbsentMenthod {
  public static void main(String[] args) {

    // We can maintain our insertion order
    Map<Integer, String> itm = new LinkedHashMap<>();

    itm.put(1, "Bag");
    itm.put(3, "Pants");
    itm.put(2, "Shirt");
    itm.put(5, "Beer");
    itm.put(4, "Food");

    System.out.println(itm); // Output: {1=Bag, 3=Pants, 2=Shirt, 5=Beer, 4=Food}

    itm.putIfAbsent(3, "Pants"); // If entry is not present in map it will add the entry otherwise it will not
    System.out.println(itm); // Output: {1=Bag, 3=Pants, 2=Shirt, 5=Beer, 4=Food}

    itm.putIfAbsent(6, "Salt");
    System.out.println(itm); // Output: {1=Bag, 3=Pants, 2=Shirt, 5=Beer, 4=Food, 6=Salt}

  }
}
