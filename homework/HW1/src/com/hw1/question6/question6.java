package com.hw1.question6;

import java.util.*;

public class question6 {
    public static void main(String[] args){
        int[] circle1= new int[3];
        int[] circle2= new int[3];
        Scanner reader = new Scanner(System.in);//creates the reader object to read in data

        try {
            //reading the data for circle 1
            System.out.println("first the x for circle 1");
            circle1[0] = reader.nextInt();
            System.out.println("next the y for circle 1");
            circle1[1] = reader.nextInt();
            System.out.println("now the radius for circle 1");
            circle1[2] = reader.nextInt();

            //reading in the data for circle2
            System.out.println("first the x for circle 2");
            circle2[0] = reader.nextInt();
            System.out.println("next the y for circle 2");
            circle2[1] = reader.nextInt();
            System.out.println("now the radius for circle 2");
            circle2[2] = reader.nextInt();



            //if there is the wrong input the program will exit
        }catch (InputMismatchException e) {
            System.out.println("Error: wrong imput type");
            System.exit(0);
        }
        reader.close();

        int distancesq = (circle1[0]-circle2[0])*(circle1[0]-circle2[0])+(circle1[1]-circle2[1])*(circle1[1]-circle2[1]);
        int radsq = (circle1[2]+circle2[2])*(circle1[2]+circle2[2]);

        if(distancesq==radsq){
            System.out.println("the circles are touching each other");
        }

        else if (distancesq>radsq){
            System.out.println("the circles are not touching");
        }

        else if (distancesq<radsq){
            System.out.println("the circles are overlapping each other");
        }

    }


}

//https://www.geeksforgeeks.org/check-two-given-circles-touch-intersect/
