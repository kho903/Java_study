package day03;

public class Test07 {

	public static void main(String[] args) {
		String msg = "hello" + ", " +1 + "java" + ", " + "spring"; // X
		System.out.println(msg);
		
//		StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer(); // 옛날 버전 똑같이 동작
		sb.append("Hello");
		sb.append(",");
		sb.append("1");
		sb.append("java");
		sb.append("spring");
		
		String result = sb.toString();
		System.out.println(result);
	}

}
