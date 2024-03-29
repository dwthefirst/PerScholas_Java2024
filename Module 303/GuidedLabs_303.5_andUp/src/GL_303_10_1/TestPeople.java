package GL_303_10_1;

import java.util.ArrayList;

public class TestPeople {
    public static void main(String[] args) {
//        Person a = new Boy();
//        Boy b = new Boy();
//        doPersonStuff(a);
//        doPersonStuff(b);
//        System.out.println(Person.ageFactor);
//        System.out.println(Boy.ageFactor);
        //System.out.println(a.talk());

        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        //Boy b = new Person(); //Throw Error
        //Girl g = new Person("Betty"); //Throw Error

        doPersonStuff(aPerson);
        doPersonStuff(jimmy);
        doPersonStuff(betty);
        doPersonStuff((Person) jimmy);
        doPersonStuff((Person) betty);

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        //System.out.println(((Boy)aPerson).talk());

//        System.out.println((Person)jimmy);
//        System.out.println(((Person)jimmy).talk());
//        System.out.println(((Person)jimmy).walk());
//        System.out.println();
    }
    static void doPersonStuff(Person person) {
        System.out.println(person);
        System.out.println(person.talk());
        System.out.println(person.walk());
        System.out.println();
    }
}
