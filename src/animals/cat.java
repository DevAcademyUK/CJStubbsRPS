package animals;

import java.util.Scanner;

public class cat extends animal{

    cat(String name, String size, int age, String breed) {
        super(name, size, age, breed);
    }

    public void main0(String[] args) {
        createAnimal myCreator = new createAnimal();
        myCreator.getAnimalType();


    String colour;
    Character gender;
    Boolean chipped;
    Boolean vaccinated;
    Scanner myScanner;

    private cat(String name, String size, int age, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.chipped = chipped;
        this.vaccinated = vaccinated;
    }

/*
    private void createCat() {
        System.out.println("What is your dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is your dog?");
        String size = myScanner.nextLine()
        System.out.println("how old is your dog?");
        int age = myScanner.nextInt();
        System.out.println("what breed is the dog?");
        String breed = myScanner.nextLine();
        System.out.println("what colour is your dog?");
        String gender = myScanner.nextLine();




        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);


    }


}

    public void createCat() {
        System.out.println("what is your dogs breed");
        Scanner myScanner;
        String name = myScanner.nextline();
        System.out.println("how big is the dog?");
        String size = myScanner.nextLine()
        System.out.println("how old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("what breed is the dog?");
        String breed = myScanner.nextLine();
        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);
    */
    }
