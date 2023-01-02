package day22;

import lombok.Data;

@Data
public class Student {
	private String name;
	private String birthday;
	
	
public Student(String name, String birthday) 
	{
	this.name= name;
	this.birthday =birthday;
	}

public Student(Student std)
	{
	// TODO Auto-generated constructor stub
	this.name = std.name;
	this.birthday = std.birthday;
	}

public Student(String name, int grade, int classNum, int num) {
	
}

}