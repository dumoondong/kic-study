package ex01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("박문수");
		stack.push("홍길동");
		stack.push("이몽룡");
		
		System.out.println(stack.toString());
		//get
		System.out.println(stack.pop());
		System.out.println(stack.toString());
	}

}
