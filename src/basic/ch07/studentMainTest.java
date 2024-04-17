package basic.ch07;

public class studentMainTest {

	public static void main(String[] args) {
		
		student student1 = new student();
		student1.studentID = 1001;
		student1.studentName = "샤코";
		student1.address = "푸른언덕";
		student1.study();
		student1.breakTime();
		student1.showInfo();
		
		student student2 = new student();
		student2.studentID = 2001;
		student2.studentName = "야스오";
		student2.address = "붉은 언덕";
		
		student2.showInfo();
		
		
	}
	// 함수
	// 자바에서 함수란 객체와 상관없이 독립적으로
	// 기능을 수행하는 일련의 코드 묶음...
	static double addDouble(double d1, double d2) {
		return d1 + d2;
	}
	
} // end of class
