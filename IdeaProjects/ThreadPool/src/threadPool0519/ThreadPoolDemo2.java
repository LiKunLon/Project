package threadPool0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //线程工厂
        MyThreadFactory myThreadFactory=new MyThreadFactory();
        //创建线程池
        ExecutorService service= Executors.newFixedThreadPool(10,myThreadFactory);
        for (int i = 0; i <10 ; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority());
                }
            });
        }
    }
    private static int count=0;
    static class MyThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread thread=new Thread(r);
            thread.setName("myThreadPool-"+count++);
            thread.setPriority(10);
            return thread;
        }
    }
}
