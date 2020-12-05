import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
 */
public class NoRepetitionArray {
    protected static int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        if (n < 2) return n;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (j < n) {
            if (!set.contains(a[j])) {
                set.add(a[j]);
                j++;
            } else {
                set.remove(a[i]);
                i++;
            }
            res = Math.max(res, set.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("1234444445555666");
        System.out.println(a);
    }
}
