package day04;

public class Test03 {

	public static void main(String[] args) {
		int[] num1 = new int[] { 66, 77, 33, 55, 100 }; // new int[] 생략 가능
		int[] num2 = num1;
		int[] num3 = num2.clone();

		if (5 < num1.length && 5 >= 0)
			num1[5] = 11;
		num1[0] = 22;
		num1[0] = 33;

		num1 = null;
		num2 = null;
		System.out.println("----------------------------");

		int[] num4 = new int[] { 5, 9, 1, 4, 3 };
		int[] num5 = new int[num4.length * 2];
		
		
		System.arraycopy(num4, 0, num5, 0, num4.length);
		System.arraycopy(num4, 0, num5, num4.length, num4.length);
		System.out.println("----------------------------");
		
		String[] data = "고길동/ 99/ 77/ 100".split("/");

		double sum = 0;
		for(int i=1;i<data.length;i++) {
			sum += Double.parseDouble(data[i].trim());
		}
		System.out.printf("%s : %.2f\n", data[0], sum/3);
	}

}
