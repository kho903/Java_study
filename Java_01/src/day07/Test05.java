package day07;

import javax.swing.JOptionPane;

public class Test05 {
	public static void main(String[] args) {
		// 람다
		Command delete = () -> {
			System.out.println("delete ....");
		};

		Command insert = () -> System.out.println("insert ....");

		Command update = () -> System.out.println("update ....");
		update.exec();

		String msg = JOptionPane.showInputDialog("1. Delete  2. Insert  3.List  4.Update");
		switch (msg) {
		case "1":
			delete.exec();
			break;
		case "2":
			insert.exec();
			break;
		case "3":
			break;
		case "4":
			update.exec();
			break;
		default:
			System.out.println("~~~~~~~~");
		}

	}
}

@FunctionalInterface
interface Command {
	void exec();

	default public void base() {
		System.out.println("~~~~~~~~");
	}
}
