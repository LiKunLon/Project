public class ThreadDemo12 {
    private static int number = 0;
    private static final int max = 5000;

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    //synchronized (lock) {
                    number++;
                    //}
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    //synchronized (lock) {
                    number--;
                    //}
                }
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("最终数字为：" + number);
    }
}
