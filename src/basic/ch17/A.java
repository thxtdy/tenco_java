package basic.ch17;

// 상상력을 펼쳐보쟈
// 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;

	// 바로 수정...

}

// 단, 하나의 자바 파일 안에 여러개의 클래스를 작성할 수 있다.
// 단, public 클래스는 오직 하나만 정의 가능하다.

// 복사 붙여넣기도 가능
class B {

	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName;
}

// 상속이라는 문법을 배운 개발자라면
// (상속받고자 하는 클래스,자식) extends (상속해주는 클래스,부모)
// 상속 후 확장 개념이기에 부모 클래스보다 자식 클래스가 크다.
class C extends A{
		
	int level;
	int nickName;
	String phone;
}





