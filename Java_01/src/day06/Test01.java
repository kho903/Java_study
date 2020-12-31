package day06;

public class Test01 {
	public static void main(String[] args) {
//		is a 관계 => 모든 객체의 Data Type은 부모가 될 수 있다.
//		부모타입인 경우 접근 영역이 제한을 받는다. 메모리 하단부 접근 X
//		메모리 하단부 접근 하려면 다운 캐스팅 필요

		Dog d1 = new Dog();
		Animal d2 = d1;

//		System.out.println(d1.kind);
//		System.out.println(d2.kind);

		Dog d = new Dog();
		System.out.println(d.kind); // 강아지 종류
		// 업 캐스팅
		System.out.println(((Animal) d).kind); // 동물의 종류

		Animal dd = new Dog();
		System.out.println(dd.kind); // 동물의 종류
		// 다운 캐스팅
		System.out.println(((Dog) dd).kind); // 강아지 종류

		Fish f = new Fish();
		System.out.println("---------------------------");
		Animal a = new Animal();

		a = new Fish();
		a.breath();
//		a.print(); 오류 : 부모타입이므로 메모리 하단부 접근 X : 다운캐스팅
		((Fish) a).print();

		a = new Dog();
		a.breath();
		((Dog) a).print();

	}
}
