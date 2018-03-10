import java.io.*;

class ShowFile2 {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Please provide a single argument");
            return;
        }
        FileInputStream fin = new FileInputStream(args[0]);
        try(fin) {

            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("And IO Error occured: " + e);
        }
    }
}