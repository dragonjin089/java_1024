package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kiaCar k1 = new kiaCar("모닝");
		kiaCar k2 = new kiaCar("레이");
		kiaCar k3 = new kiaCar("k3");
		k1.print();
		k2.print();
		k3.print();
	
		k1.name = "K5";
//		k1.logo ="Kia";   가능하지만 일반적이지않음
		
		kiaCar.logo = "kia";
		
		
		System.out.println("--------------------------");
		k1.print();
		k2.print();
		k3.print();
	}

}

class kiaCar{
	public static String logo = "KIA";
	public String name;
	public kiaCar(String name) {
		this.name = name;
	}
public void print() {
	System.out.print("제조 회사 : " + logo);
	System.out.println(" : " + name);
}

public static void printLogo() {
	System.out.print(logo);
//	System.out.println(" : " + name);//에러발생
}
}
