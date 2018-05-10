import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lettersv2 {

    public final static AtomicInteger count = new AtomicInteger(0);
    public final static AtomicBoolean running = new AtomicBoolean(true);

    public static void main(String[] args) {
        printerOne a= new printerOne();
        printerTwo b = new printerTwo();
        printerThree c = new printerThree();
        printerFour d= new printerFour();



    }

} class locker{
    public static char letterPrinter(AtomicInteger count){
        char[] letterArray={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        return letterArray[count.get()];
    }
    Lock L = new ReentrantLock();
    Condition lockOne = L.newCondition();
    Condition lockTwo = L.newCondition();
    Condition lockThree = L.newCondition();
    Condition lockFour = L.newCondition();
}

class printerOne extends locker implements Runnable {
    printerOne(){
        this.run();
    }


    @Override
    public void run() {
        while (lettersv2.running.get()) {
           try{
                if (letters.count.get() <= 25) {
                    System.out.println(letterPrinter(letters.count));
                    letters.count.addAndGet(1);
                    lockTwo.signal();
                    lockOne.await();
                }
                else if (lettersv2.count.get()>=26){
                    lettersv2.running.getAndSet(false);
               }

                }catch (Throwable e){}



        }

    }
}
class printerTwo extends locker implements Runnable {
    printerTwo(){
        this.run();
    }

    @Override
    public void run() {
        try {
            lockTwo.await();
        }catch (Throwable e){}
        while (lettersv2.running.get()) {
            try{
                if (letters.count.get() <= 25) {
                    System.out.println(letterPrinter(letters.count));
                    letters.count.addAndGet(1);
                    lockThree.signal();
                    lockTwo.await();
                }
                else if (lettersv2.count.get()>=26){
                    lettersv2.running.getAndSet(false);
                }

            }catch (Throwable e){}



        }

    }
}



class printerThree extends locker implements Runnable {
    printerThree(){
        this.run();
    }

    @Override
    public void run() {
        try {
            lockThree.await();
        }catch (Throwable e){}
        while (lettersv2.running.get()) {
            try{
                if (letters.count.get() <= 25) {
                    System.out.println(letterPrinter(letters.count));
                    letters.count.addAndGet(1);
                    lockFour.signal();
                    lockThree.await();
                }
                else if (lettersv2.count.get()>=26){
                    lettersv2.running.getAndSet(false);
                }

            }catch (Throwable e){}



        }

    }
}

class printerFour extends locker implements Runnable {
    printerFour(){
        this.run();
    }

    @Override
    public void run() {
        try {
            lockFour.await();
        }catch (Throwable e){}
        while (lettersv2.running.get()) {
            try{
                if (letters.count.get() <= 25) {
                    System.out.println(letterPrinter(letters.count));
                    letters.count.addAndGet(1);
                    lockOne.signal();
                    lockFour.await();
                }
                else if (lettersv2.count.get()>=26){
                    lettersv2.running.getAndSet(false);
                }

            }catch (Throwable e){}



        }

    }
}
