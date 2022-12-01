package day29;

import lombok.Data;

public class Problem03 {

	public static void main(String[] args) {
		/*게시글 재목과 검색어를 비교하려면 ,board2가 아닌 board2의 제목과 비교
		 * board2.equals(search) : 게시글 전체와 검색어 search 와 비교를 하는데 ,
		 * board2 클래스에 equals 는title contents가 모두 같을때만 동작하고 다른 비교대상이 다른 클래스인경우 무조건 false리턴
		 * 수정
		 * board2.equal(search)를 board2.getTitle().contains(search)
		 * 
		 * */
		Board2 board2 = new Board2();
		board2.setTitle("공지사항");
		String search = "공지";
		if(board2.equals(search))
		{
			System.out.println("1");
		}
	}

}
@Data
class Board2{
	String title,contents;
}
