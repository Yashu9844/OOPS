public class Abstarct_Class {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        mouse m = new mouse();
        m.walk();
        //ani an =new ani();           ---------         WE CANT CREATE OBJ FOR ABSTRACT CLASS    -------------
        System.out.println(h.color);//   default Constructor

        h.changeColor();
        m.changeColor();
        System.out.println(  m.color);
    }
}
abstract  class ani{
    String color;
    ani(){
        color="Brown";
    }
    void eat(){
        System.out.println("Eating.....");
    }
    abstract  void walk(); //classes which are not implemented are Called Abstract class

}
class Horse extends  ani{
    void changeColor(){
        color="White";
        System.out.println(color);
    }
    void walk(){
        System.out.println("Walking.....");
    }
}
class mouse extends  ani{
    void changeColor(){
        color="Black";
        System.out.println(color);
    }
    @Override
    void walk() {
        System.out.println("walk fast mouse.....");
    }
}