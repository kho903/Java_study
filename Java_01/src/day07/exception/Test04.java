package day07.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("start");
		try (Scanner scanner = new Scanner(new File("data.txt"));) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
//			System.err.println(e.getMessage());
			System.out.println("data.txt 파일 준비 하세요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("end");
	}

}
