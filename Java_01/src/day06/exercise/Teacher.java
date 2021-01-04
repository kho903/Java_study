package day06.exercise;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(){
		super();
	}
	
	public Teacher(String name, int age, String subject) {
		super();
		setName(name);
		setAge(age);
		setSubject(subject);
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("담당과목 : %s\n", getName(), getAge(), getSubject());
	}
}
