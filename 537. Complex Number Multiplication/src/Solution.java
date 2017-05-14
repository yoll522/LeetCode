import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
//	public String complexNumberMultiply(String a, String b) {
//        String x[] = a.split("\\+|i");
//        String y[] = b.split("\\+|i");
//        int a_real = Integer.parseInt(x[0]);
//        int a_img = Integer.parseInt(x[1]);
//        int b_real = Integer.parseInt(y[0]);
//        int b_img = Integer.parseInt(y[1]);
//        return (a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i";
//	}
	
	public String complexNumberMultiply(String a, String b) {
        String x[] = processStringTokenizer(a, "+").toArray(new String[0]);
        String y[] = processStringTokenizer(b, "+").toArray(new String[0]);
        int a_real = Integer.parseInt(x[0]);
        int a_img = Integer.parseInt(x[1].replace("i", ""));
        int b_real = Integer.parseInt(y[0]);
        int b_img = Integer.parseInt(y[1].replace("i", ""));
        return (a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i";
	}
	
	ArrayList<String> processStringTokenizer(String string, String delim){
	    StringTokenizer tokens = new StringTokenizer(string, delim);
	    ArrayList<String> list = new ArrayList<>();
	    while(tokens.hasMoreTokens()) {
	        list.add(tokens.nextToken());
	    }
	    return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.complexNumberMultiply("1+-1i", "1+-1i"));
	}

}
