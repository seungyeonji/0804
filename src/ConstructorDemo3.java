/*
 * this() : new 없이 생성자를 호출하기 위한 메소드
 * 1 반드시 생성자메소드에서만 사용해야 하고
 * 2 반드시 생성자 메소드 내의 첫번째줄에 와야한다(주석은 첫번째줄에 와도 상관없음)
 */
public class ConstructorDemo3 {	//ThisDemo(this의 세번째 용법 - this method)
	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		System.out.println(jimin.name);		//이름 안줬으니까 null 나옴, 반대로 하면 salary가 0 나옴
		System.out.println(jimin.salary);		//-> 생성자를 통해서 이름만 들어오면 salary 기본값을 설정, salary만 들어오면 name에 기본값을 설정
	}													//Sawon 클래스에서 기본값 설정해줘도 자동초기화된 값 나옴
}														

class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name, 50000);
//		this.name = name;	//이미 넘어온 이름을 보냈으니까 해당 코드는 필요 없음
//		new Sawon(name, 500000);	//salary 기본값 설정 -> 계속 자동초기화 값 나옴
		}										//-> new는 새 주소를 만들기 때문에 new 쓰는 순간 주소가 바껴서 다시 초기화됨
	public Sawon(int salary) {
		this("Unknown", salary);
//		this.salary = salary;
//		new Sawon("Unknown", salary);		//name 기본값 설정
	}
	public Sawon() {		//기본생성자
		this("Unknown", 500000);
//		new Sawon("Unknown", 500000);
	}	
}
