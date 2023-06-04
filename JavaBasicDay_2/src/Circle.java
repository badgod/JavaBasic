public class Circle {
    private double radius;
    private static int numberOfObject;

    public Circle() {
        radius = 1;
        numberOfObject++;
    }

    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObject++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
