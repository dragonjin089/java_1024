package day24;

import lombok.Data;

@Data
public class Student03 {

	private String name;
	private int grade,classNum,num;
	
	
	public Student03(String name, int grade, int classNum, int num) {
	
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}


	@Override
	public String toString() {
		return 
				"\n"+"이름 : " + name + "\n"+ 
				 "학년 : " + grade + "\n"+ 
				"반 : " + classNum + "\n"+ 
				 "번호 : " + num+"\n" ;
	}
	
	
	
	
}
