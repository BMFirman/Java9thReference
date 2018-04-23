import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        // Add elements to the Treeset
        ts.add("Beta");
        ts.add("Alpha");
        ts.add("Eta");
        ts.add("Gamma");
        ts.add("Epsilon");
        ts.add("Omega");

        System.out.println(ts);
        System.out.println(ts.subSet("A", "F"));
    }
}
