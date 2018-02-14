package qestion1;


import java.util.*;
public class questionOne {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);

        int height = 0;

        System.out.println("Please enter the height of the pyramid ");

        height=imput.nextInt();
        imput.close();

        for(int i = 0; i < height; i++){

            for(int j=0; j< height - (i+1); j++)
            {
                System.out.print("  ");
            }

            for(int j=0;j<=i;j++){
                System.out.printf("%2d", j + 1);
            }

            for(int j=0;j<i;j++){

                System.out.printf("%2d", i - j);
            }

            System.out.printf("\n");

        }
    }
}

//https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
//https://www.youtube.com/watch?v=YseitO6gTwE
//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
//https://alvinalexander.com/programming/printf-format-cheat-sheet