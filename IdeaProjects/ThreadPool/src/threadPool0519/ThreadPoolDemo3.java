package threadPool0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建带缓存的线程池
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        for (int i = 0; i <100 ; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });

        }
    }
}
