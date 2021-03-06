package day06_abstract;

public class Fish extends Animal {
	String name;

	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기...");
	}

	@Override
	public void print() {
		System.out.printf("Fish[ %s : %s ]\n", kind, name);
	}

}
