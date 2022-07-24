package lesson8;

public class Person {
    public String name;
    public String lastName;
    public Integer year;

    public void  introduce(String name){
        System.out.println("Hello, " + name+", My name is " + this.name+ " " + this.lastName+ " - nice to meet you!");
                 //+name+  => belongs to parameters   and   this.name or this.lastName => belongs to the object/class


    }



}
