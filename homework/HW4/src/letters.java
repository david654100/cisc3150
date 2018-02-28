import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class letters {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(new File("input.txt"));

        int rows;
        int column=0;
        int combosAmount=1;



        rows=input.nextInt();
        char[][] letters= new char[rows][];

        for( int x =0;input.hasNext();x++){

            column=input.nextInt();
            letters[x]=new char[column];
            combosAmount*= column;

            for (int y=0;y<column;y++){
                letters[x][y]=input.next().charAt(0);
            }

        }

        //combo algorithm
        char [] [] comboArr = new char[rows][combosAmount];

        int head;
        int printAmount=combosAmount;
        int printCounter;

        for(int x=0; x<rows;x++){
            printAmount/=letters[rows].length;
            head=0;
            printCounter=0;
            for (int y=0;y<column;y++){
                comboArr[x][y]=letters[x][head];
                printCounter++;
                if(head+1==letters[rows].length){
                    head=0;
                }
                else{
                    head++;
                }
                printCounter=0;

            }
        }







    }
    public static void wordPrinter(char[][] arr){
        for(int row=0;row<arr[0].length;row++){
            for (int col = 0; col < arr.length; col++)
                System.out.printf("%c", arr[col][row]);
            System.out.printf("\n");
        }
    }

}



//https://stackoverflow.com/questions/16956720/how-to-create-an-2d-arraylist-in-java/16956747
//https://www.tutorialspoint.com/java/java_map_interface.htm
//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
//https://stackoverflow.com/questions/9666903/every-combination-of-character-array
//https://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner
//https://codereview.stackexchange.com/questions/41510/calculate-all-possible-combinations-of-given-characters
//https://stackoverflow.com/questions/8965926/algorithm-to-generate-all-combinations-of-a-string
//http://javahungry.blogspot.com/2014/02/algorithm-for-combinations-of-string-java-code-with-example.html