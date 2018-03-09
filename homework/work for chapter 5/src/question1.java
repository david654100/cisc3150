

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        int countpos=0;
        int countneg=0;
        double total=0;
        double avg;
        int x;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0:");
        while(input.nextInt()!=0){
            x=input.nextInt();

            if (x>=1){
                countpos++;

            }

            else {
                countneg++;

            }

            total=total + x;


        }


        avg=total/(countneg+countpos*1.0);

        System.out.println("The number of pos: "+countpos);
        System.out.println("The number of neg: "+countneg);
        System.out.println("the total: "+total);
        System.out.println("the avg: "+avg);
    }
}
