package com.david.benzquen.twopointone.question3;

import java.text.DecimalFormat;
import java.util.*;

public class meterConverter {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter feet" );
        double feet = input.nextDouble();
        System.out.print("Feet: "+feet+" meters: "+df.format(feet*.305));

    }
}
