import java.util.ArrayList;

public class Codec {
    ArrayList<String> array = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	array.add(longUrl);
    	return "http://tinyurl.com/" + array.size();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	return array.get( Integer.parseInt( shortUrl.substring(  shortUrl.lastIndexOf("/") + 1) ) - 1 );
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "https://leetcode.com/problems/design-tinyurl";
		 Codec codec = new Codec();
		 codec.decode(codec.encode(url));
	}

}
