package threadPool0523;

public class ThreadPoolDemo12 {
    static ThreadLocal<String> threadLocal=
            new ThreadLocal<>();

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                //set
                String tname=Thread.currentThread().getName();
                threadLocal.set(tname);
                System.out.println(String.format("线程：%s 设置了值：%s",tname,tname));
                printTname();
            }
        },"线程1");
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    String tname=Thread.currentThread().getName();
                    threadLocal.set(tname);
                    System.out.println(String.format("线程：%s 设置了值：%s",tname,tname));
                    printTname();
                }finally {
                    threadLocal.remove();
                }
            }
        },"线程2");
        t2.start();
    }

    private static void printTname() {
        String tname=Thread.currentThread().getName();
        //得到存在ThreadLocal中的值
        String result=threadLocal.get();
        System.out.println(String.format("线程：%s,取的 %s",tname,result));
    }
}
