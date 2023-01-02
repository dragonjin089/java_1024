package day29;

import lombok.Data;

public class Problem02 {

	public static void main(String[] args) {
		/*원인 : 
		 *매개변수로 정수를 필요로 하는 생성자가 없기때문에 에러발생
		 *public void Board(int num)는 생성자가 아니라 메소드  
		 *해결방안 : Board1메소드를 생성자로 수정(void)제거*/
//		Board1 board = new Board1(1);
		
	}
@Data
class Board1{
	int num;
	public void Board1(int num) {
		this.num = num;
	
	}
}
}
