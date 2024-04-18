package basic.ch11;

public class Person {
	
	// this 의 3가지 사용방법
	// 1. this 는 자기 자신을 가리킨다.(인스턴스의 주소)
	// 2. 생성자에서 다른 생정자를 호출할때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)를 반환시킬 수 있다.
	
	
	// 변수 세팅 --> private = 기본값으로
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	// 1.
	// 생성자
	public Person(String name, int age) {
		// 자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name 을 대입
		this.name = name;
		this.age = age;
		
		
	}
	
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다. this(...)
		// 다른 생성자를 호출하면 가장 먼저 적고 후에 다른 수식을 작성해야 한다.
		this(name, age);
		this.phone = phone;
//		this.name = name;
//		this.age = age;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name,age,phone);
		this.gender = gender;
	}

	// 3. 자신의 주소값을 반환시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환시킨다.
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 :  " + name + " , 나이 : " + age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getGender() {
		return this.gender;
	}
}
