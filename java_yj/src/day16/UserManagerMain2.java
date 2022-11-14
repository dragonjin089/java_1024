package day16;

import java.util.*;


public class UserManagerMain2 {

	public static void main(String[] args) {
		/*회원 정보를 관리하는 프로그램을 작성하세요
		 * - 회원 정보는 아이디, 비번, 이름, 나이 , 주민번호로 구성
		 * - 기능 1 : 회원 추가 
		 * - 기능 2 : 회원 검색
		 * - 기능 3 : 회원 정보 수정 
		 * - 기능 4 : 회원 삭제 
		 * */
		Scanner scan = new Scanner(System.in);
		ArrayList<Member1> list = new ArrayList<Member1>();

		//반복
		int menu = -1;
		do {
			//		메뉴 출력
			printMenu();
			//		메뉴를 선택(입력)
			menu = scan.nextInt();
			//		선택된 메뉴에 따른 기능실행 
			switch(menu) {
			case 1: 
				if(addMember(list)) {
					printStr("입력한 회원정보가 추가되었습니다.. ");
				}else {
					printStr("입력한 아이디가 이미 존재합니다. ");
				}
				break;
			case 2:
				Member1 searchTmp = searchMember(list);
				if(searchTmp == null) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}else {
					System.out.println(searchTmp);
				}
				break;
			case 3: 
				//회원 정보 수정
				Member1 updateTmp = searchMember(list);
				if(!updateMember(list,updateTmp)) {
					printStr(" 아이디 또는 비밀번호가 잘못됨");
				}
				else {
					printStr("회원정보수정완료");
				}
				break;
			case 4:
				//삭제할 회원 아이디와 비번을 입력하며 일치하는 회원정보를 가져옴 
				Member1 deleteTmp = searchMember(list);
				//일치하는  회원정보가 있으면 삭제 
				if(list.remove(deleteTmp))
				{
					printStr("삭제 완료");
				}
				else 
				{
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}
				break;
				
		
			case 5: 
				System.out.println("프로그램 종료 ");
				break;
			default: 
				System.out.println("다른 번호 입력 ");
			}
		
		}while(menu!=5);
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
	
	public static boolean addMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);

		//회원추가 
		// 아이디 비번 이름 주민번호 나이순으로 작성 
		System.out.println("회원 정보 입력 ");
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		// 입력한 정보를 이용한 객체를 생성(회원리스트에 비교 및 추가)
		Member1 member =new Member1(id, pw, name, residentNumber, age);
		
		// 회원 리스트에 이미 가입된 아이디 있으면 안내문구 출력 후 종료 
		//9회원 아이디가 같은 회원이 있으면)
		// 아니면 회원리스트에 추가 
		
		if(/*회원 리스트에 member 객체가 존재하면*/
				list.contains(member)) {
		
//		건너뜀
//		 continue;
			return false;
		}
		// 아님년 회원 릿그트에 member객체를추가
		list.add(member);
		return true;
	}
	
	public static void printStr(String str) {
		System.out.println("------------------");
		System.out.println(str);
		System.out.println("------------------");
	}
	
	public static Member1 searchMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);

		//회원검색 
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요 ");
		System.out.print(" 아이디 : ");
		String id = scan.next();
		//비번 입력
		System.out.print(" 비밀번호 : ");
		String pw = scan.next();
		
		//아이디, 비번을 이용하여 객체를 만듬 
		Member1 member = new Member1(id,pw);
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴 
				int index = list.indexOf(member);// 번지찾기 
				if(index == -1) {
					return null;
				}
				Member1 tmp = list.get(index);
				
				//가져온 회원 정보의 비번과 입력한 비번을 비교하여 다르면 종료 
				if(!tmp.getPw().equals(member.getPw())) {
					return null;
				}
				
		
		
		
		return tmp;
	}

	public static boolean updateMember(ArrayList<Member1>list, Member1 updateTmp)	
	{
		
		///일치하지 않으면 껀너뜀
		if (updateTmp == null) {
			printStr("아이디 또는 비밀번호가 잘못됐습니다.");
			return false;
		}
		
		Scanner scan = new Scanner(System.in);
		//일치하는 회원 정보가 있으면 비번, 이름, 주민번호, 나이를 입력받음 
		System.out.print("수정할 회원 정보를 입력하세요 . ");
		
		System.out.print("비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		//입력받은 회원 정보를 이용하여 updateTmp를 수정 
		updateTmp.update(pw,name,residentNumber,age);
		return true;
	}

}
	