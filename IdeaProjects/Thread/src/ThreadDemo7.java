/**
 * 调用interrupt()方法终止线程
 */
public class ThreadDemo7 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(!Thread.interrupted()){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        break;
                    }
                    System.out.println("正在进行转账！");
                }
                System.out.println("终止转账！");
            }
        });
        t1.start();

        Thread.sleep(310);
        System.out.println("有内鬼，停止交易！");
        t1.interrupt();
    }
}
