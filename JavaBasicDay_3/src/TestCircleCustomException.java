public class TestCircleCustomException {
    public static void main(String[] args) {
        try {
            CircleCustomException c1 = new CircleCustomException(2);
            CircleCustomException c2 = new CircleCustomException(-5);

        } catch (InvalidRadiusException e) {
            System.out.println(e);
        }

        System.out.println(CircleCustomException.getNumberOfObject());
    }
}
