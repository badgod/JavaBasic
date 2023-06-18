import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileClass {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("score.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        } else {
            PrintWriter output = new PrintWriter(file);
            output.print("Jack Supod ");
            output.println(90);
            output.print("Jame Som ");
            output.println(80);

            output.close();
        }
    }
}