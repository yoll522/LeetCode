
public class Solution {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null)
			return null;

		TreeNode treeNode = new TreeNode(0);
		treeNode.val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

		treeNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
		treeNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
		
		return treeNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
