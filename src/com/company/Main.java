package com.company;
import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import com.sun.org.apache.xpath.internal.operations.Or;
import edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;
import sun.text.normalizer.CharTrie;


public class Main {

    public static void main(String[] args) {
	Animal[] animals=new Animal[2];
    animals[0]=new Tiger();
    animals[1]=new Chicken();
    for (Animal animal: animals){
        System.out.println(animal.makeSound());
        if (animal instanceof Chicken){
            Edible edibler=(Chicken)animal;
            System.out.println(edibler.howToEat());
    }


    }

    Fruit[] fruit1=new Fruit[2];
    fruit1[0]=new Orange();
    fruit1[1]=new Apple();
    for (Fruit fruit: fruit1){
        System.out.println(fruit.howToEat() );


    }
    }
}
