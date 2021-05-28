package threadPool0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo7 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(10,10,0,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));
        for (int i = 0; i < 10; i++) {
            int finalI=0;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format(""));
                }
            });
        }
    }
}
