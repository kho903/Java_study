package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// Array 선언 -> 생성 -> 초기화
		int[] score = null;
		score = new int[5];
		System.out.println(Arrays.toString(score));
		
		score[0] = 99;
		score[1] = 100;
		score[2] = 89;
		score[3] = 99;
		score[4] = 79;

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println(sum/score.length);
		
		System.out.println("============================");
		for(int s:score) {
			System.out.println(s);
		}
		
		System.out.println("============================");
		int[] num = new int[10];
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.random() * 100);
		}
		sum = 0;
		for(int data:num) {
			System.out.printf("%d ", data);
			sum += data;
		}
		System.out.println();
		System.out.println(sum);
	}

}
