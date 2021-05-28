/**
 * 使用最高效方式实现10个时间的格式化
 */
package threadPool0523;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolDemo10 {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            final int finalI=i;
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    Date date=new Date(finalI*1000);
                    myDateFormat(date);
                }
            });
            t1.start();
        }
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
