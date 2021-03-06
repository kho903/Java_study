package day04;

public class Test06 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("홍길동");
		emp1.setDept("기술부");
		emp1.setAge(-29);
//		emp1.print();

		Employee emp2 = new Employee();
		emp2.setName("고길동");
		emp2.setDept("영업부");
		emp2.setAge(27);
//		emp2.print();

		Employee emp3 = new Employee();
//		emp3.print();

		Employee[] employees1 = new Employee[100];
		System.out.println("사원 검색");
		Employee[] employees = { emp1, emp2, emp3, null, null, null, null };
		// employees 에서 영업부에 근무하는 사원 목록
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getDept() != null && employees[i].getDept().equals("영업부")) {
				employees[i].print();
			}
		}

		// employees 에서 이름 검색

	}
}

class Emp {
	// 데이터 + 기능
	String name; // 이름
	String dept; // 부서
	int age; // 나이

	// 세금 계산
	public void print() {// 출력
		System.out.printf("[사원명 : %s, 근무부서 : %s, 나이 : %d]\n", name, dept, age);
	}

}