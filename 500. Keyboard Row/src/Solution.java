
import java.util.stream.Stream;

public class Solution {
    
    public String[] findWords(String[] words) {
        return Stream.of(words).filter( s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String []words = solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
		Stream.of(words).forEach(System.out::println);
	}

}
