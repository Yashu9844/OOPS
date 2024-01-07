class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal2 {
    void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    void display() {
        // Calling the eat method of the immediate parent class (Animal2)
        super.eat();
        bark();
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}