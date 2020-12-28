package day03;

public class Prob3 {
	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			char r = c >= 'a' && c <= 'w' ? (char) (c + 3) : (c >= 'x' && c <= 'z' ? (char) (c - 23) : c);
//			encodedString += r;
			sb.append(r);
		}
		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부 끝.
		encodedString += sb;
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}

//*****  실행시 출력예시 *****
//암호화할 문자열 : everyday we have is one more than we deserve
//암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh