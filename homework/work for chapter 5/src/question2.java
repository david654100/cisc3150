public class question2 {
    public static void main(String[] args) {
        for (int x=0;x<10;x++){
            System.out.println(getPent(x));
        }

    }

    public static int getPent(int n){
        return (n*(3*n-1)/2);
    }
}
