import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 手动加锁lock的形式实现
 * 三个线程打印abc
 * 输出cba
 */
public class ThreadDemo11 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock(true);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.print("a ");
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.print("b ");
                } finally {
                    lock.unlock();
                }
            }
        });


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.print("c ");
                } finally {
                    lock.unlock();
                }
            }
        });
        t3.start();
        t2.start();
        t1.start();

//        t1.join();
//        t2.join();
    }
}
