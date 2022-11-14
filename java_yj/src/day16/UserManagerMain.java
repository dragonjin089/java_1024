package day16;

import java.util.*;


public class UserManagerMain {

	public static void main(String[] args) {
		/*회원 정보를 관리하는 프로그램을 작성하세요
		 * - 회원 정보는 아이디, 비번, 이름, 나이 , 주민번호로 구성
		 * - 기능 1 : 회원 추가 
		 * - 기능 2 : 회원 검색
		 * - 기능 3 : 회원 정보 수정 
		 * - 기능 4 : 회원 삭제 
		 * */

Scanner scan = new Scanner(System.in);
int menu = -1;
ArrayList<UserInfo> userList = new ArrayList<UserInfo>();


//HashMap<String,String> userList = new HashMap<String,String>();

do {
	printMenu();
	// 메뉴 입력
	menu = scan.nextInt();
	
	runMenu(menu,userList);
}while(menu!=5);
		
	}

	private static void runMenu(int menu,ArrayList<UserInfo> userList) {
		// TODO Auto-generated method stub
//		HashMap<String,String> userList = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1: 
			//회원추가 
			addUser(userList);
			break;
		case 2:
			//회원검색 
			System.out.println("회원검색 ");
			findUser(userList);
			break;
		case 3: 
			//회원 정보 수정
			updateUser(userList);
			break;
		case 4:
			//회원삭제
			deleteUser(userList);
			break;
			
		case 5: 
			System.out.println("프로그램 종료 ");
			break;
		default: 
			System.out.println("다른 번호 입력 ");
		}
	}

	private static void deleteUser(ArrayList<UserInfo> userList) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scan.next();
		ArrayList<Integer> indexList = findUserList(userList,name);
		for(int i =0; i< indexList.size(); i++) {
			int index= indexList.get(i);
			System.out.println(i+1 + "," + userList.get(index));
		}
		
		// 정할 단어 번호를 입력 : 3번입력 -> 4번지 객체 
		System.out.println("삭제할 번호 : ");
		int index = scan.nextInt() -1 ;
		
		userList.remove((int)indexList.get(index));
		System.out.println("삭제가 완료됐습니다.");
	}

	private static void updateUser(ArrayList<UserInfo> userList) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scan.next();
		ArrayList<Integer> indexList = findUserList(userList,name);
	for(int i= 0; i< indexList.size(); i++) {
		int index = indexList.get(i);
		System.out.println(i+1+","+userList.get(index));
	}
	
	//수정할 부분입력
	System.out.print("아이디 : ");
	String id = scan.nextLine();
	System.out.print("비밀번호 : ");
	String pw = scan.nextLine();
	System.out.print("나이 : ");
	int age = scan.nextInt();
	System.out.print("주민번호 : ");
	int longNum = scan.nextInt();
	
	UserInfo tmp = userList.get(indexList.get(index));
	tmp.setId(id);
	tmp.setPw(pw);
	tmp.setNum(age);
	tmp.setLongNum(longNum);
	
	}

	
	
	
	
	private static ArrayList<Integer> findUserList(ArrayList<UserInfo> userList, String name) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i<userList.size(); i++) {
			if(userList.get(i).equals(name)) {
				list.add(i);
			}
		}
		return list;
	
	}

	private static void findUser(ArrayList<UserInfo> userList) {
		for(UserInfo tmp : userList) {
			System.out.println(tmp);
		}
		System.out.println("----------------");
	}

	private static void addUser(ArrayList<UserInfo> userList) {
		// TODO Auto-generated method stub
		System.out.println("회원 추가할 회원 아이디, 비번, 이름, 나이 , 주민번호입력 ");
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("주민번호 : ");
		int longNum = scan.nextInt();
		
		UserInfo tmp = new UserInfo(id,pw,name,age,longNum);
		
		userList.add(tmp);
		
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("회원정보관리 프로그램");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	


}
