
public class Solution {
	
//    public int findComplement(int num) {
//        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
//    }
	
    public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.findComplement(6));
	}

}
