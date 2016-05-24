package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 5/24/16.
 */
public class Animal
{
    String name;
    public void makeSound()
    {
        System.out.printf("Make Sound!\n");
    }
    @Override
    public String toString()
    {
        return name;
    }
}
