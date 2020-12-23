package day02;

import java.util.Date;

public class Test01 {
	// 클래스의 구성요소
	// 변수 + 기능(method)
	public static void main(String[] args) {
		// 변수, 지역 변수, 초기화를 해야 사용 가능 
		
		// 기본형
		int num;
		num = 0;
		System.out.println(num);
		
		// String은 참조형이지만 세미 타입처럼 사용 가능
		String name1 = null;
		String name2 = null;
		
		name1 = new String("홍길동"); // X 일단 
		name2 = "고길동";             // O
		
		System.out.println(name1);
		System.out.println(name2);
		
		name1 = null;
		
		// 참조형
		Date now = new Date();
		Date now1 = new Date();		
		System.out.println(now);
		
		// 이름이 같은 것은 import 시키지 못함
		// 풀패키지로 써 주어야함
		java.sql.Date now2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(now2);
		
	}

}
