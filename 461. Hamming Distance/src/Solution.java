
public class Solution {
	
    public int hammingDistance(int x, int y) {
        int diffCount = 0;
        while(x != 0 || y != 0){
            if((x & 1) != (y & 1))
            ++diffCount;
            x = x>>1;
            y = y>>1;
        }
        return diffCount;
    }
    
    /*
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    */
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.hammingDistance(1, 4));
	}

}
