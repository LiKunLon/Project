/**
 *
 * start和run方法线程名演示
 */

public class ThreadDemo5 {
    public static final boolean flag=false;
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.run();
    }
}
