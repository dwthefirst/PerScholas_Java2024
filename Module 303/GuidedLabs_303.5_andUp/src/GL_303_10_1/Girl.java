package GL_303_10_1;

public class Girl extends Person{
    static double ageFactor = 1.3;

    public Girl(String aName) {
        name = "Ms. " + aName;
    }

    @Override
    public String talk() {
        return ("Hello! " + this.jump());
    }

    public String jump() {
        return "I am jumping!";
    }

    public static double lifeSpan() {
        return lifeSpan * ageFactor;
    }
}
