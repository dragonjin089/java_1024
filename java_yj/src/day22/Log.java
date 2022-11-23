package day22;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Log {

	private String date;
	private ArrayList<StudentLog> slogs = new ArrayList<StudentLog>();
	
		//날짜 ,학생일지들(이름, 생년월일 출결)
	public Log(ArrayList<StudentLog> stdLogs, String date) {
		this.date = date;
		this.slogs = stdLogs; //원래는깊은 복사를 해야하는데 간단하게 얕은 복사를 이용 
		
	}
	

}
