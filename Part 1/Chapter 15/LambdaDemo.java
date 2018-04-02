// a functional interface
interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        // the lambda expression
        myNum = () -> 123.45;

        // call getNum
        System.out.println("A fixed value: " +
                            myNum.getValue());

        // a more complex expression
        myNum = () -> Math.random() * 100;

        System.out.println("A random value: " +
                            myNum.getValue());
        System.out.println("A second random value: " +
                            myNum.getValue());

        // lambdas must be compatable with the method defined by the
        // functional inteface
        /*
        myNum = () -> "123.03"; // ERROR
        */


    }
}