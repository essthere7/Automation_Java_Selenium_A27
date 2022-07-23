package lesson8;

import javax.sound.midi.Soundbank;
import java.time.Period;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.year = 1988;
        anna.name = "Anna";
        anna.lastName = "Wilson";


        System.out.println("Name: " + anna.name + " LastName: " + anna.lastName +  "  Year: " + anna.year);

        Person david = new Person();
        david.year = 1985;
        david.name = "David";
        david.lastName = "Peterson";

        System.out.println("Name: " + david.name + " LastName: " + david.lastName +  "  Year: " + david.year);


        Vehicle myCar = new Vehicle();
        myCar.model = "Camry";
        myCar.make = " Toyota";
        myCar.year = 2004;
        myCar.color = " Red Tesla";

        System.out.println(myCar.color);



    }
}
