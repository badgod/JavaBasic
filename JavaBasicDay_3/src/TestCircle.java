public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(2);
            Circle c2 = new Circle(-5);

            // System.out.println("Circle c1 Area = " + c1.getArea());
            // System.out.println("Circle c2 Area = " + c2.getArea());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println(Circle.getNumberOfObject());
    }
}
