interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc fractorial = (n) -> {
            int result = 1;

            for(int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("3! is: " + fractorial.func(3));
        System.out.println("5! is: " + fractorial.func(30));
    }
}