import java.util.*;

class ArrayQueueDemo {
    public static void main(String[] args) {
        // Create an array deque
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // Use an ArrayDeque like a stack
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("E");

        System.out.println("Popping the stack");

        while(adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }

        System.out.println();
    }
}
