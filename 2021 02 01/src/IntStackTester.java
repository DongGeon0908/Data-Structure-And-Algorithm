package stack;

import java.util.Scanner;

public class IntStackTester {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체

	// 스택이 비어 있는 경우 예외처리
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 스택이 가득참 예외처리
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// 생성자
	public IntStackTester(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}

	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0) {
			System.out.println("스택이 비어 있습니다");
		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntStackTester s = new IntStackTester(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("1. 푸시   2. 팝   3.피크  4.덤프   0.종료");

			int menu = scan.nextInt();
			if (menu == 0) {
				break;
			}

			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = scan.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;
			}
		}
	}

}
