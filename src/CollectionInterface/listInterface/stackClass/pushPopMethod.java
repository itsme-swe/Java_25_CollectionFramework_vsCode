package CollectionInterface.listInterface.stackClass;

import java.util.Iterator;
import java.util.Stack;

public class pushPopMethod {
  public static void main(String[] args) {

    Stack<String> st = new Stack<>();

    st.push("Harsh");
    st.push("Mukul");
    st.push("Juhu");
    st.push("Vandana");
    st.push("Gaurav");

    Iterator<String> str = st.iterator();

    while (str.hasNext()) {
      System.out.println(str.next());

    }

    System.out.println();

    // Output: Harsh Mukul Juhu Vandana Gaurav

    st.pop();

    System.out.println(st); // Output: [Harsh, Mukul, Juhu, Vandana]
  }
}
