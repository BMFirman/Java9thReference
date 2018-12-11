// Demonstrate the arraylist
import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Inital size of al: " + 
                            al.size());

        // Add a few elements to the arraylist
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("G");
        al.add(1, "A2");

        System.out.println("Size of al after addtions: " +
                            al.size());

        // display the contents of al
        System.out.println("Contents of al: " + al);
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after addtions: " +
                            al.size());
        
        System.out.println("Contents of al: " + al);
    }
}
