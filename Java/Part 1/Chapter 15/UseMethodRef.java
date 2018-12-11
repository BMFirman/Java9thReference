import java.util.*;

class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef {
    // a compare() method compatable with the one defined by comp<T>

/*
return greater than zero if the first argument is greater than the second
zero if the two arguments are equal
and less than zero if the first object is less than the second.
*/

    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        // find the maximum value in al using the compareMC() method
        MyClass maxValObj = 
                        Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + maxValObj.getVal());
    }
}   