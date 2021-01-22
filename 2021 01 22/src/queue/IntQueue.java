package queue;

import java.util.Scanner;

public class IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행 시 예외 : 큐가 가득 참
	public class OverfolwIntQueueException extends RuntimeException {
		public OverfolwIntQueueException() {

		}
	}

	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverfolwIntQueueException {
		if (num >= max) {
			throw new OverfolwIntQueueException();
		}
		que[rear++] = x;
		num++;
		if (rear == max) {
			rear = 0;
		}
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // 큐가 비어있음
		}
		int x = que[front++];
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}

	// 큐에서 데이터를 피크 (프런트 데이터를 확인)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		}
		return que[front];
	}

	// 큐에서 x를 검색해 인덱스를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int index = (i + front) % max;
			if (que[index] == x) { // 검색 성공
				return index;
			}
		}
		return -1; // 검색 실패
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는지 확인하는 방법
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 차있는지 확인
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if (num <= 0) {
			System.out.println("큐가 비어 있습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntQueue s = new IntQueue(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("1. 인큐  2. 디큐  3. 피크  4. 덤프  0. 종료");

			int menu = scan.nextInt();
			if (menu == 0) {
				break;
			}

			int x;
			switch (menu) {
			case 1: // 인큐
				System.out.print("데이터 : ");
				x = scan.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverfolwIntQueueException e) {
					System.out.println("큐가 가득 참");
				}
				break;

			case 2: // 디큐
				try {
					x = s.deque();
					System.out.println("디큐한 데이터느 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;
			}
		}
	}
}
