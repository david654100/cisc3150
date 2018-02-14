package com.david.benzquen.twopointone.question4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter pounds");
        double pounds = input.nextDouble();
        System.out.print("pounds: " + pounds + " kg: " + df.format(pounds * .305));
    }
}
