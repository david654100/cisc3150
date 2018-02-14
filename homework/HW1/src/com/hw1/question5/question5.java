package com.hw1.question5;
//https://www.geeksforgeeks.org/arrays-in-java/
//https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html
//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
//http://www.mathwarehouse.com/algebra/distance_formula/index.php
import java.util.*;

public class question5 {


    public static void main(String[] args) {

        //declaring the vars that will hold the distance of the sides
        double side1;//between point A and B
        double side2;//between point B and C
        double side3;//between point C and A

        //declaring the points as an array x is position 0 and y is position 1
        double[] pointA = new double[2];
        double[] pointB = new double[2];
        double[] pointC = new double[2];

        Scanner reader = new Scanner(System.in);//creates the reader object to read in data
            System.out.println("please print in the points");
        try {
            //reading the data for point A
            System.out.println("first the x for point A");
            pointA[0] = reader.nextDouble();
            System.out.println("next the y for point A");
            pointA[1] = reader.nextDouble();


            //reading in the data for point B
            System.out.println("first the x for point B");
            pointB[0] = reader.nextDouble();
            System.out.println("next the y for point B");
            pointB[1] = reader.nextDouble();

            System.out.println("first the x for point C");
            pointC[0] = reader.nextDouble();
            System.out.println("next the y for point C");
            pointC[1] =reader.nextDouble();

        //if there is the wrong input the program will exit
        }catch (InputMismatchException e) {
            System.out.println("Error: wrong imput type");
            System.exit(0);
        }

        reader.close();

        //calculating the distances of the sides

        side1= Math.sqrt((Math.pow((pointB[0] - pointA[0]), 2)) + (Math.pow((pointB[1] - pointA[1]), 2)));
        side2= Math.sqrt((Math.pow((pointC[0] - pointB[0]), 2)) + (Math.pow((pointC[1] - pointB[1]), 2)));
        side3= Math.sqrt((Math.pow((pointA[0] - pointC[0]), 2)) + (Math.pow((pointA[1] - pointC[1]), 2)));


        //testing to see if the triangle is real
        int counter = 0;

        if ((side1+side2)>side3){
            counter++;
        }

        if ((side1+side3)>side2){
            counter++;
        }

        if ((side2+side3)>side1){
            counter++;
        }

        if (counter==3){
            System.out.println("this is a real triangle");
        }
        else{
            System.out.println("this is a fake triangle");
        }

    }

}
//these are thw websites that helped me out
//https://www.geeksforgeeks.org/arrays-in-java/
//https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html
//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
//http://www.mathwarehouse.com/algebra/distance_formula/index.php