public class chapter6Question2 {
    public static void main(String[] args) {
        double y=0;
    for(int x=0;x<10;x++){
        y=(Math.random()*1000);
        System.out.println(sumDigits(y));

    }
    }

    public static int sumDigits(double n){
        double sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return (int)sum;
    }
}
