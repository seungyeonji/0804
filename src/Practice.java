
public class Practice {	   	//7개의 피보나치 수열을 출력, n=(n-1)+(n-2), 1 1 2 3 5 8 13
	public static void main(String[] args) {
		//반복문 사용
//		int n1 = 1;
//		int n2 = 1;
//		
//		System.out.printf("%d\t%d\t", n1, n2);
//		
//		for(int i = 1; i< 6; i++) {
//			int n = n1 + n2;
//			System.out.printf("%d\t", n);
//			n1 = n2;
//			n2 = n;
//		}
		
		//반복문 사용 강사님 답안
//		int before = 1;
//		int after = 1;
//		int next = 0;
//		for(int i = 0; i < 7; i++) {
//			System.out.print(before + "\t");
//			next = before + after;
//			before = after;
//			after = next;
//		}
		
		
		//재귀호출 사용 -> fibo 메소드 만들어서 반복문 돌리기
		for(int i = 1; i<=7;i++) {
			System.out.print(fibo(i)+"\t");
		}
	}
	static int fibo(int n) {		//fibo(3) = fibo(2) + fibo(1)
											//fibo(4) = fibo(3) + fibo(2) = fibo(2) +fibo(2) + fibo(1)
		if(n==1 || n==2) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
}
