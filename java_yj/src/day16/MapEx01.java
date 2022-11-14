package day16;


import java.util.*;
import java.util.Map.Entry;




public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//키는 중복이안되고 벨류는 중복이안됨
		HashMap<String,String> userList = new HashMap<String, String>();
		userList.put("id1", "pw1");
		userList.put("id2", "pw2");
		userList.put("id3", "pw2");
		userList.put("id3", "pw3");
		
		System.out.println(userList);
		//get 은 키값을 이용하여 벨류값을 찾음
		// 방법 1 . KeySet 이요 
		// keySet()은 map 에 있는 key들을 하나의 set에 담아 반환하는 메소드 
		String findKey = scan.nextLine();
		Set<String> keySet = userList.keySet();
		for(String tmp : keySet) {
			System.out.println(tmp + " : "
					 + userList.get(tmp));
		}
		// 방법 2. EntrySet을 이용 
		Set<Entry<String, String>> entrySet = userList.entrySet();
		for(Entry<String, String> tmp: entrySet) {
			System.out.println(tmp.getKey() + " : " + tmp.getValue());
		}
	}

}
