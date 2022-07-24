package lesson8;

public class Rectangle {

    public int lenght;
    public int width;

    // Question=>what can i do with the Rectangle? => draw
    public  void draw(){
        System.out.println( " I draw the Rectangle = "+ width + " lenght = "+ lenght);

    }
    public int getArea(){
        return width+lenght;

    }
    public int getPerimetr(){
        return (this.lenght+this.width)*2;
    }
}
