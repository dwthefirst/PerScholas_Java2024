package PA303_10_3;

public class KidUser implements Library {
    //instance variables
    private int age;
    private String bookType;

    public KidUser() {
    }

    public KidUser(int age) {
        this.age = age;
    }

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount(int age) {
        this.setAge(age);
        if(this.getAge() <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else if(this.getAge() > 11) {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.setBookType(bookType);
        if(this.getBookType().equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
