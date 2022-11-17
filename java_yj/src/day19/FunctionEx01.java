package day19;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
public class FunctionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1,"홍기롣",100,90,80));
		list.add(new Student(1,2,1,"이걱장",50,80,60));
		list.add(new Student(1,1,3,"고길동",30,40,70));
		/*학생들의 국어성적만 출력하는코드를 작성하세요*/
		/*학생들의 영어성적만 출력하는코드를 작성하세요*/
		/*학생들의 수학성적만 출력하는코드를 작성하세요*/
	
//		printKor(list);
//		printEng(list);
//		printMath(list);
		print(list, "국어", s->s.getKor());
		print(list, "영어", s->s.getEng());
		print(list, "수학", s->s.getMath());
		print(list, "총합", s->s.getKor()+s.getKor()+s.getMath());

	}
	public static void print(ArrayList<Student>list,String subject, Function<Student,Integer> f ) {
		
		for(Student tmp: list) {
			System.out.println(subject+ " : " + f.apply(tmp));
		}
	}
	public static void printKor(ArrayList<Student> list) {
		for(Student tmp: list) {
			System.out.println("국어 : " + tmp.getKor());
	}
	}
	public static void printEng(ArrayList<Student> list) {
			for(Student tmp: list) {
				System.out.println("영어 : " + tmp.getEng());
		}
	}
	public static void printMath(ArrayList<Student> list) {
			for(Student tmp: list) {
				System.out.println("수학 : " + tmp.getMath());
		}
	}

}

