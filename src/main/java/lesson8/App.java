package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.year = 1988;
        anna.name = "Anna";
        anna.lastName = "Wilson";


        System.out.println("Name: " + anna.name + " LastName: " + anna.lastName +  "  Year: " + anna.year);

        Person david = new Person();  // When I use "new" that means I'm creating the new object
        david.year = 1985;
        david.name = "David";
        david.lastName = "Peterson";

        System.out.println("Name: " + david.name + " LastName: " + david.lastName +  "  Year: " + david.year);


        Vehicle myCar = new Vehicle();   // "myCar" => this is an object
        myCar.model = "Camry";
        myCar.make = " Toyota";
        myCar.year = 2004;
        myCar.color = " Red Tesla";

        System.out.println(myCar.color);

        Vehicle myFriendCar = new Vehicle();  // "myFriendCar" => this is an object
        myFriendCar.make = "Tesla";
        myFriendCar.model =  "Model S";
        myFriendCar.color = "Red";
        myFriendCar.year = 2021;


        // Here I have a function inside the class that is called Method
        myCar.drive();   // invoking/calling the drive method (invoking drive from myCar)
        myFriendCar.drive();

        anna.introduce("Alex"); //call method
        david.introduce("Jane");

        Fruit myFruit = new Fruit();
        myFruit.name = "apple";
        myFruit.color = "red";
        // now we can creat and discribe how it works


        Rectangle r1 = new Rectangle();
        r1.lenght= 5;
        r1.width=7;

        r1.draw();

        Rectangle r2 = new Rectangle();
        r2.lenght = 9;
        r2.width = 4;

        r2.draw();

        int totalArea = r1.getArea() + r2.getArea();

        System.out.println("Total Area = " + totalArea);


        Pet lucky = new Pet();
        lucky.type = "Cats";
        lucky.breed = "British Shorthai";
        lucky.owner = "Alf";
        lucky.name = "Lucky";

        lucky.printInfo();






    }
}
