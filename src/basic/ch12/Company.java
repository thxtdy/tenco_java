package basic.ch12;

public class Company {
	
	public static String campanyName = "그린컴퍼니";
	static int empSerialNumber = 1000;
	
	// 코드 테스트
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("박태현");
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 = new Employee("박태현");
		System.out.println(employee1.getEmployeeId());
		
		Employee employee3 = new Employee("박태현");
		System.out.println(employee1.getEmployeeId());
		
	}
}
