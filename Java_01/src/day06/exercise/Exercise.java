package day06.exercise;

public class Exercise {

	public static void main(String[] args) {
		Student student = new Student("홍길동", 20, 200201);
		Teacher teacher = new Teacher("이순신", 30, "JAVA");
		Employee employee = new Employee("유관순", 40, "교무과");

		student.print();
		teacher.print();
		employee.print();
	}

}
