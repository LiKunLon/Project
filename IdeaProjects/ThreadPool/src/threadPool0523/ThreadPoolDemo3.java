/**
 * 默认拒绝策略
 */
package threadPool0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(5,5,0,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(5));

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
