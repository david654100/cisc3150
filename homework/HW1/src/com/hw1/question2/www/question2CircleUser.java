package com.hw1.question2.www;
import java.util.Scanner;
import java.text.*;
public class question2CircleUser {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);//creates the reader object to read in data
        DecimalFormat df = new DecimalFormat("#.##");//creates decimal format to hundredth

        System.out.println("enter the radius ");
        do {



            Double n = reader.nextDouble();
            Circle c1 = new Circle(n);

            System.out.println("radius: " + (c1.getRadius())+ " area: " + df.format(c1.getArea()) );
            System.out.println("enter the radius ");


        } while (reader.hasNext());//checks for EOF
    }
}

//i got help from https://stackoverflow.com/questions/8137218/trim-double-to-2-decimal-places
// this explained how to trim trailing decimals
//and also from //https://coderanch.com/t/274770/java/check-EOF-Java
//this explained how to check for EOF in java
