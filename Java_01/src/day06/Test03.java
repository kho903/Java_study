package day06;

public class Test03 {

	public static void main(String[] args) {
		Dog[] dogs = { new Dog(), new Dog("진돗개", "캐리") };
		Fish[] fish = { new Fish("쿠피"), new Fish() };

		Animal[] animals = {
				new Dog(), 
				new Dog("진돗개", "캐리"), 
				new Fish("쿠피"),
				new Fish()
		};
		
		for (Animal data : animals) {
//			if (data instanceof Dog)
//				((Dog) data).print();
//			if (data instanceof Fish)
//				((Fish) data).print();
			
			// Animal 클래스에 public void print() {} 추가
			data.print();
			data.breath();
			
		}
	}

}
