public class TestInterface {
    public static void main(String[] args) {
        Chicken ch = new Chicken();
        Apple ap = new Apple();

        System.out.println(ch.howToEat() + "\n" + ch.sound());
        System.out.println(ap.howToEat());
    }
}

interface Edible {
    public abstract String howToEat();
}

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();
}

class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "Chicken : Fry it";
    }

    @Override
    public String sound() {
        return "Chicken : cock-a-doodle-doo";
    }

}

class Tiger extends Animal {

    @Override
    public String sound() {
        return "Tiger : RROOAARR";
    }

}

abstract class Fruit implements Edible {

}

class Apple extends Fruit {

    @Override
    public String howToEat() {
        return "Apple : Make apple cider";
    }

}
