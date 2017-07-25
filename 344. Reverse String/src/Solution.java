
public class Solution {

	  public String reverseString(String s) {
		  char []words = s.toCharArray();
		  int i=0, j=words.length-1;
		  while(i < j){
			  words[i] = (char) (words[i] ^ words[j]);
			  words[j] = (char) (words[i] ^ words[j]);
			  words[i] = (char) (words[i] ^ words[j]);
			  ++i;
			  --j;
		  }
		  return new String(words);
	  }
//    public String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
//    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.reverseString("abcde fghi"));
	}

}
