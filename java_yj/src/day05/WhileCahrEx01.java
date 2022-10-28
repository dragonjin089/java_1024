package day05;
import java.util.*;
public class WhileCahrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자를 입력받아 q 이면 종료하고 아니면 반복되는 코드를 작성하세요.
		
	//1번  break 문을 이용하여 무한루프를 빠져 나오는 예제
	    char ch ;
	    Scanner sc = new Scanner(System.in);
		
	    
	    while(true) {
	    	System.out.println("문자를 다시입력하세요.(종료는 : q) : ");
			ch = sc.next().charAt(0);
	    	if(ch=='q') {
	    		break;
	    	}
	    }
	    
	//2번 ch 초기값을 잘 설정하여 while 문  조건식을 이용한 예제
	    ch='a';
	    	while(ch !='q') 
	    		{
	    	   	System.out.println("문자를 다시입력하세요.(종료는 : q) : ");
	    		ch = sc.next().charAt(0); 	
	    	    }	
	
	    	sc.close();
	}

}
