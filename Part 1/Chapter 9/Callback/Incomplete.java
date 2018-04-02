// incomplete must be abstract as it does not fully implement callback
abstract class Incomplete implements Callback {
    int a, b;
    
    void show() {
        System.out.println(a + " " + b);
    } 
    // ...
}