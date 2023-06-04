import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius = ");
        
        double radius = input.nextDouble();
        double area;


        area = radius * radius * 3.14159;

        System.out.println("Circle Radius " + radius + " = " + area);
    }
}
