
public class ConstuctorDemo {
	public static void main(String[] args) {
		Employee jimin = new Employee("2022-001", "한지민");		//객체를 만들면서 empno 넣기
		
//		jimin.setEmpno("2022-001");
//		jimin.setName("한지민");
		jimin.setSalary(1000000);
		jimin.setHiredate("2022-08-04");
		jimin.myPrint();
		
		//new함과 동시에(객체를 만들면서) 이름주기
		//employee 클래스에  employee 메소드 추가 -> 생성자
		//생성자도 메소드이다
		
//		Math m = new Math();		-> Math, System 클래스에 생성자가 없기 때문에 new 쓰면 안됨
//		System s = new System();
		
	}
}
