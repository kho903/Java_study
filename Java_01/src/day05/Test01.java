package day05;

import day04.Employee;

public class Test01 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		emp1.name = "홍길동";
//		emp1.dept = "기술부";
		emp1.setName("홍길동");
		emp1.setDept("기술부");
		emp1.setAge(-29); // 적용 x
		emp1.setAge(29);

		emp1.print();

		Employee emp2 = null;
		if (emp2 != null)
			System.out.println(emp2.getDept()); // instance 자원

		System.out.println(Math.random()); // static 자원

	}

}
