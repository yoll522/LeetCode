
public class Solution {
	public int countBattleships(char[][] board){
		int count = 0 ;
		
		for(int r = 0 ; r != board.length ; ++r){
			for(int c = 0 ; c != board[0].length ; ++c){
				if(board[r][c] == 'X' && (r == 0 || board[r-1][c]=='.' ) && (c == 0 || board[r][c-1]=='.' )){
					++count;
				}
			}
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.countBattleships(new char[][]{{'X','.','.','X'}, {'.','.','.','X'}, {'.','.','.','X'}}));
	}

}
