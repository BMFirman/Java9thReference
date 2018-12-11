class Gen<T> {
    T ob; // Declare and object of type T

    // Pass the constructor a reference to
    // an object of type T
    Gen(T o) {
        ob = o;
    }

    // Return ob
    T getob() {
        return ob;
    }

    // show type of T
    void showType() {
        System.out.println("Type of T is "
            + ob.getClass().getName());
    }
}

// demonstrate the generic class
class GenDemo {
    public static void main(String[] args) {
        // create a gen reference for integers
        // notice how the following ensures type safety
        Gen<Integer> iOb = new Gen<Integer> (88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();

        // create a Gen object for Strings
        Gen<String> strOb = new Gen<String> ("Generics Test");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}