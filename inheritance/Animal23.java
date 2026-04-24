class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

class Puppy extends Dog {

    Puppy(String name, String breed) {
        super(name, breed);
        System.out.println("Puppy constructor");
    }

    void play() {
        System.out.println(name + " is playing");
    }
}

class AnimalRunner {
    public static void main(String[] args) {

        Puppy puppy = new Puppy("Bruno", "Labrador");

        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}