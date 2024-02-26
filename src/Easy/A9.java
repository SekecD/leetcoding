package Easy;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class A9 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return false;
    }
}
