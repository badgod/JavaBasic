import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        double[] myList = new double[5];

        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;

        System.out.println(myList[2]);

        /*
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        */
        
        for (double d : myList) {
            System.out.println(d);
        }

    }
}
