interface StringFunc {
    String func(String n);
}

class LambdasAsArgumentsDemo {
    /*
        this method has a functional interface as the type
        of its first parameter. Thus it can be passed a ref
        to any instance of that interface, including the instance
        created by the lambda expression.
        the second parameter specifies the string to operate on
    */
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {

        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Here is the input string: " + inStr);

        // here a simple extression that uppercases a string
        // is passed to stringOp
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);

        // this passes a block lambda that removes spaces
         outStr = stringOp((str) ->  {
                                String result = "";
                                int i;
                            
                                for(i = 0; i < str.length(); i++)
                                if(str.charAt(i) != ' ')
                                    result += str.charAt(i);

                                return result;
                            }, inStr);
        System.out.println("The string with spaces removed: "
                                                    + outStr);

        // you can also pass a StringFunc instance
        // created by and earlier lambda expression, e.g
        // after this declatration executes, reverese refers
        // to an instance of StringFunc

        StringFunc reverse = (str) ->  {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // now reverse can be passed as a param to stringOp()
        System.out.println("The string reveresed: " +
                                stringOp(reverse, inStr));

    } 
}