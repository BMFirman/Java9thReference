// use as BufferedReader to read characters from the console
import java.io.*;

class BRread {
    public static void main(String[] args) {
        char c;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("Enter the character 'q' to quit");
        // read characters
        
        try {
            do {
                c = (char) br.read();
                System.out.println(c);
            } while(c != 'q');
        } catch (IOException e) {
            System.out.println(e);
        } 
    }
}