package day03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("성적처리 App start");

		String name = null;
		int kor = 0;
		int math = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("계속 진행하고 싶은면 yes를 입력하세요. 그렇지 않으면 no를 입력하세요.");

		String msg = scanner.nextLine();
		if (!msg.equalsIgnoreCase("Yes")) {
			if (scanner != null)
				scanner.close();
			scanner = null;
			System.out.println("종료합니다.");
			return;
		}
		System.out.println("학생 이름을 입력하세요.");
		name = scanner.nextLine();
		System.out.println("국어 점수를 입력하세요.");
		kor = Integer.parseInt(scanner.nextLine());
		System.out.println("수학 점수를 입력하세요.");
		math = scanner.nextInt();
		scanner.nextLine();

		double avg = (kor + math) / 2.;
		String error = avg >= 0 && avg <= 100 ? "" : "error : 점수확인 필요";

		// 등급 처리
		char grade = 'A';

		if (avg >= 90 && avg <= 100) {
			grade = 'A';
		} else if (avg >= 80 && avg <= 89) {
			grade = 'B';
		} else if (avg >= 70 && avg <= 79) {
			grade = 'C';
		} else if (avg >= 60 && avg <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		/*
		 * char test = '+'; // +, -, *, / switch (test) { case '+':
		 * System.out.println("+"); break; case '-': System.out.println("-"); break;
		 * case '*': System.out.println("*"); break; case '/': System.out.println("/");
		 * break; default: System.out.println("입력오류"); }
		 */

		char gradeS = ' '; // "", ' '
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			gradeS = 'A'; // "", ' '
			break;
		case 8:
			gradeS = 'B'; // "", ' '
			break;
		case 7:
			gradeS = 'C'; // "", ' '
			break;
		case 6:

			gradeS = 'D'; // "", ' '
			break;
		default:
			gradeS = 'F';
		}
		
		// 삼항 연산자

		System.out.printf("이름 : %s, 국어 : %d, 수학 : %d\t 평균:%.2f , 등급 : %c \n ", name, kor, math, avg, gradeS);
		System.out.println(error);
		System.out.println("성적처리\t App end");
		if (scanner != null)
			scanner.close();
		scanner = null;
		System.out.println("종료합니다.");
		return;
	}

}
