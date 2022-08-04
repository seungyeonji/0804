
public class Student {
	private String hakbun, name;		//학생을 만들고 학번과 이름을 물어보는 방식
	private int kor, eng, mat, tot;
	private double avg;
	private char grade;
	
	
	//생성자 활용해서 만들기(멤버변수, 생성자, 메소드)
	// : Student를 생성할 때 각 멤버변수 초기화
//	public Student(String hakbun, String name, int kor, int eng, int mat) {
//		this.hakbun = hakbun;
//		this.name = name;
//	}  -> 생성자 만들기 자동화 : source - generate constructor using field
	public Student(String hakbun, String name, int kor, int eng, int mat) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	
	//source - generate getters and setters
	public String getHakbun() {
		return hakbun;
	}
	
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
