/**
 * 死锁
 */
public class ThreadDemo15 {
    public static void main(String[] args) {

        Object lockA = new Object();
        Object lockB = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println("线程1得到了锁A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1等待获取锁B");
                    synchronized (lockB) {
                        System.out.println("线程1得到了锁B");
                    }
                }
            }
        }, "t1");
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println("线程2得到了锁B");
                    try {
                        //休眠1s（让线程1线获取到锁A）
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程2等待获取锁A");
                    synchronized (lockA) {
                        System.out.println("线程2获取到锁A");
                    }
                }
            }
        }, "t2");
        t2.start();
    }
}
