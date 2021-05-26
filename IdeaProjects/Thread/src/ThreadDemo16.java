/**
 * wait（）
 */
public class ThreadDemo16 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1进入线程方法");
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程1执行完成!");

            }
        }, "t1");
        t1.start();
        Thread.sleep(1000);
        System.out.println("主线程唤醒线程1");
        synchronized (lock) {
            lock.notify();
        }

    }
}
