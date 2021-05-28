/**
 * 默认拒绝策略
 */
package threadPool0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo4 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(5,10,0,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(5),
                        //使用调用线程池的线程来执行任务（使用主线程来执行任务）
                        new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i <10 ; i++) {
            int finali=i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("任务："+finali+ "线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
