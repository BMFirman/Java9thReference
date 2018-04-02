class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}

class BridgeDemo {
    public static void main(String[] args) {
        Gen2 strob = new Gen2("Build a bridge");
        System.out.println(strob.getob());
    }
}