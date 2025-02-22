class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // pass the constructos a reference
    // to an array of type number or subclass
    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();

        }
         
        return sum/nums.length;
    }
}

class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double x = dob.average();
        System.out.println("dob average is " + x);

        /*
            this wont compile as string is not a subclass
            of number

        String strs[] = {"1", "2", "3", "4", "5"};
        Stats<String> strob = new Stats<String>(strs);
        double x = strob.average();
        System.out.println("strob average is " + x);
        */
   }
}