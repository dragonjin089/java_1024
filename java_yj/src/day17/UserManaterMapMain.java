package day17;

import java.util.HashMap;
import java.util.Scanner;

public class UserManaterMapMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		HashMap<String, Member> map = new HashMap<String, Member>();
		
		do {
			System.out.println("회원정보관리 프로그램");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
		
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: 
				if(addMember(map)) {
					System.out.println("회원정보가추가되었습니다.");
				}else {
					System.out.println("이미 가입된 아이디입니다.");
				}
				break;
			case 2:
				if(!searchMember(map)) {
					System.out.println("아이디 또는 비번이 일치하지 않습니다.");
				}
	
				break;
			case 3:
				if(updateMember(map)) {
					System.out.println("회원 정보를 수정했습니다.");
				}else {
					System.out.println("아이디 또는 비번이 일치하지 않습니다.");
				}
				break;
			case 4:
				if(deleteMember(map)) {
					System.out.println("회원정보를 삭제했습니다.");
				}else {
					System.out.println("아이디 또는 비번이 일치하지 않습니다.");
				}
				break;
			case 5: 
				break;
				
			default:
			}
		}while(menu !=5);
	}
	
	public static boolean addMember(HashMap<String, Member> map) {
		if(map == null) {
			throw new RuntimeException("예외발생 : Map이 null입니다.");
		}
		System.out.println("회원 정보 입력 ");
		System.out.println("아이디 : ");
		String id = scan.next();
		System.out.println("비밀번호 : ");
		String pw = scan.next();
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("주민번호 : ");
		String residentNumber = scan.next();
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		//map 에 있는지 확인
		Member addTmp = map.get(id); // 키값과 일치하는 벨류값을 가져옴 
		//있으면 건너뜀
		if(addTmp != null) {// if(map.get(id)  != null
			System.out.println("이미 추가된 아이디 입니다.  ");
			return false;
		}
		//없으면 추가 
		map.put(id, new Member(pw,name,residentNumber,age));
		return true;
	}
	
	public static boolean searchMember(HashMap<String, Member> map) {
		System.out.println("검색할 회원 정보를 입력하세요 ");
		System.out.print(" 아이디 : ");
		String id = scan.next();
		//비번 입력
		System.out.print(" 비밀번호 : ");
		String pw = scan.next();
		
		//아이디를 이용하여 회원 정보를 가져옴 
		Member searchTmp = map.get(id);
		
		// 일치하는 회원 정보가 없으면 건너뜀
		if(searchTmp == null) {
			return false;
		}
		
		// 가져온 회원정보에서 비번이 같은지를 확인하여 같으면  회원정보 출력
		if(!searchTmp.getPw().equals(pw)) {
			return false;
		}
		System.out.println(id +" :"+ searchTmp);
		return true;
		//다르면 종료
		
	}
	public static boolean updateMember(HashMap<String, Member> map) {
		System.out.println("검색할 회원 정보를 입력하세요 ");
		System.out.print(" 아이디 : ");
		String id = scan.next();
		//비번 입력
		System.out.print(" 비밀번호 : ");
		String pw = scan.next();
		
		Member updateTmp = map.get(id);
		if(updateTmp == null || updateTmp.getPw().equals(pw)) {
			return false;
		}
		
		System.out.println("수정할 회원 정보 입력 ");
		System.out.print("새 비밀번호 : ");
		String newPw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		updateTmp.update(newPw,name,residentNumber,age);
		return true;
	}
	public static boolean deleteMember(HashMap<String, Member> map)
	{
		System.out.println("삭제할 회원정보를 입력하세요 . ");
		System.out.println("아이디 : ");
		String id = scan.next();
		System.out.println("비밀번호 : ");
		String pw = scan.next();
		
		Member deleteTmp = map.get(id);
		if(deleteTmp == null || !deleteTmp.getPw().equals(pw)) {
			return false;
		}
		
		map.remove(id);
		return true;
	}
}
