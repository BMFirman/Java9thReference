class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }

    @Override
    T getob() {
        System.out.print("Gen2's getob(): ");
        return ob;
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        // notice the following use the <> operator
        // to force the compiler to infer
        // class-name<type-arg-list > var-name =
        //                      new class-name <>(cons-arg-list);

        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<>(88);
        
        // Create a Gen2 object for Integers.
        Gen2<Integer> iOb2 = new Gen2<>(99);
        
        // Create a Gen2 object for Strings.
        Gen2<String> strOb2 = new Gen2<>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}