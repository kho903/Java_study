package day04;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if (args.length > 0 && args[0].length() > 0)
			System.out.println(args[1].charAt(0) + "**");
		
		int[] num = new int[Integer.parseInt(args[0])];
		System.out.println(Arrays.toString(num));
	}

}
