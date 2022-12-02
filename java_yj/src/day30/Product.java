package day30;

import lombok.Data;

@Data
public class Product {
private String type, name;
private int count, buyPrice, sellPrice;

public Product(String type, String name, int count, int buyPrice, int sellPrice) {	
	this.type = type;
	this.name = name;
	this.count = count;
	this.buyPrice = buyPrice;
	this.sellPrice = sellPrice;
}

@Override
public String toString() 
{
	return 	"\n"+
			"분류 : "+ type + "\n"+
			"제품명 : "+name + "\n"+
			"수량 : "+count + "\n"+
			"구매가격 : "+buyPrice + "\n"+
			"판매가격 : "+sellPrice + "\n";
}



}
