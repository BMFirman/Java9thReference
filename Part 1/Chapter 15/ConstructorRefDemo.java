interface MyFunc {
    MyClass func(int n); // refs
}

class MyClass {
    private int val;

    // this constructor takes an argument
    MyClass(int v) { // refs
        val = v;
    }

    MyClass() {
        val = 0;
    }

    // ...

    int getVal() {
        return val;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;
        // create instance of MyClass via that constructor reference
        MyClass mc = myClassCons.func(100);

        // use the instance of MyClass just created 
        System.out.println("val in mc is " + mc.getVal());
    }
}