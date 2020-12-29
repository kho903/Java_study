package day05;

import util.Calc;

public class Test02 {

	public static void main(String[] args) {
//		int a = Calc.add(111, 4343);
//		int b = Calc.sub(9, 11);

//		System.out.println(Calc.multi(a, b));
//
//		int res = Calc.multi(2, 2);
//		int res2 = Calc.multi(2 + 2 + 2, Calc.add(9, 9));
		System.out.println("------------");
		
		// 메소드 오버로딩
		System.out.println(Calc.add(5, 5));
		System.out.println(Calc.add(1,2,3,4,5,6,7));
		System.out.println(Calc.add(1));
		
		System.out.println(Calc.add(5, 5.5));
		System.out.println(Calc.add(5.5, 5.5));
		System.out.println("------------");
		
		System.out.println(true);
		System.out.println('a');
		System.out.println(99.9999999999);
	}

}
