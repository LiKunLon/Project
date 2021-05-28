/**
 * 线程执行方式  submit
 * 有返回值
 * 用future接收
 */
package threadPool0523;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadPoolDemo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(5,5,0,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));

        Future<Integer> future= executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int num=new Random().nextInt(10);
                System.out.println("线程池生成的数字："+num);
                return num;
            }
        });

        System.out.println("main得到的随机数"+future.get());
    }

}
