package homework8;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand ="Samsung";
        phone.model = "Galaxy";
        phone.color ="Silver";
        phone.year = 2020;
        phone.price = 1000.00;

        phone.call();

//        System.out.println(" My new phone is  " + phone.brand+ " " + phone.model + " " + phone.year+ " cost me only " +phone.price+ " I'm cool now!!!");

        Phone yourphone = new Phone();
        phone.brand ="Apple";
        phone.model ="Pro";
        phone.color ="Pink";
        phone.price = 1500.00;


        yourphone.callme();

        TV tv = new TV();
        tv.brand ="Samsung 7";
        tv.model = "Series 50";
        tv.color ="Black";
        tv.year = 2019;
        tv.price = 500.00;

        tv.watch();

        Laptop laptop = new Laptop();
        laptop.brand ="Apple";
        laptop.model = "Mac Pro";
        laptop.color ="Grey";
        laptop.year = 2021;
        laptop.price = 2000.00;

        laptop.work();







    }
}
