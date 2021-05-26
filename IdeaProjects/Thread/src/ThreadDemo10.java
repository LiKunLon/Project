/**
 * 三个线程打印abc
 * synchronized实现打印cba
 */
public class ThreadDemo10 {
    private static final int max = 1000;
    private static int number = 0;

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        //加
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    synchronized (lock) {
                        number++;
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    synchronized (lock) {
                        number--;
                    }
                }
            }
        });
        t2.start();

        t1.join();
        t2.join();
        System.out.println("最终数字为：" + number);
    }
}
