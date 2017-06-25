
public class Solution {
	
    public String reverseWords(String s) {
    	char []newChars = s.toCharArray();
        
    	int i = 0 ,j = 0;
    	for(;j != newChars.length ; ++j){
    		if(newChars[j] == ' '){
    			reverseChar(newChars, i, j - 1);
    			i = ++j;
    		}
    	}
		reverseChar(newChars, i, j-1);
        
    	return new String(newChars);
    }
    
    void reverseChar(char[] chars, int i, int j){
    	while(i < j){
    		char temp = chars[i];
    		chars[i] = chars[j];
    		chars[j] = temp;
    		++i; --j;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.reverseWords("Let's take LeetCode contest"));
	}

}
