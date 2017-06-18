
public class Solution {
    public int[] countBits(int num) {
        int []bits = new int[num+1];
    	//For num = 5 you should return [0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4].
    	
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
