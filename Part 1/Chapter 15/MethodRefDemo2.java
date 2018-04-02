interface StringFunc {
    String func(String n);
}

class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;

        for(i=str.length()-1; i>=0; i--) {
            result +=str.chatAt(i);
        }
        return result;
    }
}

class MethodRefDemo2 {
    static String stringOP(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        // create a MyStringOps object
        MyStringOps strOps = new MyStringOps();

        // now a method reference to the instance method
        // strReverse is passed to stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " +intStr);
        System.out.println("String reversed: " +outStr);
    }
}