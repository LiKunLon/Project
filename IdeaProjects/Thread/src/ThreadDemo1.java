import java.util.ArrayList;
import java.util.List;

/**
 * 三个线程
 * 打印十行ABC
 */

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        show();
    }

    private static void show() throws InterruptedException {
        for(int i=0;i<10;i++) {

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("A");
                }
            });
            t1.run();
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("B");
                }
            });
            t2.run();
            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("C");
                }
            });
            t3.run();

            Thread t4 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println();
                }
            });
            //t4.start();

            //t1.join();
            //t2.join();
            //t3.join();
            
        }


    }

    /*public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                dianping();
            }
        });
        t1.run();
        System.out.print("dazhong");
    }

    private static void dianping() {
        System.out.print("dianping");
    }*/


}
