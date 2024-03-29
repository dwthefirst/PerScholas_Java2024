package GL_303_11_1;

public class GMultipleDataType <Thing1, Thing2>{
    Thing1 valueOne;
    Thing2 valueTwo;

    //constructor
    public GMultipleDataType(Thing1 valueOne, Thing2 valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public Thing1 getValueOne() {
        return valueOne;
    }

    public void setValueOne(Thing1 valueOne) {
        this.valueOne = valueOne;
    }

    public Thing2 getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Thing2 valueTwo) {
        this.valueTwo = valueTwo;
    }
}
