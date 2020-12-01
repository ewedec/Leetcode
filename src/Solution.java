import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode last = root;
        TreeNode nlast =null;
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur.left != null){
                queue.add(cur.left);
                nlast =cur.left;
            }
            if (cur.right !=null){
                queue.add(cur.right);
                nlast = cur.right;
            }
            list.add(cur.val);
            if (cur == last){
                lists.add(list);
                list = new ArrayList<>();
                last = nlast;
            }
        }
        return lists;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val =x;
    }
}