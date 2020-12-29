package day04;

public class Exercise {
	public static void main(String[] args) {
//		예제 )문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
		String msg = "yes";
		boolean b = msg == "yes" ? true : false;
		System.out.println(b);

//		예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
//		몇까지 더해야 총합이  100  이상이 되는지 구하시오 .

		int i = 1;
		int sum2 = 0;
		while (true) {
			if (i % 2 == 0) {
				sum2 -= i;
			} else {
				sum2 += i;
			}
			if (sum2 >= 100) {
				break;
			}
			i += 1;
		}
		System.out.println(i);

		// 예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오 .

		int[] arr = {10, 20, 30, 40, 50}; 
		int sum3 = 0;
		for(int a : arr) {
			sum3 += a;
		}
		System.out.println(sum3);
		
	}
}
