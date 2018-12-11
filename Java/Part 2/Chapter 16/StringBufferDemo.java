// StringBuffer()
// StringBuffer(int size)
// StringBuffer(String size)
// StringBuffer(CharSequence chars)
// 16 characters are implicitly accounted for
// int length
// int capacity

// String buffer length vs capacity
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer();
        int i = 4206921;
        sb2.ensureCapacity(i);
        System.out.println("length is the number of chars in sb");
        System.out.println(sb.length());
        System.out.println("capacity is the allocated space orig + 16");
        System.out.println(sb.capacity());
        System.out.println(sb2.capacity());

        // setlength will add n null characters
    }
}