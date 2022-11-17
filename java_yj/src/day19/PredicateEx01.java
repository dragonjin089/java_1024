package day19;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1,"홍기롣",100,90,80));
		list.add(new Student(1,2,1,"이걱장",50,80,60));
		list.add(new Student(2,3,3,"고길동",30,40,70));
		/*
		 * 1학년 1반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 2반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 학생들을 출력하는 코드를 작성하세요 
		 * */
//		printGrade(list);
		print(list,1,1);
		print(list,1);
		print(list, (s)->s.getGrade()==1 && s.getClassNum()==1);
		print(list, (s)->s.getGrade()==1);
		print(list, (S)->S.getName().charAt(0) == '홍');

	}
	public static void print(ArrayList<Student> list,int grade, int classNum) {
		for(Student tmp  : list) {
			if(tmp.getGrade() == grade && tmp.getClassNum()== classNum)
				System.out.println(tmp);
		}
	}
	
	public static void print(ArrayList<Student> list,int grade) {
		for(Student tmp  : list) {
			if(tmp.getGrade() == grade )
				System.out.println(tmp);
		}
	}
	public static void print(ArrayList<Student> list, Predicate<Student> p) {
		for(Student tmp: list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
}

//	//1학년 검출 코드 
//	public static void printGrade(ArrayList<Student> list) {
//		for(Student tmp: list) {
//				if(tmp.getGrade()==1) {
//					System.out.println(tmp.getName());
//					if(tmp.getClassNum()==1) {
//						System.out.println(tmp.getClassNum());
//					}
//					if(tmp.getClassNum()==2) {
//						System.out.println(tmp.getClassNum());
//					}
//				}
//		}
//		}
//	
//
//	
//
//}
