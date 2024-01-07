public class first_Pro {
    public static void main(String[] args) {
        Pen obj =new Pen();
        obj.setRupees(1000);
        System.out.println(obj.getRupees());
        obj.setColor("black");
        System.out.println(obj.getColor());

    }
}
class Pen{private  String color;
 private     int rupees;

    void setColor(String newColor) {
        color = newColor;
    }
   String getColor(){
        return  color;
    }
    void  setRupees(int dollors){
        rupees = dollors;
    }
    int getRupees(){
        return rupees;
    }
    }

