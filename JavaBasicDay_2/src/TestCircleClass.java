public class TestCircleClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.6);

        c1.setRadius(5);
        c2.setRadius(5);

        printCircle(c1);
        printCircle(c2);
        printCircle(c3);

        System.out.println("Number Of Circle = " + Circle.getNumberOfObject());
    }

    public static void printCircle(Circle c) {
        System.out.println("C1 r = " + c.getRadius() + " Area = " + c.getArea() + " P = " + c.getPerimeter());
    }
}
