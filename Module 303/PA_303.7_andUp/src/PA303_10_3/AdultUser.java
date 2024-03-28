package PA303_10_3;

public class AdultUser implements Library{
    private int age;
    private String bookType;

    //CONSTRUCTORS
    public AdultUser() {

    }

    public AdultUser(int age) {
        this.age = age;
    }

    public AdultUser(int age, String bookType) {
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

    //METHODS
    @Override
    public void registerAccount(int age) {
        this.setAge(age);
        if(this.getAge() >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else if (this.getAge() <= 11) {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.setBookType(bookType);
        if(this.getBookType().equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
