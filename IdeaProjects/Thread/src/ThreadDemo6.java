/**
 * 定义全局变量来控制线程终止
 */
public class ThreadDemo6 {
    public static boolean flag=false;
    public static void main(String[] args) throws InterruptedException {
        //转账线程
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(!flag){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("正在进行转账！");
                }
                System.out.println("终止转账！");
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(410);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("有内鬼，停止交易！");
                flag=true;
            }
        });
        t2.start();

        t1.join();
        t2.join();
    }
}
