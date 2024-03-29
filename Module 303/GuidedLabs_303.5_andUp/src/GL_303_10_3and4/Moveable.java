package GL_303_10_3and4;

public interface Moveable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses
    //public and abstract by default
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate(); //public, final, static

    String moveableString = "I am a static final string inside an interface";


}
