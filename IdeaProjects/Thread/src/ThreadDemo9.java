/**
 * 有三个线程，线程名称分别为：a，b，c。
 * 每个线程打印自己的名称。
 * 需要让他们同时启动，并按 c，b，a的顺序打印
 */
public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    System.out.print("a ");
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.print("b ");
                }

            }
        });


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.print("c ");
                }

            }
        });
        t3.start();
        t2.start();
        t1.start();

        //t1.join();
        //t2.join();
    }

}
