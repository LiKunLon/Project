/**
 * wait使用时会释放锁
 */
public class ThreadDemo17 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1拥有锁lock,进图休眠状态");
                /*synchronized (lock) {
                    System.out.println("线程1拥有锁lock,进图休眠状态");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1执行完成，释放锁lock");
            }
        });
        t1.start();

        Thread.sleep(1000);
        //主线程试图获取锁
        //不执行就说明获取不到锁
        synchronized (lock) {
            System.out.println("主线程获取到锁lock");
        }
    }
}
