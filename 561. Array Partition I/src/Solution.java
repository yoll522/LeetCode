import java.util.Arrays;

public class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i != nums.length ; i+=2){
        	sum += nums[i];
        }
        return sum;  
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		System.out.println(solution.arrayPairSum(new int[]{1, 4, 3, 2, 2, 9, 6, 7}));
	
	}

}
