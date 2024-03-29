package GL_303_10_3and4;

//cannot be instantiated or create an object (no constructors) subclasses have to implement
public abstract class Shape {
    //instance variables
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    //methods

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // The getArea method is abstract.
    // It must be overridden in a subclass.
    ///** All shapes must provide a method called getArea() */.
    public abstract double getArea();

    public String toString() {
        return "Shape[color=]" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a shape");
    }

}
