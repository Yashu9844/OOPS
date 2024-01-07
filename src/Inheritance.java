public class Inheritance {
    public static void main(String[] args) {
        Tiger obj = new Tiger();

        obj.eat();
        obj.Barking();
        obj.sleep();
    }
}
class Animal{
    void  eat(){
        System.out.println("Eating....");}
        void sleep(){
            System.out.println("Sleeping.....");
        }
    }

class Tiger extends  Animal{
    void Barking() {
        System.out.println("Bark.. Bark...");
    }void running(){
        System.out.println("run...run...");
        }
    }

