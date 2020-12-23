package day02;

public class Prob2_김지훈{

	public static void main(String[] args) {
		/*
		 * 아래는 변수 num의 값에따라 양수 음수 0을 출력하는 코드이다. 
		 * 삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요.
		 */
		int num = 0;

		System.out.println("양수 음수  0 중 하나 출력");
		System.out.println(num>= 0? (num>0 ? "양수": '0'):"음수");
		/*
		 * 다음은 대문자를 소문자로 변경하는 코드입니다. 
		 * 변수 ch에 저장된 문자가 대문자 인 경우에만 
		 * 소문자로 변경하는 코드를 완성 합니다.
		 */
		char ch = 'P';
		if (ch>=65 && ch<=90)
			System.out.println((char)((int)ch + 32) + " 변환된값 출력");
	}
}