package day27;

import lombok.Data;

@Data
public class Idpw {

	private String id,pw;

	public Idpw(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public logIn(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "id : " + id + ", pw : " + pw ;
	}

	
}
