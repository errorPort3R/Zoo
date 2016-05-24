package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 5/24/16.
 */
public class Dog extends Mammal
{
    public Dog()
    {
        this.name = "Dog";
    }

    @Override
    public void makeSound()
    {
        System.out.printf("Bark\n");
    }
}
