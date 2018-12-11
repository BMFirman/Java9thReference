import java.io.*;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        
        String str[] = new String[100];
        
        System.out.println("Enter lines of text.");
        System.out.println("type 'stop' to end.");
        
        for (int i = 0; i<100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }

        System.out.println("Here is your file");
        // display the lines
        for(int i = 0; i<100; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}