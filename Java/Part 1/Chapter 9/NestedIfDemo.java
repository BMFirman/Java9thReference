// a nested interface example
// this class contains a memeber interface
class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
// b implements the nested interface
// don't forget to use fully qualified names and
// make implementations public 
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIfDemo {
    public static void main(String[] args) {
        // Used the nested interface reference
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if(nif.isNotNegative(-12)) {
            // isNotNegative will return false, below is not executed
            System.out.println("this wont be displayed");
        }
    }
}