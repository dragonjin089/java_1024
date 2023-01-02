package day20;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListMain {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*전화번호를 관리하는 프로그램을 작성하세요
		 * 1. 전화 번호 추가 ( 성, 이름,직장,전화번호들 추가가능
		 * 2. 전화 번호 수정
		 * 		-이름으로 검색(성+이름)
		 * 		-검색된 사람들 중에서 선택
		 * 		-성, 이름을 수정할건지
		 * 		 기존 등록된 전화번호를 수정할건지,
		 *       새 전화번호를 등록할건지를 선택하여 동작
		 * 3. 전화 번호 삭제 
		 * 		-이름으로 검색(성+이름)
		 * 		-검색된 사람들 중에서 선택
		 * 		-선택된 사람의 연락처를 삭제 
		 * 4. 전화번호 조회
		 * 	-이름으로 검색 
		 * 	-검색된 사람들 중에서 선택 
		 *  -선택된 사람의 연락처를 출력*/

		int menu = -1;
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		String	name ,company;
		int pNumber;
		
		do {
		
			printMenu();
			menu = scan.nextInt();
			
			runMenu(menu,list);
			
		}while(menu!=5);
	}
	
	
	private static void runMenu(int menu, ArrayList<Phone> list) {

		String	name ,company;
		int pNumber;
		int count = 0;
		switch(menu) {
		
		case 1 :
			Phone phone = createPhone();
			
			list.add(phone);
			
			
			System.out.println(list);
			
			break;
			

		case 2 : 
			
			
			System.out.println("이름 검색");
			scan.nextLine();
			name= scan.next();
		
			
			for(Phone tmp : list) {
				if(tmp.getName().contains(name.trim())) {
					System.out.println(tmp);
					count++;
				}
			}
			
			if(count ==0) {
				System.out.println("검색결과 없음 ");
			}
			
			printSubMenu();
			
			
			int subMenu = scan.nextInt();
			
			runSubPrintMenu(subMenu,list);
			
			
			
			break;
		case 3 : 
			
			System.out.println("전화번호 조회");
			System.out.println("이름 검색");
			scan.nextLine();
			name= scan.next();
		
			
			for(Phone tmp : list) {
				if(tmp.getName().contains(name.trim())) {
					System.out.println(tmp);
					count++;
				}
			}
			
			if(count ==0) {
				System.out.println("검색결과 없음 ");
			}
			break;
		case 4 : 
			System.out.println("전화번호 삭제");
			System.out.println("이름 검색");
			scan.nextLine();
			name= scan.next();
		
			
			for(Phone tmp : list) {
				if(tmp.getName().contains(name.trim())) {
					System.out.println(tmp);
					count++;
				}
			}
			
			if(count ==0) {
				System.out.println("검색결과 없음 ");
			}
			System.out.println("삭제할 전화번호 입력 ");
			pNumber = scan.nextInt();
			if(list.remove(new phone(pNumber))) {
				
			}
			break;
		case 5: 
			System.out.println("종료");
			break;
		
		default:
			System.out.println("다른번호 입력 ");
		}
		
	}
	private static void runSubPrintMenu(int subMenu, ArrayList<Phone> list) {
		
		switch (subMenu)
		{
		
		case 1: 
			System.out.println("성 이름 수정");
		break;
		case 2: 
			System.out.println("기존 등록된 전화번호 수정");
		break;
		case 3: 
			System.out.println("새 전화번호 등록");
		break;
		
		}
		
		
	}


	private static void printSubMenu() {
		System.out.println("1. 성, 이름 수정");
		System.out.println("2. 기존 등록된 전화 번호 수정");
		System.out.println("3. 새 전화번호를 등록");
	}


	private static Phone createPhone() {
		String name,company;
		int pNumber;
		String ans;
		System.out.println("전화번호 추 가");
		System.out.println("이름 입력 : ");
		name = scan.next();
		System.out.println("직장 입력 : ");
		company = scan.nextLine();
		scan.next();
		do {
			System.out.println("전화번호 입력 : ");
			pNumber = scan.nextInt();
					
			System.out.println("더 입력하시겠습니까.(y/n)");
			
			ans = scan.next();
			
		}while(!ans.equals("n"));
		
		return new Phone(name,company,pNumber);
	}


	
	private static void printMenu() {
		System.out.println("메뉴 출력 ");
		System.out.println("1. 전화 번호 추가 ");
		System.out.println("2. 전화 번호 수정 ");
		System.out.println("3. 전화 번호 삭제 ");
		System.out.println("4. 전화 번호 조회 ");
		System.out.println("___________________ ");
		System.out.print("메뉴 출력  : ");
	}

}
