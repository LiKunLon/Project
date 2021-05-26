import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo13 {
    private static int number = 0;
    private static final int max = 5000;

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock(true);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    lock.lock();
                    try {
                        number++;
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    lock.lock();
                    try {
                        number--;
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("最终结果为：" + number);
    }
}
