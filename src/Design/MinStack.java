package Design;

import java.util.Stack;

public class MinStack {

	static MinStack stack = new MinStack();

	Stack<Integer> stacks = new Stack<>();

	static Stack<Integer> minStack;

	public static void main(String[] args) {

		new MinStack();

		minStack.push(512);
		minStack.push(-1024);
		minStack.push(-1024);
		minStack.push(512);

		minStack.pop();
		System.out.println(getMin());

		minStack.pop();
		System.out.println(getMin());

		minStack.pop();
		System.out.println(getMin());
	}

	public MinStack() {
		minStack = new Stack<>();
	}

	public void push(int val) {
		stacks.push(val);

		if (minStack.isEmpty() || minStack.peek() >= val)
			minStack.push(val);
	}

	public void pop() {
		int top = minStack.peek();
		if (top == stacks.pop())
			minStack.pop();
	}

	public int top() {
		return stacks.peek();
	}

	public static int getMin() {

		return minStack.peek();
	}

}
