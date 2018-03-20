class Gen<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen(T o, T[] nums) {
        ob = o;

        // this statment is not legal
        // vals = new T[10]; // cant create an array of T

        // this statement is legal
        vals = nums; // it is okay to assign a reference to array
    }
}

class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};

        Gen<Integer> iOb = new Gen<>(50, n);

        // NOT OK
        // Gen<Integer> gens[] = new Gen<Integer>[10];

        Gen<?> gens[] = new Gen<?>[10]; // OK
    }
}