package day06;

public class Test02 {
	public static void main(String[] args) {
		Dog d = new Dog();
//		d.breath();

		Fish f = new Fish();
//		f.breath();

		System.out.println("============================");
		Animal a = null;

//		a = d;
//		a = f;
//		a.breath();

		breathCall(d);
		breathCall(f);

	}

	public static void breathCall(Animal a) {
		a.breath();
	}

//	public void breathCall(Dog a) {
//		a.breath();	
//	}
//	public void breathCall(Fish a) {
//		a.breath();
//	}
}
