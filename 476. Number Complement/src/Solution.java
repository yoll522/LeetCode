
public class Solution {
	
    public int findComplement(int num) {
    	int complement = 0 ;
        for(int i = 1 ; complement < num ; i = i << 1){
        	complement += i;
        	
        }

    	return complement - num;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		System.out.println(solution.findComplement(2147483647));
	}

}
