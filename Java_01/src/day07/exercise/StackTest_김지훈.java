package day07.exercise;

public class StackTest_김지훈 {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	int top = 0;
	int size;
	int[] stack;

	public MyStack() {
		this.size = 10;
		stack = new int[10];
	}

	public MyStack(int size) {
		super();
		if (size < 0) {
			size = 10;
		}
		this.size = size;

		stack = new int[size];

	}

	public void push(int i) {
		if(top<size)
			stack[top++] = i;
		else
			stack[top] = i;
	}

	public boolean isFull() {

		return top + 1 == size;
	}

	public int top() {
		if(top!=0)
			return stack[top-1];
		else
			return stack[top];
	}

	public int pop() {
		if(top>0)
			return stack[--top];
		else
			return -1;
	}

	public boolean isEmpty() {

		return size == 0;
	}

}