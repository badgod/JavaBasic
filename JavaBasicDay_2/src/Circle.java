public class Circle extends GeometricObject {
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

    public Circle(double newRadius, String color, boolean filled) {
        radius = newRadius;
        numberOfObject++;
        setColor(color);
        setFilled(filled);
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

    public void printCircle() {
        System.out.print("The Circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    public String toString(){
        return super.toString() + " Radius = " + radius;
    }
}
