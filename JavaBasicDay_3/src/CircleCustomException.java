public class CircleCustomException extends GeometricObject {
    private double radius;
    private static int numberOfObject;

    public CircleCustomException() {
        radius = 1;
        numberOfObject++;
    }

    public CircleCustomException(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
            numberOfObject++;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public CircleCustomException(double newRadius, String color, boolean filled) {
        radius = newRadius;
        numberOfObject++;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException(radius);
        }
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

    public String toString() {
        return super.toString() + " Radius = " + radius;
    }
}
