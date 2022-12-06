package day32;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc,def,.ghi";
		String [] arr = str.split(",."); 
		// 정규표현식으로 적용 ,와 문자하나를 구분자로 봄 
		
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		// . 또는 , 를 구분자로 봄 
		StringTokenizer st = new StringTokenizer(str,".,");
		while(st.hasMoreElements()) {
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
		
//		StringTokenizer st1 = new StringTokenizer(str,".,",true);
		st = new StringTokenizer(str,".,",true);
		System.out.println("개수 : "+st.countTokens());
		while(st.hasMoreElements()) {
			String tmp = st.nextToken();
			System.out.println(tmp);
	}
	
	}
}

