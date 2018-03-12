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
}

class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb = new Gen2<String>("Generics Test");

        if(iOb2 instanceof Gen2<?>) {
            System.out.println("iOb2 is an instance of Gen2");
        }
        if(iOb2 instanceof Gen<?>) {
            System.out.println("iOb2 is an instance of Gen");
        }

        System.out.println(" ");

        if(strOb instanceof Gen2<?>) {
            System.out.println("strOb is an instance of Gen2");
        }

        if(strOb instanceof Gen<?>) {
            System.out.println("strOb is an instance of Gen");
        }

        System.out.println(" ");

        if(iOb instanceof Gen<?>) {
            System.out.println("iOb is an instance of Gen");
        }
        // this cannot be compiled generic info doesn't exist
        // at run time
        /*
        if(iOb2 instanceof Gen2<Integer>) {
            System.out.println("iOb2 is an instance of Gen2");
        }
        */
    }
}