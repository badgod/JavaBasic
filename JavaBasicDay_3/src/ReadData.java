import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        // File file = new File("score.txt");

        File file = new File(args[0]);

        // System.out.println(file.canRead());

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String firstname = input.next();
            String lastname = input.next();

            int score = input.nextInt();

            System.out.println(firstname + " " + lastname + " " + score);
        }

        input.close();
    }
}
