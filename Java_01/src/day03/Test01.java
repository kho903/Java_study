package day03;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(7 == 8);
		System.out.println("ABC".equals("ABC"));
		System.out.println("java".equals("sql"));
		System.out.println("sql".equals("java"));
		System.out.println("Hello".equals("HELLO")); // 대소문자 구분
		System.out.println("Hello".equalsIgnoreCase("HELLO")); // 대소문자 구분 X

		String s1 = "";
		String s2 = "";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
		
		int num = 99;
		Date d1 = new Date();
		String msg1 = new String("~~~~");
		String msg2 = "java";
		new String("java");
		d1 = null;
		msg2 = msg1;
		
	}

}
