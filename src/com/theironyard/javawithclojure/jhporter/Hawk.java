package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 5/24/16.
 */
public class Hawk extends Bird
{
    public Hawk()
    {
        this.name = "Hawk";
    }
    @Override
    public void makeSound()
    {
        System.out.printf("Cawwww!\n");
    }
}
