package day05;

public class Test03 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.print();

		Employee emp2 = new Employee("홍길동", "기술부", 28);
		emp2.print();
		
		Employee emp3 = new Employee("고길동", "영업부", 29);
		emp3.print();
		
		Employee emp4 = new Employee("이길동", 29);
		emp4.print();
	}

}
