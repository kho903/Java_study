package day02;

import javax.swing.JOptionPane;

public class Prob2_김지훈 {

	public static void main(String[] args) {
		/*
		 * 아래는 변수 num의 값에따라 양수 음수 0을 출력하는 코드이다. 
		 * 삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요.
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요 : "));
		String res = num >= 0 ? (num > 0 ? "양수" : "0") : "음수";
		System.out.printf("%d => %s \n", num, res);
		/*
		 * 다음은 대문자를 소문자로 변경하는 코드입니다. 
		 * 변수 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성 합니다.
		 */
		char ch = JOptionPane.showInputDialog("문자를 입력하세요 : ").charAt(0);

		char res2 = ch > 'A' && ch < 'Z' ? (char) ((int) ch + 32) : ch;
		System.out.printf("%s => %s \n", ch, res2);
	}
}