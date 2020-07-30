package cold.apilearn;

import java.text.DecimalFormat;

/**
 * Description: 我们经常要将数字进行格式化,比如取2位小数。
 * Java提供DecimalFormat类,帮你用最快的速度将数字格式化为你想要的格式
 * Created by ys on 2020/7/30 15:42
 */
public class NumberFormatTest {

    public static void main(String[] args) {
        double pi = 3.1415927;//圆周率

        //取一位整数
        System.out.println(new DecimalFormat("0").format(pi));

        //取一位整数和两位小数
        System.out.println(new DecimalFormat("0.00").format(pi));

        //取两位整数和三位小数,整数不足部分以0填补
        System.out.println(new DecimalFormat("00.00").format(pi));

        //取所有整数部分
        System.out.println(new DecimalFormat("#.00").format(pi));

        //以百分比方式计数,并取两位小数
        System.out.println(new DecimalFormat("#.00%").format(pi));
        long c = 299792458 ;
        //以科学计数法 取5位小数
        System.out.println(new DecimalFormat("0.00000E0").format(c));
        System.out.println(new DecimalFormat("00.00000E0").format(c));
        //每三位以逗号进行分隔
        System.out.println(new DecimalFormat(",000").format(c));

        //将格式嵌入文本
        System.out.println(new DecimalFormat("光速为每秒,000米").format(c));
    }
}
