class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

class Gen<T> extends NonGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class HierDemo2 {
    public static void main(String[] args) {

        Gen<String> v = new Gen<String>("Hello ", 47);

        System.out.print(v.getob() + " ");
        System.out.println(v.getnum());
    }
}