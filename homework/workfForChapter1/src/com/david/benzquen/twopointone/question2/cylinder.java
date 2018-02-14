package com.david.benzquen.twopointone.question2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        double area;
        double radius;
        double lenght;
        double volume;
        DecimalFormat df = new DecimalFormat("#.####");
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder");

        radius= input.nextDouble();
        lenght= input.nextDouble();
        area = radius * radius * Math.PI;
        System.out.println("the area is "+df.format(area));
        volume= area * lenght;

        System.out.println("the volume is "+df.format(volume));

    }
}
