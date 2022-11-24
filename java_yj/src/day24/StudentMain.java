package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import day16.Member1;
import day20.Book;
import day22.Student;
import lombok.Data;

public class StudentMain implements Serializable{
	
	
	private static final long serialVersionUID = -8560255555025206730L;
	/*학생 정보를 관리 프로그램을 작성하세요.
	 * 1. 학생추가 (이름,학년,반 번호)
	 * 2. 학생출력
	 * 3. 종료 
	 * - 프로그램 시작 전 학생 정보를 읽어오는 기능 추가 (load)
	 * - 프로그램 종료 전 학생정보를 저장하는 기능 추가(save)
	 * */
	
	
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "student.txt";
		
		int menu = -1;
		
		ArrayList<Student03> list = new ArrayList<Student03>();
	//load(list);
	do {
		printMenu();
		
		menu = scan.nextInt();
		
		runMenu(menu,list);
		
	}while(menu!=3);
	save(list,fileName);
	
	}

	

	private static void runMenu(int menu, ArrayList<Student03> list) {
	
		switch(menu) {
		
		case 1: 
			System.out.println("학생추가");
			insertMenu(list);
			break;
			
		case 2: 
			System.out.println("학생출력");
			printStd(list);

			break;
			
		case 3: 
			System.out.println("종료");

			break;
			
			default : 
				System.out.println("다른번호 입력");
				
		}
	}

	private static void printStd(ArrayList<Student03> list) {
		
	if(list == null)
		throw new RuntimeException("예외발생 :학생을 관리할 리스트가 생성되지 않았습니다.");
	
	if(list.size() == 0)
	{
		System.out.println("학생정보없음");
		return;
	}
		
	for(Student03 std : list ) {
		
			System.out.println(std);
		
		}
	}
	
	private static void insertMenu(ArrayList<Student03> list) {
		
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
		
		System.out.print("이름 입력하세요 : ");
		String name =scan.next();
		System.out.print("학년 입력하세요 : ");
		int grade = scan.nextInt();
		System.out.print("반  입력하세요 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 입력하세요 : ");
		int num = scan.nextInt();
		
		Student03 std = new Student03(name,grade,classNum,num);
		
		
		list.add(std);
		
		System.out.println("학생추가 완료");
	}

	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 출력");
		System.out.println("3. 종료");
		System.out.println("============= ");
		System.out.print("메뉴 입력 : ");


	}

	private static void save(ArrayList<Student03> list, String fileName) {
	
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
) {
			for(Student03 std : list) {
				oos.writeObject(std);
			}
			System.out.println("저장했습니다.");
		}catch(FileNotFoundException e) {
			System.out.println(fileName + "을 생성할 수 저장에 실팻했습니다.");
		}catch(IOException e) {
			System.out.println("저장에 실패했습니다.");
		
	}
}
	private static void load(ArrayList<Student03> list, String fileName) {
		
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
		
		
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(fileName)))
		{
			while(true) {
			Student03 std = (Student03)ois.readObject();
			list.add(std);
			}
 
		
		}
		catch(FileNotFoundException e) {
			System.out.println(fileName + "이 없어서 불러오기에 실패했습니다..");
		}catch(EOFException e) {
			System.out.println("불러오기 완료 .");
		}
		catch(Exception e) {
			System.out.println("불러오기에 실패했습니다.");
}
}
}
