import java.util.HashSet;
import java.util.Set;

public class Solution {
	
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for(int candy: candies)
        	kinds.add(candy);
        
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.distributeCandies(new int[]{1, 1, 2, 3}));
	}

}
