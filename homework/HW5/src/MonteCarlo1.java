import java.math.BigDecimal;
import java.math.BigInteger;



    public class MonteCarlo1 {
        public static void main(String[] args) {
            long before = System.currentTimeMillis();
            final BigDecimal testAmount= new BigDecimal("4000000000");
            final BigInteger test=new BigInteger("4000000000");
            BigDecimal dotsIn= new BigDecimal("0");



            double radius = 1;
            // generates random points
            double x=0;
            double y=0;
            //test to see if the point is in the circle or in the square
            for(BigInteger bi=BigInteger.ONE;bi.compareTo(test)<=0;bi=bi.add(BigInteger.ONE)) {
                x = Math.random();
                y = Math.random();

                if (x * x + y * y < radius * radius)
                    dotsIn = dotsIn.add(BigDecimal.valueOf(1));
                x=0;
                y=0;

            }


            BigDecimal ratioPi= dotsIn.divide(testAmount);
            BigDecimal piEst= ratioPi.multiply(BigDecimal.valueOf(4));
            System.out.println("Pi is "+piEst);
            System.out.println(System.currentTimeMillis()-before);

        }
    }
//https://en.wikipedia.org/wiki/Monte_Carlo_method
//https://www.coursera.org/learn/principles-of-computing-1/lecture/8OEht/monte-carlo-methods
//http://mathfaculty.fullerton.edu/mathews/n2003/montecarlopimod.html
//http://www.eveandersson.com/pi/monte-carlo-circle
//http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html

//https://www.youtube.com/watch?v

