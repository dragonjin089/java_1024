package day21;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PhoneListMain {

	static Scanner scan = new Scanner(System.in);
	// 인스턴스 필드 범위에만 적용 그래서 static 사용해야함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PhoneLIstMain pm = new PhoneListMain()
//				pm.scan
//	
		int menu = -1;
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		do {
	
	//메뉴출력
	//고정된 문자열 출력해서 매개변수 필요없음
	printMenu();
	try { 
	//메뉴 선택
	menu = scan.nextInt();
	//선택한 메뉴에 대한 기능 실행
	System.out.println("===============");
	runMenu(menu,list);
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());
		
	}

	}while(menu != 5);
}

	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		switch(menu) {
		case 1:
			if(insertPhoneBook(list)) {
				System.out.println("전화번호를 추가했습니다.");
			}
			else {
				System.out.println("전화번호를 추가하지 못했습니다.");
			}
			//성명 ,직장 입력
			break;
			
		case 2:
			if(updatePhoneBook(list)) {
				System.out.println("전화번호를 수정했습니다.");
				
			}else {
				System.out.println("전화번호를 수정하지 못했습니다.");
			}
			break;
			
		case 3:
			if(deletePhoneBook(list)) {
				System.out.println("전화번호를 삭제했습니다.");
			}else {
				System.out.println("전화번호를 삭제하지 못했습니다.");
			}
			
			break;
		case 4:
			printSearchNumber(list);
			
			break;
			
		case 5:
			System.out.println("종료");
			break;
			
		default:
		System.out.println("다른 번호 입력하세요");
		
		}
		
	}
	
	private static boolean updatePhoneBook(ArrayList<PhoneBook> list) {
		scan.nextLine();
		
		//이름 입력
		System.out.println("이름 : ");
		String name = scan.nextLine();
		
		ArrayList<Integer> indexs = searchPhoneBook(list,p -> p.getName().contains(name));
		
		//확인된 번지에 있는 번호들을 출력(번호와 함께 _ 
		printIndexsNumber(list,indexs);
		
		System.out.println("번호선택 : ");
		//조회할 전화번호부 선택
		int selectIndex = scan.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size())
			throw new RuntimeException("잘못 선택했습니다.");
		
		//서브메뉴 출력
		printSubMenu();

		//서브메뉴 실행
		int subMenu = scan.nextInt()-1;
		
		
		int index = indexs.get(selectIndex);
		return runSubMenu(subMenu,list.get(selectIndex));
		
	}

	private static boolean runSubMenu(int subMenu, PhoneBook pb) {
		if(pb == null) {
			return false;
		}
		switch(subMenu) {
		case 1:
			scan.nextLine(); //공백처리 (메뉴 입력후 남은엔터)
			System.out.print("성명 : ");
			String name = scan.nextLine();
			System.out.print("직장 : ");
			String company = scan.nextLine();
			
			pb.update(name,company);
			
			break;
		case 2:
			pb.printPhoneNumbers();
			
			System.out.println("번호 입력 : ");
			int index = scan.nextInt() -1; 
			//이름 번호를 입력
			scan.nextLine();
			System.out.println("이름 : ");
			String pName = scan.nextLine();
			System.out.println("번호 : ");
			String number = scan.nextLine();
			pb.getPnList().get(index).update(pName,number);
			
			break;
		case 3: 
			//이름번호를 입력
			scan.nextLine();
			ArrayList<PhoneNumber>pnList = inputPhoneNumbers();
			//새 전화번호 추가
			pb.getPnList().addAll(pnList);
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			return false;
		}
		return true;
	}

	private static void printSubMenu() {
		System.out.println("수정 메뉴 ");
		System.out.println("1. 이름과 직장 수정");
		System.out.println("2. 기존 등록된 전화번호 수정");
		System.out.println("3. 새 전화번호 등록 ");
		System.out.println("메뉴 선택 : ");
	}

	private static void printIndexsNumber(ArrayList<PhoneBook> list, ArrayList<Integer> indexs) {
		//확인된 번지에 있는 번호들을 출력(번호와 함께 _ 
				if(indexs == null || indexs.size() == 0 || list == null 
						|| list.size()==0) {
					throw new RuntimeException("검색 결과가 없습니다.");
					
				}
			
				for(int i = 0 ; i<indexs.size(); i++) {
					int index =indexs.get(i);
					System.out.println(i+1 + ". "+ list.get(index));
				}
		
		
	}
	private static void printSearchNumber(ArrayList<PhoneBook> list) {
		
		scan.nextLine();
		
		//이름 입력
		System.out.println("이름 : ");
		String name = scan.nextLine();
		//이름이 포함된 전화번호부를 검색하여 출력(번호와함꼐
		ArrayList<Integer> indexs = searchPhoneBook(list,p -> p.getName().contains(name));
		
		//확인된 번지에 있는 번호들을 출력(번호와 함께 _ 
		printIndexsNumber(list,indexs);
		
		System.out.println("번호선택 : ");

		//조회할 전화번호부 선택
		int selectIndex = scan.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size())
			return ;
		list.get(selectIndex).print();
	}

	private static boolean deletePhoneBook(ArrayList<PhoneBook> list) {

		scan.nextLine();
		
		//이름 입력
		System.out.println("이름 : ");
		String name = scan.nextLine();
		//이름이 포함된 전화번호부를 검색하여 출력(번호와함꼐
		ArrayList<Integer> indexs = searchPhoneBook(list,p -> p.getName().contains(name));
		System.out.println(indexs);
		//확인된 번지에 있는 번호들을 출력(번호와 함께 _ 
		if(indexs == null || indexs.size() == 0) {
			return false;
		}
		for(int i = 0 ; i<indexs.size(); i++) {
			int index =indexs.get(i);
			System.out.println(i+1 + ". "+ list.get(index));
		}
		System.out.println("번호선택 : ");

		//삭제할 전화번호부 선택
		int selectIndex = scan.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size())
			return false;
		
		//전화번홀를 삭제
		int deleteIndex = indexs. get(selectIndex);
		
		//삭제 성공시 삭제 객체정보를 알려줌 
		return list.remove(deleteIndex) != null;
	}

	private static ArrayList<Integer> searchPhoneBook(ArrayList<PhoneBook> list, 
			Predicate<PhoneBook> p ) {
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		
		for(int i = 0; i<list.size(); i++) {
			if(p.test(list.get(i)))
				indexs.add(i);
		}
		return indexs;
	}

	private static ArrayList<PhoneNumber> inputPhoneNumbers(){
		ArrayList<PhoneNumber> pnList = new ArrayList<PhoneNumber>();
		
		do {
		
			//입력받은 이름 번호를 이용하여 phoneNumber 객체를만들고
			PhoneNumber pn = inputPhoneNumber();
			//만들어진 phoneNumber 객체를 PhoneNumber 리스트에 추가 
			pnList.add(pn);
			
			System.out.print("더 입력하겠습니까 (y/n) : ");
		}while(scan.nextLine().charAt(0) != 'n');
		return pnList;
	}
	
	
	private static PhoneNumber inputPhoneNumber() {
	
		System.out.print("이름(집,직장 등) : ");
		String pName =scan.nextLine();
		System.out.print("번호 예(010-3443-8809) : ");
		String number = scan.nextLine();
		return new PhoneNumber(pName,number);
	}
	
	
	private static boolean insertPhoneBook(ArrayList<PhoneBook> list) {
			// 성명, 직장입력
		scan.nextLine(); //공백처리 (메뉴 입력후 남은엔터)
		System.out.print("성명 : ");
		String name = scan.nextLine();
		System.out.print("직장 : ");
		String company = scan.nextLine();
	
		
		ArrayList<PhoneNumber> pnList ;
		try {
			//전화번호들을 입력
			pnList = inputPhoneNumbers();
		}
			catch (RuntimeException e) {
		return false;		
		}
		//성명, 직장, 전화번호들 를 이용하여 PhoneBook객체를 생성
		PhoneBook pb = new PhoneBook(name,company,pnList);
		//list에 phoneBook 객체를 추가 
		list.add(pb);
		return true;
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("-- 메뉴 --");
		System.out.println("1. 전화번호 추가 ");
		System.out.println("2. 전화번호 수정");		
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("===================");
		System.out.println("메뉴 선택 : ");

	}

}
