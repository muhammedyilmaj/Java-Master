package references_object_instance;

import inheritance.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("object", 2, 23, 2, 1, 4);
        // dog is references of Dog Object;
        Dog seconddog = dog;
        // we did't create a new Dog object. We create a new references to Dog object;

        dog.setEyes(5);
        System.out.println(dog.getEyes());// result is 5. Because we change Dog object value.

        Dog newDog= new Dog("Karabaş", 23,23,2,23,4);

        seconddog= newDog;
        seconddog.setEyes(6);
        System.out.println(dog.getEyes()); // it is still 5 because seconddog references  to new Dog Object
        System.out.println(newDog.getEyes());
    }
}
