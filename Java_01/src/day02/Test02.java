package day02;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d2 = d;
		d = null;
		if(d!=null) System.out.println(d.toLocaleString());
		
		String msg = d2.toLocaleString();
		System.out.println(msg);
		
		new Date(); // 임시 객체 ==> 자동으로 gc의 대상이 된다.
		
		double pi = Math.PI;
		System.out.println(pi);
		
		double r = Math.round(pi);
		System.out.println(r);
		
		char ch = 'A'; // 65
		int c1 = 65;
		
		System.out.printf("%c , %d \n", ch, c1);
		System.out.printf("%d , %c \n", (int)ch, (char)c1);
		
		System.out.println("END");
		return;
	}

}
