// this should only be used when interfacing with legacy code
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("GenTest");
        // calling the Gen constructor w/o = warning
        Gen raw = new Gen(new Double(98.6));
        // cast here as the type is unknown

        double d = (Double) raw.getob();
        System.out.println("value: " + d);
    }
}