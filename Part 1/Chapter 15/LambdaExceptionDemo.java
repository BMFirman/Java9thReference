// throw and exception from a lambda expression
interface DoubleNeumericArrayFunc {
    // throws is required for compilation
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("The array is Empty");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args)
        throws EmptyArrayException
    {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // this block lambda computes the average of an array
        DoubleNeumericArrayFunc average = (n) -> {
            double sum = 0;

            if(n.length == 0) {
                throw new EmptyArrayException();
            }

            for(int i  = 0; i < n.length; i++) {
                sum += n[i];
            }

            return sum/n.length;
        };

        System.out.println("The average of the array is: "
                            + average.func(values));

        // this causes an exception
        System.out.println("The average of the array is: "
                            + average.func(new double[0]));

    }
}