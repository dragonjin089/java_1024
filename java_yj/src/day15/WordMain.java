package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		// 새로운 클래스 필요 하나 만들어야함 
		ArrayList<Word> wordList = new ArrayList<Word>();
		
		
		do {
//			1. 메뉴 보여주기
			printMenu();
			try {
				//2. 메뉴 선택
				menu = scan.nextInt();
//				3. 메뉴 시작
				runMenu(menu,wordList);
			}
			catch(InputMismatchException e)
			{
				System.out.println("예외 발생 : 정수입력");
			}
			catch (Exception e) {
					System.out.println(e.getMessage());
			}

		} while (menu !=5);
		
	}
	
	
	private static void runMenu(int menu,ArrayList<Word> wordList) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1: 
			insertWord(wordList);
			break;
		case 2:
			// 단어 확인 
			printWordList(wordList);
			break;
		case 3:
			// 단어 확인 
			updateWord(wordList);			
			// 단어 수정
						
			break;
		case 4:
			deleteWord(wordList);
			
			break;
		
		
		case 5:
			System.out.println("프로그램 종료 합니다.");
			break;
			
		default: 
				throw new Exception("예외발생 잘못된 번호입니다.");
		
		}
		
	}


	private static void deleteWord(ArrayList<Word> wordList) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("단어 입력 : ");
		String word = scan.next();
		ArrayList<Integer> indexList = fineWordList(wordList,word);
		if(indexList == null || indexList.size() == 0 ) {
			throw new Exception("예외 발생 : 수정하려는 단어가 단어장에 없습니다.");
			
		}
		for(int i =0; i< indexList.size(); i++) {
			int index= indexList.get(i);
			System.out.println(i+1 + "," + wordList.get(index));
		}
		
		// 정할 단어 번호를 입력 : 3번입력 -> 4번지 객체 
		System.out.println("삭제할 번호 : ");
		int index = scan.nextInt() -1 ;
		
		if(index < 0 || index >= indexList.size()) {
			throw new Exception("예외발생 : 수정할 번호를 잘못 입력했습니다.");
		}
		wordList.remove((int)indexList.get(index));
		System.out.println("삭제가 완료됐습니다.");
	}


	private static void updateWord(ArrayList<Word> wordList) throws Exception{
		Scanner scan = new Scanner(System.in);
		//단어입력 : play
		System.out.println("단어 입력 : ");
		String word = scan.next();
		
		// 단어장에서 입력 단어와 일치하는 단어 객체들을 가져옴 
		// 실제 단어 번지 : 1, 2, 4
		ArrayList<Integer> indexList = fineWordList(wordList,word);
		//가져온 단어 객체들을 출력
		//화면에서 보여준 단어 번호 : 1, 2, 3		
		if(indexList == null || indexList.size() == 0 ) {
			throw new Exception("예외 발생 : 수정하려는 단어가 단어장에 없습니다.");
			
		}
		for(int i =0; i< indexList.size(); i++) {
			int index= indexList.get(i);
			System.out.println(i+1 + "," + wordList.get(index));
		}
		
		// 정할 단어 번호를 입력 : 3번입력 -> 4번지 객체 
		System.out.println("수정할 번호 : ");
		int index = scan.nextInt() -1 ;
		
		if(index < 0 || index >= indexList.size()) {
			throw new Exception("예외발생 : 수정할 번호를 잘못 입력했습니다.");
		}
		// 수정할 뜻을 입력
		System.out.println("뜻 : ");
		scan.nextLine();
		String mean = scan.nextLine();
		// 선택된 단어의 뜻을 수정 
		Word tmp = wordList.get(indexList.get(index));
		tmp.setMean(mean);
//		wordList.set(indexList.get(index), tmp);
	}


	private static ArrayList<Integer> fineWordList(ArrayList<Word> wordList, String word) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i<wordList.size(); i++) {
			if(wordList.get(i).equals(word)) {
				list.add(i);
			}
		}
		return list;
	}


	private static void insertWord(ArrayList<Word> wordList) {
		Scanner scan = new Scanner(System.in);
		// 단어  추가
					System.out.println("단어 입력 : ");
					String word = scan.next();
					scan.nextLine(); // 위에서 입력한 엔터를 처리 
					// 뜻 입력
					System.out.println("뜻 입력 : ");			
					String mean = scan.nextLine();
					// 단어 객체 
					Word tmp = new Word(word,mean);
					// 리스트에 단어 객체 추가 
					wordList.add(tmp);
	}


	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 단어 추가 ");
		System.out.println("2. 단어 확인 ");
		System.out.println("3. 단어 수정 ");
		System.out.println("4. 단어 삭제 ");
		System.out.println("5. 종    료 ");
		System.out.print("  메뉴선택 : ");
	}
	
	private static void printWordList(ArrayList<Word> wordList) {
		if(wordList == null || wordList.size() == 0) {
			System.out.println("단어장이 비었다 .");
			return;
		}
		for(Word tmp : wordList) {
			System.out.println(tmp);
		}
		System.out.println("------------------");
			}
	
	
	
	
}
