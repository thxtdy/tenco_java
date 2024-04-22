package basic.ch14;

public class ArrayTest4 {
	public static void main(String[] args) {

		String[] arrayStr = new String[26];

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[4] = "E";  
		arrayStr[4] = "F"; // 위에서 아래로. 같은 인덱스 넘버라면 마지막으로 선언된 값을 출력함
		
		// 배열 안에 요소의 개수를 출력하시오.
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용
		int forCount = 0;
		int eCount = 0;
		for ( int i = 0; i < arrayStr.length; i++) {
			if(arrayStr[i] != null) {
				eCount++;
				
			}
			System.out.println(arrayStr[i]);
			forCount++;
		}
		
		System.out.println("배열의 개수 :" + forCount + "개");
		System.out.println("요소의 개수 :" + eCount + "개");
		
	}
}
