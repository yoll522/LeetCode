
public class Solution {
    public int[] countBits(int num) {
        int []bits = new int[num+1];
        for(int i = 1 ; i <= num ; ++i){
        	bits[i]= bits[i / 2] + ( i & 1);
        }
    	return bits;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new Solution();
		int []nums = solution.countBits(5);
		for(int num: nums)
			System.out.print(num + " ");

	}

}
