import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        // final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        title();

        System.out.print("Enter radius = ");

        double radius = input.nextDouble();
        double area;

        if (radius <= 0) {
            System.out.println("Radius Error");
        } else {
            area = calArea(radius);
            System.out.println("Circle Radius " + radius + " = " + area);
        }
    }

    public static void title() {
        System.out.println("Welcome to Java");
        System.out.println("==========================================");
    }

    public static double calArea(double r) {
        double area = r * r * Math.PI;
        return area;
    }
}
