package threadPool0519; /**
 * 定时任务线程池
 */

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo4 {
    public static void main(String[] args) {
        //创建线程池
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        //执行任务
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务："+new Date());
            }
        },1,3, TimeUnit.SECONDS);

    }
}
