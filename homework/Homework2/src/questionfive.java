import java.util.Scanner;

public class questionfive {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("Please enter words separated my commas not space");

        imput.useDelimiter(",");

        while (imput.hasNext()){
            String myStr= imput.next();
            System.out.println(myStr);
        }



    }
}
