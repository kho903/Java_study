package util;

public class Calc {
	static double pi = 3.14;

	// + - * /
	// 두 수를 더하는 add 함수 정의
	// static 영역에서는 this 사용 X
	// ... 메소드는 항상 마지막에 나와야 함
	// 예 ) add(int ... a, int b) -> X
	public static int add(int ... a) {
		int sum = 0;
		for(int data : a) {
			sum += data;
		}
		return sum;
	}

	public static double add(int a, double b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		if (b != 0)
			return (double) a / b;
		else
			return 0;
	}

}
