
public class Solution {

    int palindromicCount = 0;
    public int countSubstrings(String s) {
        char []words = s.toCharArray();
        for(int i = 0 ; i != words.length ; ++i){
        	checkPalindrome(words, i, i);
        	checkPalindrome(words, i, i+1);
        }
    	return palindromicCount;
    }
    
    void checkPalindrome(char []words, int left, int right){
    	while(left >= 0 && right < words.length && words[left] == words[right]){
    		++palindromicCount;
    		--left;
    		++right;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.countSubstrings("abccba"));
	}

}
