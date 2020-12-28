package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("4층 건물이 있습니다.");
		System.out.println("층 번호를 입력하세요.");

		int floor = scanner.nextInt();
		switch (floor) {
		case 1:
			System.out.println("1층 약국");
			break;
		case 2:
			System.out.println("2층 피부과");
			break;
		case 3:
			System.out.println("3층 내과");
			break;
		case 4:
			System.out.println("4층 스포츠센터입니다.");
			break;

		}

	}

}
