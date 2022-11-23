package day23;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("D:\text.txt"); 
			//파일 생성 객체 파일 생성 
			
			try {
			if(f.createNewFile()) {
				
				System.out.println("파일이 생성되었습니다.");
			}else {
				System.out.println("파일 생성에 실패했습니다.");
			}
		}catch(IOException e) { 
			System.out.println("IOException 발생");
		}
	}

}
