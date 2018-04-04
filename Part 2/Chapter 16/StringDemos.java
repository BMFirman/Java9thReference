class StringDemos {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Bailey");
        System.out.println(sb);
        
        sb.append(" Firman");
        System.out.println(sb);

        sb.insert(6, " Mikhailov");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(7, 17);
        System.out.println(sb);
        while (sb.length() != 6) {
            sb.deleteCharAt(sb.length() -1);
        }
        System.out.println(sb);
    }
}