package CollectionInterface.listInterface.stackClass;

import java.util.Stack;

public class peekSearchMethod {
  public static void main(String[] args) {

    Stack<Integer> si = new Stack<>();

    si.add(10);
    si.add(20);
    si.add(5);
    si.add(2);
    si.add(5);

    System.out.println(si); // Output: [10, 20, 5, 2, 5]

    System.out.println(si.peek()); // Output: 5 bcoz it return top item of stack

    System.out.println(si.search(3)); // Return -1 bcoz 3 is not in stack

  }
}
