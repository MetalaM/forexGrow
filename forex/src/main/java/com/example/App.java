package com.example;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car newCar1 = new Car();
        Car newCar2 = new Car();

        newCar2.color = "red";

        System.out.println( newCar1.color);
        System.out.println( newCar1.fuel);
        newCar1.availebleDistance();

        System.out.println("");


        System.out.println( newCar2.color);
        System.out.println( newCar2.fuel);
        newCar2.availebleDistance();

    }
}
