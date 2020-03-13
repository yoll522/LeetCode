
public class Main {

    public String breakPalindrome(String palindrome) {
        
    	if(palindrome.length() == 1)
    		return "";
    	String c = "a";
    	StringBuilder stringBuilder = new StringBuilder(palindrome);
    	for(int i = 0 ; i != palindrome.length() / 2 ; ++i){
			if(stringBuilder.substring(i, i+1).equals(c) == false && i != stringBuilder.length() - 1 - i){
				return stringBuilder.replace(i, i+1, c).toString();
			}
    	}    	
    	
    	return stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "b").toString();
    }
    
	public static void main(String[] args) {
		Main main = new Main();

		System.out.println(main.breakPalindrome("abccba"));
		System.out.println(main.breakPalindrome("abcdcba"));
		System.out.println(main.breakPalindrome("aaaaa"));
		System.out.println(main.breakPalindrome("aabaa"));
		System.out.println(main.breakPalindrome("aaaaaa"));
		System.out.println(main.breakPalindrome("aabbaa"));
		System.out.println(main.breakPalindrome("aa"));
	}

}
