class Animal {

    public void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  
        myCat.sound(); 
    }
}
