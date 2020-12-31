package day06;

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
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.print();
		Dog d = new Dog("시츄", "캐리");
		System.out.println(d.kind);
		System.out.println(d.name);
		d.breath();
		d.print();
	}
}
