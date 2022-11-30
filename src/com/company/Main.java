package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Generic Animal", "Huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        //note that 'dog' object can be passed as an 'animal' object parameter since it is in a subclass of Animal

        Dog retriever = new Dog ("Labrador Retriever", 65,"Floppy", "Swimmer");
        //calls the 4 parameter and uses ternary for 'size' --> calls super
        doAnimalStuff(retriever,"slow");

        Dog yorkie = new Dog ("Yorkie", 15);
        //calls the 2 parameter Dog constructor --> calls the super
        doAnimalStuff(yorkie, "fast");

        Dog wolf = new Dog("wolf", 200, "pointy", "fluffy");
        doAnimalStuff(wolf,"fast");

        Fish fishy = new Fish("Guppie", 2, 4, 3);
        doAnimalStuff(fishy,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal); // executes the 'toString' method from the MOST specific class. if just an
        //animal instance, will call the animal 'toString' method, but if is a Dog object then it will call the
        //'toString' method form the dog class
        System.out.println("_ _ _ _");
    }


}
