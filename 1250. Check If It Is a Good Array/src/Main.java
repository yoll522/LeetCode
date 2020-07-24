
public class Main {

    public boolean isGoodArray(int[] nums) {
        int x = nums[0];
        for(int num: nums){
        	while(num > 0){
            	if(num == 1)
            		return true;
            	if(x < num){
            		x = x ^ num;
            		num = x ^ num;
            		x = x ^ num;
            	}
            		
            	int temp = x % num;
            	x = num;
            	num = temp;
        	}
        }
        return x == 1 ? true : false;
    }
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main.isGoodArray(new int[]{12,5,7,23}));
		System.out.println(main.isGoodArray(new int[]{29,6,10}));
		System.out.println(main.isGoodArray(new int[]{3,6}));
		
		
	}

}
