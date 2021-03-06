package day06_abstract;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super();
	}

	public Dog(String kind, String name) {
		super("강아지");
//		super.kind = "강아지";
		this.kind = kind;
		this.name = name;
	}

	@Override
	public void print() {
		System.out.printf("Dog[%s : %s : %s]\n", super.kind, this.kind, this.name);
	}
	
	@Override 
	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
}
