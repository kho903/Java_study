package day05;

/**
 * 
 * @author 김지훈
 * @since 2020 12
 */

// javadoc *.java -encoding "utf-8"
public class Employee {
	// 데이터 + 기능
	protected String name; // 이름
	private String dept; // 부서
	private int age; // 나이

	public Employee() {
	}

	public Employee(String name, String dept, int age) {
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public Employee(String name, int age) {
		this(name, null, age); // this() 첫번째 라인 위치만 허용
//		this.name = name;
//		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age 양수만 가능
	 */
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	// 세금 계산
	public void print() {// 출력
		System.out.printf("[사원명 : %s, 근무부서 : %s, 나이 : %d]\n", this.name, this.dept, this.age);
	}

}
