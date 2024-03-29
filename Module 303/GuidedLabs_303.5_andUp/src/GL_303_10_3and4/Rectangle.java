package GL_303_10_3and4;

public class Rectangle extends Shape{

    //constructor
    public Rectangle(String color) {
        super.color = color;
    }

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }

    @Override
    public double getArea() {
        return super.width * super.height;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle.");
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }


}
