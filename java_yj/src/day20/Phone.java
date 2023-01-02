package day20;

import lombok.Data;

@Data
public class Phone {
	private String name,company;
	private int pNumber;
	
	public Phone(String name, String company, int ... pNumber) {
	
		this.name = name;
		this.company = company;
		this.pNumber = pNumber;
	}



	@Override
	public String toString() {
		return "Phone [name=" + name + ", company=" + company + ", pNumber=" + pNumber + "]";
	}

	
	
	
	
	
}
