
public class Main {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public boolean hasPathSum(TreeNode root, int sum) {
			if(root == null)
				return false;
			return calculate(root, 0, sum);
		}
		
		private boolean calculate(TreeNode root, int cur, int sum){
			int tmp = root.val + cur;
			if(tmp == sum){
				if(root.left == null && root.right == null)
					return true;
			}

			if(root.left != null && calculate(root.left, tmp, sum) == true)
				return true;

			if(root.right != null && calculate(root.right, tmp, sum) == true)
				return true;
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
