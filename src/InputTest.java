import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	Student jimin;
	
	@Before		//test 전에 jimin 만들기
	public void init() {
		jimin = new Student();
	}
	
	@Ignore @Test
	public void testInput() {
		Input input = new Input();
		input.input(jimin);
		assertEquals("한지민", jimin.name); //값이 일치하는지 확인(기대값, 입력값)
	}
	
	@Test
	public void testCalc() {
		Calc calc = new Calc();
		jimin.kor = 100;
		jimin.eng = 90;
		jimin.mat = 81;
		calc.calc(jimin);
//		assertEquals(270, jimin.tot);
//		assertEquals((int)(270/3.), (int)(jimin.avg));
		assertEquals('B', jimin.grade);
	}
}
