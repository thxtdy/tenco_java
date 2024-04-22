package basic.ch14;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		String[] names = new String[5]; // 5칸짜리 메모리 공간 할당
		
		// 생성 - Create
		names[0] = "김씨";  // 인덱스 연산자
		names[1] = "나씨";
		names[2] = "박씨";
		names[3] = "이씨";
		
		// names[4] = null
		
		// 조회 - Read
		System.out.println(names); // < -- 주소값
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		// System.out.println(names[5]); <-- 없는 값
		
		// 수정 Update
		names[0] = "Mr.Kim";
		names[1] = "Mr.Na";
		names[2] = "Mr.Park";
		names[3] = "Mr.Lee";
		
		// 삭제 - Delete
		names[0] = null;
		names[1] = null;
		names[2] = null;
		
		// 자바에서 null 값은 할당되지 않은 상태를 의미한다.
		// Object 타입에서 사용 가능...
		
		// 1단계
		// 배열의 길이와 인덱스의 길이에 대한 이해~ = 인덱스의 길이는 n - 1 이다. (단, n 은 배열의 길이다.)
		System.out.println("배열의 크기 : " + names.length);
		System.out.println("인덱스의 크기 ( n - 1 ): " + (names.length - 1 ));
		
		// 문제 2
		// 배열의 크기가 50이면 인덱스의 길이는 49이다.
		// 배열의 크기가 100 이면 인덱스의 길이는 99이다.
		// 배열의 크기가 375 이면 인덱스의 길이는 374이다.
		
		
		
		
	} // end of main
	
} // end of class
