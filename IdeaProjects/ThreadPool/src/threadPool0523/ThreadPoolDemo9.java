/**
 * 使用最高效的方式实现两个Date（时间类型）的格式化
 */
package threadPool0523;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolDemo9 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Date date=new Date(1000);
                myDateFormat(date);
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Date date=new Date(2000);
                myDateFormat(date);
            }
        });
        t2.start();

    }

    /**
     * 自定义时间格式化
     * @param date
     */
    public static void myDateFormat(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
        String result=simpleDateFormat.format(date);
        System.out.println("时间："+result);
    }
}
