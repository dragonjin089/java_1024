package day27;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Board1 {

	private String title, content, writer;
	private ArrayList<Idpw> Bidpw = new ArrayList<Idpw>();

	public Board1(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board1(String title, String content, String writer, ArrayList<Idpw> bidpw) {
		
		this.title = title;
		this.content = content;
		this.writer = writer;
		Bidpw = bidpw;
	}

	
	

}
