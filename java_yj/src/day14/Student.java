package day14;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import lombok.Data;

@Data
public class Student {

	//필드 : 학년, 반 , 번호 , 이름, 성적들 
	//접근제한자 
	//private 클래스안에서만 동작가능
	//public 다른 패키지안에서 동작가능
	//default 같은패키지에서 작동 가능
	//protected 상속받은 자식클래스에서 작동가능

	private int grade;
	private int classNum;
	private int num;
	private String name;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	/**
	 * 학생 정보에 성적을 추가하는 메소드 
	 * @param 추가할 성적 
	 * @return 추가 여부 
	 * */
	//getter 와 setter
	
	public boolean addScore(Score score) {
		if(score == null) {
			throw new RuntimeException("성적 정보가 없어 추가할 수 없음");		}
		
		// 학생의 성적 정보들 중에서 과목, 학기가 같은 성적 정보가 없으면추가
	boolean res = scoreList.contains(score);
		if(res) {
			return false;
		}
		scoreList.add(new Score(score)); 
		return true;
	}
	


	
	
	@Override
	public String toString() {
		return "["+grade + "학년 "+classNum + "반 " + num + "번호 " + "이름 " + name+"]";
	}
	
	
	// 생성자 : 초기화 
		// 학년, 반 , 번호 , 이름이 필요한 생성자 (학생정보 추가시 활용) 
		
	public Student(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	
	
	
	
	// 학년, 반 , 번호가 필요한 생성자(성적 추가시 학생이 있는지 없는지 판별할때 활용)
	public Student(int grade, int classNum, int num) {
	this.grade = grade;
	this.classNum = classNum;
	this.num = num;
}


	public void printScore() {
		for(Score tmp : scoreList) {
			System.out.println(tmp);
		}
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (num != other.num)
			return false;
		return true;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + num;
		return result;
	}
	
	// equals
	

}
