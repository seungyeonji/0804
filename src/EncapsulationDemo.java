
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
//		sonata.name = "소나타";		
//		sonata.price = 30_000_000;
//		System.out.println("이름은 " + sonata.name + ", 가격은 " + sonata.price + "원입니다");
		//Car 클래스의 변수들을 private으로 바꾸면 오류 발생 -> 입출력 모두(set, get) 안됨
		
		//Car 클래스에서 setName() 메소드 만들어서 해결 -> Car 클래스를 Encapsulation
		sonata.setName("소나타");  	//직접 접근이 안되니까 operation을 통해 소나타를 대입
		sonata.setPrice(40_000_000);
		System.out.println("이름은 " + sonata.getName() + ", 가격은 " + sonata.getPrice() + "원입니다");
	}
}
