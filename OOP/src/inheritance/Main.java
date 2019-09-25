package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal("animal", 1,1,32,1);
        Dog dog = new Dog("Dog",21,32,2,1,4);
        Fish fish= new Fish("fish", 12,12,2,2,1);

        animal.eat();
        dog.eat();
        fish.eat();

        dog.move(5);
        animal.move(5);
        fish.move(23);
        fish.swim(23);

    }
}
