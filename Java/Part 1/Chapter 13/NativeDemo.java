// a simple example that uses the native method
public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();

        ob.i = 10;
        System.out.println("This is ob.i before the native method"
            + ob.i);
        ob.test();
        System.out.println("This is ob.i after the native method"
            + ob.i);
    }

    // declare the native method
    public native void test() ;

    // load DLL that contains the static method
    static {
        System.loadLibrary("NativeDemo");
    }

}