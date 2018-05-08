public class itsarace {
    public static void main(String[] args) {
        a a1 = new a();
        b b1 = new b();


    }    }

    class race implements Runnable {
        public void run() {
            System.out.println(fibonacci(50));

        }



    public long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
class a extends race{
    a(){
        a.super.run();
        System.out.println("A");
    }
}

class b extends race{
    b(){
        b.super.run();
        System.out.println("B");
    }
}