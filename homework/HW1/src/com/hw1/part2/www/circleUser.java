package com.hw1.part2.www;
import java.util.Scanner;
public class circleUser  {
    public static void main(String[] args){


        Scanner reader = new Scanner(System.in);
        System.out.println("enter the radius ");
        Double n = reader.nextDouble();


        while(Scanner.hasNext() )
        {
            Circle c1= new Circle(n);

            System.out.println("radius: "+c1.getRadius()+"area: "+c1.getArea());

        System.out.println("enter the radius ");
        Double n = reader.nextDouble();



    }
}
