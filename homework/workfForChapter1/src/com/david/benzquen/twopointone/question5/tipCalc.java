package com.david.benzquen.twopointone.question5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tipCalc {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        DecimalFormat df= new DecimalFormat("#.##");

        double gratuity=0;
        double subtotal=0;
        double gratPay=0;

        System.out.println("please input the subtotal");
        subtotal=input.nextDouble();
        System.out.println("please input the gratuity");
        gratuity=input.nextDouble();

        gratuity=gratuity/100;
        gratPay=gratuity*subtotal;
        System.out.println("gratuity: "+ df.format(gratPay)+" total "+df.format(subtotal+gratPay));

        }
    }

