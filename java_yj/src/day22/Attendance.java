package day22;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Attendance {

	ArrayList<Student> stds = new ArrayList<Student>();
	ArrayList<Log> logs = new ArrayList<Log>();
	
	
}
