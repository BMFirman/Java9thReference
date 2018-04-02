import java.util.function.Function;

class UseFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // this block lambda expression computes the fractorial of an int
        // this time function is the functional interface
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("The factorial of three is: " + factorial.apply(3));
        System.out.println("The factorial of five is: " + factorial.apply(5));
    } 
}