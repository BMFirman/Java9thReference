class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(1, 'i');
        sb.setLength(2);
    }
}