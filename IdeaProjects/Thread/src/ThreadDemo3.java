/**
 * 两个线程打印AABBCCDD
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        show1();
        show2();
    }

    private static void show2() {
        String str1="ABCD";
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <str1.length() ; i++) {
                    System.out.print(str1.charAt(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }

    private static void show1() {
        String str="ABCD";
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <str.length() ; i++) {
                    System.out.print(str.charAt(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<str.length();i++){
                    System.out.print(str.charAt(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
    }
}
