# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 스택 `stack`
    + 데이터를 일시적으로 저장하기 위한 자료구조
    + 가장 나중에 넣은 데이터를 가장 먼저 꺼냄
    + 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
    + 후입선출 `LIFO Last In First Out`
    + 데이터 추가 `push`
    + 데이터 반환 `pop`
    + `push`와 `pop`을 하는 위치의 꼭대기 `pop`
    + `stack`의 가장 아랫부분 `bottom`

> `JAVA` 프로그램에서 메서드를 호출하고 실행할 때 프로그램 내부에서 스택 사용

- 스택 구성요소
    + 스택 본체용 배열
        * 푸시된 데이터를 저장하는 스택 본체의 배열
    + 스택 용량
        * 스택의 용량을 나타내는 필드
    + 스택 포인터 `stack pointer`
        * 스택에 쌓여있는 데이터 수를 나타내는 필드

```
package stack;

public class IntStack {
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
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

}
```

- 스택 생성자
    + 스택 본체용 배열을 생성하는 준비작업

- `push`
    + 스택에 데이터를 푸시하는 메서드
```
public int push(int x) throws OverflowIntStackException {
    if (ptr >= max){
        throw new OverflowIntStackException();
    }
    retirm stk[ptr++] = x;
}
```

- `pop`
    + 스택의 꼭대기에서 데이터를 제거하고 그 값을 반환
```
public int pop() throws EmptyIntStackException {
    if (ptr <= 0){
        throw new EmptyIntStackException();
    }
    return stk[--ptr];
}
```

- `peek`
    + 스택의 꼭대기에 있는 데이터를 보는 메서드
```
public int peek() throws EmptyIntStackException {
    if(ptr <= 0){
        throw new EmptyIntStackException();
    }
    return stk[ptr - 1];
}
```

- `indexOf`
    + 검색 메서드
    + 스택 본체의 배열에 검색하려는 데이터가 포함되었는지 조사하는 메서드
    + 꼭대기부터 바닥으로 선형 검색 수행

- `clear`
    + 스택에 쌓여있는 모든 데이터를 삭제하는 메서드

- `capacity`
    + 스택의 용량을 반환하는 메서드

- `size`
    + 현재 스택에 쌓여 있는 데이터수를 반환하는 메서드

- `IsEmpty`
    + 스택이 비어 있는지 검사하는 메서드

- `IsFull`
    + 스택이 가득 찼는지 검사하는 메서드

- `dump`
    + 스택 안에 있는 모든 데이터를 바닥에서 꼭대기 순으로 표시

```
public int indexOf(int x){
    for(int i= ptr -1; i >= 0; i--){
        if(stk[i] == x){
            return i;
        }
    return -1;
    }
}

public void clear() {
    ptr = 0;
}

public int capacity(){
    return max;
}

public int size(){
    return ptr;
}

public boolean isEmpty(){
    return ptr <= 0;
}

public isFull(){
    return ptr >= max;
}

public void dump(){
    if(ptr <= 0){
        System.out.println("스택이 비어 있습니다");
    } else {
        for(int i=0; i< ptr; i++>{
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }
}
```
