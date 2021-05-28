/**
 * 高效实现1000个时间格式化
 */
package threadPool0523;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo11 {
    static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
    public static void main(String[] args) {
        ThreadPoolExecutor executor=
                new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                        new LinkedBlockingDeque<>(1000));


        for(int i=1;i<1001;i++){
            final int finalI=i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Date date=new Date(finalI*1000);
                    myDateFormat(date);
                }
            });

        }
        //第一种 解决线程不安全
        //第二种  ThreadLocal
        executor.shutdown();
    }
    /**
     * 自定义时间格式化
     * @param date
     */
    public static void myDateFormat(Date date){

        String result=simpleDateFormat.format(date);
        System.out.println("时间："+result);
    }

}
