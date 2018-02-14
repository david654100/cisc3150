package com.david.benzquen.twopointone;
import java.util.*;
public class question1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");
        double far=0;
        double cel=0;
        cel=input.nextDouble();
        far=(9/5)*cel+32;
        System.out.println(cel+" Celsius is "+far+" Farenhiet");

    }
}
