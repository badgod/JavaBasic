public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("A Circle " + c.toString());
        System.out.println("------------------------------------");
        System.out.println("Color is " + c.getColor());
        System.out.println("Radius " + c.getRadius());
        System.out.println("Area is " + c.getArea());
        System.out.println("Perimeter is " + c.getPerimeter());

        Rectangle r = new Rectangle(6.5, 7.5, "Red", false);
        System.out.println("A Rectangle " + r.toString());
        System.out.println("------------------------------------");
        System.out.println("Color is " + r.getColor());
        System.out.println("Width is " + r.getWidth());
        System.out.println("Height is " + r.getHeight());
        //System.out.println("Area is " + r.getArea());
        //System.out.println("Perimeter is " + r.getPerimeter());
    }
}