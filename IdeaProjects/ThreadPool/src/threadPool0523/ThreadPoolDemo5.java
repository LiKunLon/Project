/**
 * 默认拒绝策略
 */
package threadPool0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo5 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(5, 5, 0,
                        TimeUnit.SECONDS, new LinkedBlockingDeque<>(5),
                        //使用调用线程池的线程来执行任务（使用主线程来执行任务）
                        new RejectedExecutionHandler() {
                            @Override
                            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                                //自定义拒绝策略
                                System.out.println("执行了自定义拒绝策略");
                            }
                        });

        for (int i = 0; i <11 ; i++) {
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
