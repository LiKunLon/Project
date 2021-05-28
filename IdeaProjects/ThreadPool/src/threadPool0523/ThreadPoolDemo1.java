/**
 *
 * 原生创建线程池方式
 */
package threadPool0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(5,10,60,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));

        for (int i = 0; i <10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
