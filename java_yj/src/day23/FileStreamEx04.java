package day23;

import java.io.*;

import lombok.Data;
public class FileStreamEx04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		
		try {
		fos = new FileOutputStream("test.txt");
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Student("홍길동", "2000-0-00"));
		oos.writeObject(new Student("홍길김", "2000-11-00"));
		oos.writeObject(new Student("김길동", "2000-02-00"));
		
		}catch(EOFException e) {
			System.out.println("파일 읽기가 완료 되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		try {
			
			fis = new FileInputStream("test.txt");
			ois = new ObjectInputStream(fis);			
			while(true){
				Student std =(Student)ois.readObject();
				System.out.println(std);
			}
			}
			catch(EOFException e) {
				System.out.println("파일 읽기가 완료 되었습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
					fos.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
	}
	}
}
@Data
class Student implements Serializable{
	
	private static final long serialVersionUID = 1700858336115503227L;
	private String name;
	private String birthday;
	
	public Student(String name, String birth) {
		this.name = name;
		this.birthday = birth;
		
	}
}
	
	
