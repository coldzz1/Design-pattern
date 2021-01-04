package cold.sf;

/**
 * Description:
 * <p>
 * Created by kele on 2020/10/29 20:19
 */
public class demoTest {



  //假设你正在怕楼梯，需要n阶你才能达到楼顶。每次你可以爬1或2个台阶，你有多少种不同的方法可以爬到楼顶呢？
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    //5的阶乘
    public static long multi2five(int num){
        long sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum*i;
        }
        return sum;
    }



    //判断是否异位词
    public static boolean testSimilar(String t,String s){
        char[] a = t.toCharArray();
        char[] b = s.toCharArray();
        if(a.length!=b.length){
            return false;
        }
        boolean flag = true;//判断是否找到相同的 如果没有提前中断
        for (int i = 0; i < a.length; i++) {
            if(i!=0&& flag){
                return false;
            }
            flag=true;
            for (int j = i; j < b.length; j++) {
                if(a[i]==b[j]){
                    char temp = b[i];//要查找的字符
                    b[i]= b[j];
                    b[j]=temp;
                    flag=false;
                }
            }
            
        }
        if(a[a.length-1]!=b[b.length-1]){
            return false;
        }
        return true;
    }


}
