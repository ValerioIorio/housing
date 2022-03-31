package com.generation.housing.controller.main;

import com.generation.housing.model.entities.Room;

public class main 
{
    public static void main(String[] args) 
    {
           Room room = new Room(5,6);

           int sqm = 800;

           System.out.println(room.getArea()*sqm);
    }   
}
