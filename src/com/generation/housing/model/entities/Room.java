package com.generation.housing.model.entities;

public class Room 
{
    int side1,side2;

    public Room(int side1, int side2) 
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getArea()
    {
        return side1*side2;
    }
}
