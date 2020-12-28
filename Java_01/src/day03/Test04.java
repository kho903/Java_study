package day03;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		int i;
		for (i = 0; i < 10; i += 2)
			System.out.println("Hello Java " + i);

		System.out.println(i);

		System.out.println("-------------------------");

		for (int count = 9; count > 1; count--)
			System.out.println("html5");

		for (int count = 0;; count++) {
			System.out.println("~~~~~~~~~~");
			if (count == 4)
				break;
		}
		i = 0;
		System.out.println("----------------------------------");
		while (i < 5) {
			System.out.println("while loop " + i);
			i++;
		}

		String msg = "";
		boolean flag = false;
		while (!flag) {
			System.out.println("~~~~~~~~");
			System.out.println("입력값 : " + msg);
			msg = JOptionPane.showInputDialog("종료를 원하면 QUIT");
			if (msg.equalsIgnoreCase("quit")) {
				flag = !flag;
				System.out.println("종료");
			}
		}

		i = 9;
		while (i < 5) {
			System.out.println("while loop" + i);
			i++;
		}
		
		do {
			System.out.println("do while loop "+ i);
		}while(i<5);
	}
}
