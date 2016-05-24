package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 5/24/16.
 */
public class Snake extends Reptile
{
    public Snake()
    {
        this.name = "Snake";
    }
    @Override
    public void makeSound()
    {
        System.out.printf("Ssssssss\n");
    }
}
