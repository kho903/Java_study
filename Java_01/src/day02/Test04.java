package day02;

public class Test04 {

	public static void main(String[] args) {
		int x = 100, y = 7;
		System.out.println(x / y);
		System.out.println(x % y);

		int num = 100;
		System.out.println(++num);
		System.out.println(num);

		String msg = null;
		msg = "HelloJava";
		int idx = 11;

		if (msg != null && (idx < msg.length() && idx >= 0))
			System.out.println(msg.toUpperCase().charAt(idx));
		else
			System.out.println("msg가 null이거나 유효하지 않은  idx입니다.");

		System.out.println(4 << 2); // 16
		System.out.println(4 >> 1); // 2
		System.out.println(4 & 1); // 0
		System.out.println(4 | 1); // 5
		
		int score = 90;
		String res = score > 70 ? "합격":"재시";
		System.out.printf("취득점수 : %d => %s\n", score, res);
		System.out.println();
		System.out.println("END");
	}
}
