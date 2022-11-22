package day22;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Log {

	private String date;
	private ArrayList<StudentLog> slogs = new ArrayList<StudentLog>();
	
		//날짜 ,학생일지들(이름, 생년월일 출결)
	public Log(ArrayList<Student> stds, String date) {
		this.date = date;
		for(Student std : stds) {
			StudentLog slog = new StudentLog(std,null);
			slogs.add(slog);
		}
	}
	

}
