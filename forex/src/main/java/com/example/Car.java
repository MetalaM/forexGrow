package com.example;

public class Car {
    int motorVolume = 2;
    String color = "black";
    int whells = 15;
    String fuel = "disel";
    int hp = 120;
    int tankVolume = 55;
    int gasolineConsumption = 8;


    public void availebleDistance(){
        System.out.println(tankVolume / gasolineConsumption * 100 + "km");
    } 


    public void move(){
        System.out.println("moved some distance");
    } 

}
