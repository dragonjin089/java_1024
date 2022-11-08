package day12;

public class Student {
	
		public int grade, classNum, num;
		public String name1; 
		


		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + ((name1 == null) ? 0 : name1.hashCode());
		result = prime * result + num;
		return result;
	}

		@Override
		public boolean equals(Object obj) {
			//같은객체공유
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (classNum != other.classNum)
				return false;
			if (grade != other.grade)
				return false;
			if (name1 == null) {
				if (other.name1 != null)
					return false;
			} else if (!name1.equals(other.name1))
				return false;
			if (num != other.num)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name1=" + name1 + "]";
		}

}
