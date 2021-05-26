/**
 * 调用interrupt方法终止线程
 */
public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(!Thread.currentThread().isInterrupted()){
                    System.out.println("正在进行转账！");
                }
                System.out.println("终止转账");
            }
        });
        t1.start();

        Thread.sleep(5);
        System.out.println("有内鬼，终止交易！");
        t1.interrupt();



        t1.stop();
    }
}
