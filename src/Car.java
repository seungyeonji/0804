
public class Car {		//Car를 캡슐화
	private String name;
	private int price;
	
	public Car() {		//기본 생성자
		System.out.println("방금 객체가 생성되었습니다");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//↑ 아래코드를 자동으로 작성 : 변수 작성하고 코드 화면에 오른쪽 마우스 - source - generate getters and setters 클릭
	//우리가 할일은 only 변수만 만드는것
	
	public void myPrint() {
		System.out.println(this);		//여기서 this는 Car 클래스
	}
	
	
	//private 변수에 접근하는 방법은 method밖에 없음 = encapsulation
//	public void setName(String name) {		//Call by Reference
////		name = irum;
//		this.name = name;  	//this 붙으면 멤버변수, 아니면 지역변수
//	}	//irum을 name으로 해버리면 컴퓨터가 멤버변수랑 지역변수를 헷갈려버려서 null 출력 -> 이름을 다르게 하던지, 구별하기 위한 키워드를 넣어주던지 해서 해결
//		//-> my 의 의미를 갖고 있는 this.를 붙여줌 -> 이름이 같아도됨
//	public void setPrice(int price) {
////		price = money;
//		this.price = price;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getPrice() {
//		return price;
//	}
}
