package day13;

import lombok.Data;

@Data
public class Score2 {

	// 필드 : 과목, 학기, 중간, 기말 , 수행평가, 총점
	private String title;
	private int term, midScore, finalScore, performace;
	private double total;
	
	
	// 메소드 : equals() : 성적 추가 시 활용, toString() 성적 출력 시  활용 
	// getter, setter 

	@Override
	public String toString() {
		return "[" + term + "학기" + title + " 중간 : " + midScore + " 기말 : " + finalScore + 
				", 수행 : " + performace +" 총점 : " + total + "]";
	}
	
	// 생성자 : 과목 , 학기 , 중간 , 기말 , 수행평가가 필요한 
	public Score2(String title, int term, int midScore, int finalScore, int performace) {
		
		this.title = title;
		this.term = term;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.performace = performace;
		
	}
	
	//       : 과목 학기가 필요한 생성자 (성적이 같은지 확인할 때 ) 
	public Score2(String title, int term) {
		
		this.title = title;
		this.term = term;
		
	}
	
	//복사 생성자 
	
	
	public Score2(Score2 s) {
		this(s.title, s.term, s.midScore, s.finalScore, s.performace);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score2 other = (Score2) obj;
		if (finalScore != other.finalScore)
			return false;
		if (midScore != other.midScore)
			return false;
		if (performace != other.performace)
			return false;
		if (term != other.term)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + finalScore;
		result = prime * result + midScore;
		result = prime * result + performace;
		result = prime * result + term;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
