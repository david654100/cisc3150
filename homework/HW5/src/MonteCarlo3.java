import java.math.BigDecimal;
import java.math.BigInteger;

public class MonteCarlo3 {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        final long testAmount=4000000000L;
        double ratioForPi=0;
        double piEst=0;
        long dotsin=0L;



        double radius = 1;
        // generates random points
        double x1=0;
        double y1=0;
        //test to see if the point is in the circle or in the square
        for(int i=0;i<testAmount;i++) {
            x1 = Math.random();
            y1 = Math.random();

            if (x1 * x1 + y1 * y1 < radius * radius)
                dotsin++;

        }


        ratioForPi=dotsin/testAmount;
        piEst=ratioForPi*4;
        System.out.println("Pi is "+piEst);
        System.out.println(System.currentTimeMillis()-before);

    }
}
//time is 260844