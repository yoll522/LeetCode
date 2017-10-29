

public class Solution {
    public int maxRotateFunction(int[] A) {
    	int sum = 0;
    	int len = A.length;
    	int lastF = 0;
    	for (int i = 0; i < len; ++i) {
    		lastF += i * A[i];
    	    sum += A[i];
    	}
    	
    	int max = lastF;
    	for (int i = len - 1; i >= 1; --i) {
    		lastF = lastF + sum - len * A[i];
    	    max = Math.max(lastF, max);
    	}
    	return max;   
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.maxRotateFunction(new int[]{ -2147483648,-2147483648 }));

	}
}
