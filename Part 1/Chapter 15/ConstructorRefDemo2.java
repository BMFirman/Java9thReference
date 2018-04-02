interface MyFunc<T> {
    MyClass<T> func(T n);
}

class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc<String> myClassCons = MyClass<String>::new;
        MyClass<String> mc = myClassCons.func("Sarah");

        System.out.println("val in mc is " + mc.getVal());

    }
}