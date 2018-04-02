// capture a local variable from the enclosing scope
interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {

        // a local variable can be captured
        int num = 10;

        MyFunc myLambda = (n) -> {
            // this use of num is okay, no modification
            int v = num + n;

            // this is illegal, num cant be modified
            // num++;

            return v;
        };

        // recall:
        // to use a lambda; nameLambda.funcNameInInterface
        System.out.println(myLambda.func(59));
    }
}