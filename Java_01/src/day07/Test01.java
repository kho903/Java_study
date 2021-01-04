package day07;

import day05.Employee;

public class Test01 {

	public static void main(String[] args) {
		SalesEmployee e = new SalesEmployee();
		e.print();
	}

}

class SalesEmployee extends Employee {
	SalesEmployee(){
		name = "홍길동";
	}
	
	public void print() {
		System.out.println(this.name);
	}
}
