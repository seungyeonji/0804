/*
 * 생성자의 역할은 멤버변수(field, property)의 초기화
 * 파라미터가 없는 생성자를 기본 생성자라고 한다
 * 파라미터가 없는 기본 생성자는 어떻게 멤버변수를 초기화할것인가?
 * 메모리 힙에 없는 객체는 자동 초기화(String은 null주소, int는 0, double은 0.0, boolean은 false, char는 표현되지 않는 ascii값('\0' or '\u0000')
 * 이런 값들로 자동 초기화 해주는 게 기본 생성자가 하는 일(각 변수 타입에 맞춰 자동으로 초기화)
 * 
 * 기본생성자는 항상 해당 클래스의 생성자가 한개도 없을때 자동으로 만들어진다
 * 만일 한개라도 생성자가 존재하면 컴파일러는 자동으로 생성하지 않는다 -> line 37~47에 의해 line17 오류 발생
 * -> line39 추가해주면됨
 */

public class ConstructorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();	//기본 생성자
//		System.out.println(tiger.grade);
		MyCalendar mc = new MyCalendar();	//0년 0월 0일은 없으니까 기본 생성자를 쓰면 안되나? -> 기본생성자 만들어주면 됨
		System.out.println(mc.year);
		System.out.println(mc.month);
		System.out.println(mc.day);
	}
}



//<override>
//class MyCalendar {
//	int year, month, day;
//	public MyCalendar() {	//비현실적인 객체 만들면 안되는데 기본 생성자 쓰고 싶을 경우에는 기본생성자를 정의해줘야함 = Override
//		this.year = 2022;
//		this.month = 8;
//		this.day = 4;
//	}
//}


class MyCalendar {
	int year, month, day;
	public MyCalendar() {}
//	public MyCalendar(int year) {}
//	public MyCalendar(int year, int month) {}
	public MyCalendar(int year, int month, int day) {	//기본생성자가 아님 -> line 17에 에러남
		this.year = year;
		this.month = month;
		this.day = day;
	}
}


class Tiger {
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}