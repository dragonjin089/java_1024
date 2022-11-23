package day23;

import java.io.File;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("D:/test");
			//mkdir이 false 인경우 
			// 이미  있는 폴더인 경우 
			// 상위 폴더가 없는 경우 
			
			if(f.mkdir()) {
				
				System.out.println("폴더 생성되었습니다.");
			}else {
				System.out.println("이미 폴더가 있거나 상위폴더가없습니다.");
			}
		
	
	if(f.mkdirs()) {
		
		System.out.println("폴더들 생성되었습니다.");
	}else {
		System.out.println("이미 폴더들 있습니다.");
	}
	
	if(f.isDirectory())
	{
		System.out.println("폴더명  : " +f.getName());
	}
	else if (f.isFile()) {
		System.out.println("파일명 : "+ f.getName());
	}
	
	if(f.delete()) {
		System.out.println("폴더가 삭제되었습니다..");
	}
	else {
		System.out.println("없는폴더입니다.");
	}
}
}
