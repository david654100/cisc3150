import java.util.concurrent.ThreadLocalRandom;


public class Version3 {public static void main(String[] args) {

    long before = System.currentTimeMillis();

    long SIZE = 4_000_000_000L;
    int threadCount = Runtime.getRuntime().availableProcessors();
    System.out.printf("running thread count:\t%d\n", threadCount);
    long taskSize = SIZE / threadCount;

    Thread[] threads = new Thread[threadCount];
    ThreadTask[] tasks = new ThreadTask[threadCount];

    for (int t = 0; t < threadCount; t++) {
        tasks[t] = new ThreadTask(taskSize);
        threads[t] = new Thread(tasks[t]);
        threads[t].start();
    }

    for (int t = 0; t < threadCount; t++) {
        try {
            threads[t].join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            System.exit(1);
        }
    }

    long count = 0L;
    for (int t = 0; t < threadCount; t++) {
        count += tasks[t].dotsCount;
    }

    System.out.printf("\ndots in circle quad:\t%d\n", count);
    double estimatedPI = 4 * ((double)count / (double)SIZE);
    System.out.printf("estimation of PI:\t%f", estimatedPI);

    System.out.printf("\nruntime:\t\t%dms\n", (System.currentTimeMillis()-before));
}
}

final class ThreadTask implements Runnable {

    public double dotsCount = 0.0;
    private int taskSize;
    private double range;

    public ThreadTask(long taskSize) {
        this.taskSize = (int)taskSize;
        range = taskSize / 1_000_000_000 + 0.000000000001;
    }

    public void run() {
        double x, y;

        for (int i=0; i<taskSize; i++) {
            x = ThreadLocalRandom.current().nextDouble(0, range);
            y = ThreadLocalRandom.current().nextDouble(0, range);

            if (Math.sqrt(x*x + y*y) <= range) {
                dotsCount++;
            }
        }
    }
}
