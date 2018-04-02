// define an integer stack interface
interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item

    // becuase clear has a default other classes dont
    // have to be updated
    default void clear() {
        System.out.println("clear() not implemented");
    }
}