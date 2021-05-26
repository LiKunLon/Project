import javax.swing.text.rtf.RTFEditorKit;

/**
 * 感受多线程和单线程效率
 */
public class ThreadDemo2 {
    private  static final Long count=100000000l;
    public static void main(String[] args) throws InterruptedException {
        mutipule();

        single();
    }
    //单线程方法
    private static void single() {
        Long stime=System.currentTimeMillis();
        int a=0;
        for (int i = 0; i <3*count ; i++) {
            a++;
        }
        Long etime=System.currentTimeMillis();
        System.out.println("单线程执行了：" +(etime-stime));
    }

    //多线程方法
    private static void mutipule() throws InterruptedException {
        Long sTime=System.currentTimeMillis();//记录当前时间的毫秒时间戳
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int a=0;
                for (int i = 0; i <count ; i++) {
                    a++;
                }
            }
        });
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                int b=0;
                for (int i = 0; i <count ; i++) {
                    b++;
                }
            }
        });
        t2.start();
        //主线程执行
        int c=0;
        for (int i = 0; i <count ; i++) {
            c++;
        }
        //等线程1和2执行完成之后，再开始统计时间
        t1.join();
        t2.join();
        Long eTime=System.currentTimeMillis();
        System.out.println("多线程执行了："+(eTime-sTime));
    }


}
