import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class letters {

    public final static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        printer a = new printer();
        printer b = new printer();
        printer c = new printer();
        printer d = new printer();


    }}
class printer  implements Runnable {
    printer(){
        this.run();
    }
  AtomicBoolean running = new AtomicBoolean(true);
        public static char letterPrinter(AtomicInteger count){
           char[] letterArray={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
           return letterArray[count.get()];
            }


    @Override
    public void run() {


            while(running.get()) {
                    if (letters.count.get()<=25){
                        System.out.println(letterPrinter(letters.count));
                       letters.count.addAndGet(1);
                       try {
                           Thread.sleep(100);
                       }catch (Throwable e){}
                    }
                    else if ( letters.count.get()>=25){
                        running.getAndSet(false);
                      }
            }

        }
}










