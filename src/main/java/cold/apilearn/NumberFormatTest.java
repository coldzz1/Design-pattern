package cold.apilearn;

import org.springframework.util.StringUtils;

import java.text.DecimalFormat;

/**
 * Description: 我们经常要将数字进行格式化,比如取2位小数。
 * Java提供DecimalFormat类,帮你用最快的速度将数字格式化为你想要的格式
 * Created by ys on 2020/7/30 15:42
 */
public class NumberFormatTest {



    public static void judgeLength(String number){
        if(StringUtils.isEmpty(number)){
            System.out.println("为空");
        }
        //注意DecimalFormat只能对long double 操作
        Double num;
        try {
             num = Double.valueOf(number);
        }catch (NumberFormatException e){
            System.out.println("非数字:"+number+"转化失败");
            throw e;
        }
        if(new DecimalFormat("#").format(num).length()>=9){
            System.out.println("亿");
        }
        if(new DecimalFormat("#").format(num).length()>=5){
            System.out.println("万");
        }
        if(new DecimalFormat("#").format(num).length()>=3){
            System.out.println("百");
        }

    }
    public static void main(String[] args) {
        double pi = 3.1415927;//圆周率

        //整数部分保留1位小数保留2位
        System.out.println(new DecimalFormat("0.00").format(pi));

        //取整数部分
        System.out.println(new DecimalFormat("0").format(pi));

        //取两位整数和三位小数,整数不足部分以0填补
        System.out.println(new DecimalFormat("00.00").format(pi));


        long gs = 712453654;//每三位以逗号分隔
        System.out.println(new DecimalFormat("每秒以,000.#米").format(gs));


        double p = 55.1212453;//保留所有整数部分 小数部分保留3位小数
        System.out.println(new DecimalFormat("#.000").format(p));


        //科学计数法保留两位小数
        System.out.println(new DecimalFormat("0.00E0").format(gs));


        //取百分号 并保留两位小数
        System.out.println(new DecimalFormat("#.00%").format(pi));
    }
}
