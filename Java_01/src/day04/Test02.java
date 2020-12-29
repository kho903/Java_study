package day04;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] num = { 5, 9, 3, 7, 11, 45, 23 };
		System.out.println(Arrays.toString(num));

		String[] names = new String[] { "홍길동", "고길동", "김길동", "박아무개", "이이" };
		System.out.println(Arrays.toString(names));

		// num 배열에서 50번 찾기
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 7) {
				System.out.printf("%d 위치 O", i);
				break;
			}

		}
		System.out.println();
		// names 배열에서 김길동 찾기
		for (int i = 0; i < names.length; i++) {
			if (names[i].contentEquals("김길동")) {
				System.out.printf("%d 위치 O", i);
				break;
			}
		}
		System.out.println();
		// names 배열에서 이름이 세글자인 사람만 출력하기
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 3) {
				System.out.println(names[i]);
			}
		}

		System.out.println("--------------------------------------");
		for (String data : names) {
			System.out.printf("%s , %c** \n", data, data.charAt(0));
		}

		boolean[] flag = new boolean[5];
		char[] ch = "hello java ~~~ ".toCharArray();
		System.out.println(ch.length);
		System.out.println("--------------------------------------");
	}

}
