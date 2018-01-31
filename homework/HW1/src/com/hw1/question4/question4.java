package com.hw1.question4;
import java.io.*;
import java.util.*;

public class question4{
    public static void main(String[] args)  {

        Scanner instream = new Scanner(System.in);
        System.out.println("Numbers:");
        while(instream.hasNextInt()){
            System.out.println(instream.nextInt());
        }
    }

}
