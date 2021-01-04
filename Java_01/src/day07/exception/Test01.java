package day07.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("start");

		String msg = "-9";
		int num = 0;
		String[] s = null;
		try {
			System.out.println("try block 1");
			num = Integer.parseInt(msg);
			// num이 잘못된 형식으로 들어가면 NumberFormatException 발생,
			// 아래 라인 실행 X-> catch로 넘어감
			s = new String[num];
			//
			System.out.println("try block 2");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("정수 숫자를 입력하세요.");
		} catch (NegativeArraySizeException e) {
			System.err.println("배열의 사이즈는 음수가 들어갈 수 없음");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			s = null;
			System.out.println("자원반납");
		}

		System.out.println("num");
		System.out.println("end");
	}

}
