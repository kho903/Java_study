package day01;

public class Test04 {
	// 데이터(변수) + 기능(함수)

	public static void main(String[] args) {
		int num1 = (int) 9999999999l;
		System.out.printf("%d \n", num1);

		double num2 = 99.9f;
		System.out.printf("%.2f \n", num2);

		char ch = 'A';
		System.out.printf("%c, %c %n", ch, ++ch);

		int a = 65, b = 66;
		boolean flag = a > b;
		System.out.printf("10 == 9 ==> %s %n", flag);
		
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name);
		System.out.println(name.charAt(0) + "씨");
	}

}
