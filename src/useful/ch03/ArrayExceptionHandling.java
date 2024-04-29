package useful.ch03;

public class ArrayExceptionHandling {
	// 메인 쓰래드
	public static void main(String[] args) {

		// runtime error
		int[] arr = { 1, 2, 3, 4, 5 };

		try {

			// 예외가 발생할 수 있는 코드를 넣어서 수행시킨다.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 인덱스가 벗어났습니다.");
//			System.out.println(e.getMessage());
		}
		
		System.out.println("비정상 종료되지 않았습니다.");

	} // end of main

} // end of class
