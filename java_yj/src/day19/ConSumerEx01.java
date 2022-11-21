package day19;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.sun.jdi.connect.Connector.StringArgument;

public class ConSumerEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1 ,"홍길동"));
		list.add(new Student(1, 2, 1 ,"김길동"));
		list.add(new Student(1, 1, 2, "고길동"));
		
		pritn(list, (a) -> System.out.println(a));
		
		print(list, (a)-> {
			System.out.println("학년 : "+a.getGrade());
			System.out.println("반 : "+ a.getClassNum());
			System.out.println("번호 : "+ a.getNum());
			System.out.println("이름 : "+ a.getName());
		});
	}
	public static void print(ArrayList<Student> list, Consumer<Student> con) {
		for(Student tmp : list) {
			con.accept(tmp);
		}
	}
	
}