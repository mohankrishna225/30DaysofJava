import java.util.Stack;

public  class StackExample
{
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();

		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);

		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.search(3));
		System.out.println(stack.search(6)); //top element gets first Index here
		

		stack.add(15); // Since Extends Vector Class
		System.out.println(stack);
	}
}