package basic.exercise;

public class FunctionPractice {
	
	public static void main(String[] args) {
		
	greet("박태현");
	System.out.println(square(5));
	System.out.println(checkAdult(17));
	signOfNumber(23);
	System.out.println(findMax(5,4));
		
		
	}
	String name = "박태현";
	
	static void greet(String hello) {
		System.out.println("안녕하세요, " + hello + "님!");
	}
	static int square(int n1) {
		int result = n1 * n1;
		return result;
		
	}
	static boolean checkAdult(int age1) {
		boolean age2 = ( age1 >= 18);
		return age2;
		
	}

	static void signOfNumber(int bb) {
		if (bb > 0) {
			System.out.println("positive");
		} else if ( bb < 0) {
			System.out.println("negative");
		} else if ( bb == 0) {
			System.out.println("zero");
		}
		
		
	}
		static int findMax(int num3, int num4) {
			int result3;
			result3 = (num3 > num4)? num3: num4;
			return result3;
			
			
		}
		
	}
	

