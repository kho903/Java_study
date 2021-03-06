package day06.exercise;

public class Employee extends Person {
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super();
		setName(name);
		setAge(age);
		setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("부      서 : %s\n", getDept());
	}
}
