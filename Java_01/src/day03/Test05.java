package day03;

public class Test05 {

	public static void main(String[] args) {
		
		// 1 ~ 100 합
		int sum = 0;
		for (int i= 1; i<=100; i++) {
			sum += i;
			System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.println(sum);
		
		for (int i=1; i<3; i++) {
			for(int j=9; j>7;j--) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}

}
