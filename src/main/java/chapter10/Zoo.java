package chapter10;

public class Zoo {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feedAnimal(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feedAnimal(sasha);

        sasha = new Cat();
        sasha.makeSound();

        ((Cat) sasha).scratch();
        feedAnimal(sasha);

    }

    public static void feedAnimal(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if(animal instanceof Cat) {
            System.out.println("here's your cat food");
        }

    }
}
