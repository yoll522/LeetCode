
public class Solution {
	
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if(nums.length == 0 || nums.length * nums[0].length != r * c)
    		return nums;
    	
    	int [][]newNums = new int[r][c];
    	int indexR = 0;
    	int indexC = 0;

    	
    	for(int []rowNums: nums){
    		for(int num: rowNums){
    			newNums[indexR][indexC] = num;
    			++indexC;
    			if(indexC == c){
    				++indexR;
    				indexC = 0;
    			}
    		}
    	}
    	
    	return newNums;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int [][]newNums = solution.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4); 
		
    	for(int []rowNums: newNums){
    		for(int num: rowNums){
    			System.out.print(num);
    		}
    		System.out.println();
    	}
	}

}
