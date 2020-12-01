import java.util.Stack;

/**
 * 题目描述
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 */
public class ParenSort {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c:chars
             ) {
            if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if (c == '('){
                stack.push(')');
            }else if (stack.isEmpty() ||stack.pop() !=c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{}";
        ParenSort T = new ParenSort();
        boolean a = T.isValid(s);
        System.out.println(a);
    }
}
