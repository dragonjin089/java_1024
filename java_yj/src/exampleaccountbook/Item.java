package exampleaccountbook;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Item {
	private String type, purpose, content;
	private int money;
	private Date date;
	
	public Item(String type, String purpose, String content, int money, String date) throws ParseException {
		this.type = type;
		this.purpose = purpose;
		this.content = content;
		this.money = money;
		setDate(date);
	}
	public void setDate(String Date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//parse excepiton은 runtime exception이 아니기때문에 예외처리
		this.date = format.parse(Date);
	}
	
	public String getDateStr() {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 return format.format(date);
	}
	public String getMoneyStr() {
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(money);
	}
	
	public void print() {
		System.out.println("구분 : " + type);
		System.out.println("분류 : " + purpose);
		System.out.println("내용 : " + content);
		System.out.println("금액 : " + getMoneyStr() + "원");
		System.out.println("일시 : " + getDateStr());
	}
	@Override
	public String toString() {
		return type + " | " + getDateStr() + " | "+ purpose + " | " + getMoneyStr() + "원"  + " | " + content;
		}
}
