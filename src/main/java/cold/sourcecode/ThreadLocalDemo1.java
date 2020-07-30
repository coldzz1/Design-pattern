package cold.sourcecode;

import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Description: design-pattern-demo
 * Created by ys on 2020/7/30 15:10
 */
public class ThreadLocalDemo1 {

    private static ThreadLocal<DecimalFormat> df = ThreadLocal.withInitial(() -> new DecimalFormat("#.00%"));

    public static void main(String[] args) {
        DecimalFormat decimalFormat = df.get();
        System.out.println(decimalFormat.format(0.980149));
        String date = "2020-07-30";
        try {
            new SimpleDateFormat("yyyy-mm").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.SIMPLIFIED_CHINESE);
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 29);
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        System.out.println(calendar.getTime());
        calendar.clear();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
    }
}
