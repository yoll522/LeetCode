import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
	 
public class Solution {

	private int requestSum = 0;
	private List<List<Integer>> resultList;
	private LinkedList<Integer> currentPath;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
		resultList = new LinkedList<>();
    	if (root != null) {
    		currentPath = new LinkedList<>();
    		this.requestSum = sum;
    		dfs(root, 0);
    	} 
    	return resultList;
    }
    	
    private void dfs(TreeNode root, int currentSum){
    	currentSum += root.val;
    	this.currentPath.add(root.val);
    	if(root.left == null && root.right == null && currentSum == this.requestSum)
    		resultList.add( new LinkedList<>(currentPath) );

    	if(root.left != null)
    		dfs(root.left, currentSum);
    	if(root.right != null) 
    		dfs(root.right, currentSum);
    	this.currentPath.removeLast();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
