import com.sun.org.apache.bcel.internal.generic.FNEG;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class FibonacciSequence {
    public static int fn(int n){
        if (n<2){
            return 1;
        }
        return fn(n-1)+fn(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fn(4));
    }
}
