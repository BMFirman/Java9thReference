interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (n) -> {
            String result = "";

            for(int i = n.length()-1; i >= 0 ; i--) {
                result += n.charAt(i);
            }
            return result;
        };

        System.out.println("Original: " + reverse.func("lambda"));

    }
}