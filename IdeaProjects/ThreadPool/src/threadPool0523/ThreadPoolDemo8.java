/**
 * simpleDateFormat
 *  使用最高效的方式实现两个Date（时间类型）的格式化
 */
package threadPool0523;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolDemo8 {
    public static void main(String[] args) {
        Date date=new Date(1000);
        System.out.println("未格式化前："+date);
        SimpleDateFormat dateFormat=
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String result=dateFormat.format(date);
        System.out.println("格式化后："+result);


    }
}
