package GL_303_9;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(calculateBMI(h1));

        System.out.println("Person has: " + h1.getWeight() + " kgs and is " + h1.getHeight() + " meters in height. BMI = " + h1.getBmi());
    }

    public static float calculateBMI(HumanBeing human) {
        return human.getWeight() / (human.getHeight() * human.getHeight());
    }
}
