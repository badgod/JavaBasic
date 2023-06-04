public class TestCircleClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.6);

        c1.setRadius(5);
        System.out.println("C1 r = " + c1.getRadius() + " Area = " + c1.getArea() + " P = " + c1.getPerimeter());

        c2.setRadius(5);
        System.out.println("C2 r = " + c2.getRadius() + " Area = " + c2.getArea());

        System.out.println("C3 r = " + c3.getRadius() + " Area = " + c3.getArea());

        System.out.println("Number Of Circle = " + Circle.getNumberOfObject());
    }
}
