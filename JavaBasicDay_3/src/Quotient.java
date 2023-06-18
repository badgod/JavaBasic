import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter to number : ");

            int number1 = input.nextInt();
            int number2 = input.nextInt();

            // if (number2 != 0) {
            // System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            // } else {
            // System.out.println("Divisor cannot be zero");
            // }

            int result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.toString() + " !!!!!!");
        } catch (InputMismatchException e) {
            System.out.println("Error Inuput !!!!");
        } catch (Exception e) {
            System.out.println("Process Error : " + e.toString() + " !!!!!!");
        } finally {
            System.out.println("Bye Bye !!!");
        }
    }
}