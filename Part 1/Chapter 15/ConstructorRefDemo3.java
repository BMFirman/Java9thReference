// implement a simple class factory using a constructor reference

interface MyFunc<R, T> {
    R func (T n);
}

// a simple generic class
class MyClass<T> {
    private T val;

    // a constructor that takes and argument
    MyClass(T v) {
        val = v;
    }

    // the default constructor not used by this program
    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    // a constructor that takes and argument
    MyClass2(String s) {
        str = s;
    }

    // the default constructor not used by this program
    MyClass2() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

class ConstructorRefDemo3 {
    // a factory method for class objects, the class must
    // have a constructor that takes one parameter of T
    // R specifies the type of the object being created
    static <R,T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // create reference to MyClass constructor
        // refer to constructor that takes an argument
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        // create and instance of MyClass by use of the factory method
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        // use the instance of MyClass just created
        System.out.println("val in mc is " + mc.getVal());

        // now create a different class by use of the factory method
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // create and instacne of MyClass2 by use of the factory method
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");

        // use the instance of myclass just created
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}