package day11;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*문자열 str 에 search 가 몇번 등장하는지 확인하는 코드를작성하세요.*/
		String str = "Hello World! My name is Hong";
		String search = "o";
		int count=0;
		
		String tmp = str;
		while(true)
		{
			System.out.println("tmp :"+tmp);
			int index  = tmp.indexOf(search);
			if(index == -1) {
				break;
			}
			tmp = tmp.substring(index + search.length());
			count++;
		}
		System.out.println(str+"에는 "+ search + " 가 " + count + " 번 있습니다.");
	
	}

}
