
public class ThisDemo1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Lion another = lion.getLion();		//주소복사
		System.out.println(another.name);
		System.out.println(another.age);
	}
}

class Lion{
	String name = "한지민";
	int age = 26;
	Lion getLion(){		//this를 리턴해야 하니까 return type은 Lion
		return this;
	}
}