class Animal{
    void makesound(){
        System.out.println("Animals makes a sound");
    }
}
// overriding method
class Dog extends Animal{
    @Override

    void makesound(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    @Override

    void makesound(){
        System.out.println("The cat meows");
    }
}

// override class
public class overriding{
    public static void main(String[] args) {
        // instantitating an object of animal
        Animal myAnimal = new Animal();
        myAnimal.makesound();

        // instantitating an object of animal
        Dog myDog = new Dog();
        myDog.makesound();

        // instantitating an object of animal
        Cat myCat = new Cat();
        myCat.makesound();


}}
