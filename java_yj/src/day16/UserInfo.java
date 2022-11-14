package day16;

public class UserInfo {

	private String id;
	private String pw;
	private String name;
	private int num;
	private int longNum;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getLongNum() {
		return longNum;
	}
	public void setLongNum(int longNum) {
		this.longNum = longNum;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", pw=" + pw + ", name=" + name + ", num=" + num + ", longNum=" + longNum + "]";
	}
	
	public UserInfo(String id, String pw, String name, int num, int longNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.num = num;
		this.longNum = longNum;
	}
	
	
	
}
