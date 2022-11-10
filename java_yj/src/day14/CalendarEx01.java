package day14;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		// caleender 클래스 : 날짜와 관련된 클래스 
		 // get()을 통해서 년도 월 일 시 분 초등을 다양한 정보를 가져옴
		
		Calendar cal= Calendar.getInstance();
		
		cal.add(Calendar.YEAR, 1);//지금 시간으로 1년 후로 한다. 
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "년");
		int month= cal.get(Calendar.MONTH)+1;
		System.out.print(month + "월");
		int date = cal.get(Calendar.DATE);
		System.out.print(date + "일");
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.print(hour + "시 ");
		int min = cal.get(Calendar.MINUTE);
		System.out.print(min+"분");
		int sec = cal.get(Calendar.SECOND);
		System.out.print(sec + "초");
		
	}

}
