package cold.apilearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SimpleDateFormat在多线程下,会出现安全问题,
 * 原因是它底部是有一个Calender的,会先clear()在add() 最后get
 * 在多线程环境下可能会出现 get之前被其他线程clear ,add导致获取到的时间不是自己的
 */
public class DateFormatTest extends Thread {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String name;
    private String dateStr;


    public DateFormatTest(String name, String dateStr)
    {        this.name = name;
             this.dateStr = dateStr;
    }

    @Override

    public void run() {

    Date date = null;        try {
        date = sdf.parse(dateStr);
            System.out.println(dateStr+":"+date.getYear());
    } catch (ParseException e) {
        e.printStackTrace();
    }

    System.out.println(name + " : date: " + date);
}

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(new DateFormatTest("Test_A", "2000-04-28"));
        executor.execute(new DateFormatTest("Test_B", "2017-04-28"));

        executor.shutdown();
    }
}