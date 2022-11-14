package day16;

import lombok.Data;

@Data
public class Member1 {
//리스트 이용방법
	private String id, pw, name, residentNumber;
	private int age;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31; //2^n 중 소수가장가까운수
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	public Member1(String id, String pw, String name, String residentNumber, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.residentNumber = residentNumber;
		this.age = age;
	}
	
	public Member1(String id, String pw) {
		//생성자 오버로딩 
		this.id = id;
		this.pw = pw;
	}
	public void update(String pw, String name, String residentNumber, int age) {
		// TODO Auto-generated method stub
		this.pw = pw;
		this.name = name;
		this.residentNumber = residentNumber;
		this.age = age;
	} 
	
	
	
}
