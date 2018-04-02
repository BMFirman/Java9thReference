// T needs to be a comparable object
// it is important that an upperbound be specified
// when using generics
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
// because minmax needs a type that implements comparable the
// implementing class must also specify the same bound
class MyClass<T extends Comparable<T>> implements MinMax<T> {
// this is also possible
// class MyClass implements MinMax<Integer> { // OK
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    // return the minimum number in vals
    public T min() {
        T v = vals[0];

        for(int i=1; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    // return the maximum value in vals
    public T max() {
        T v = vals[0];

        for(int i=1; i < vals.length; i++) {
            if(vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

class GenIfDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        // note characters are compared by the size of thier
        // ascii code
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}