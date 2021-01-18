# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 선형 검색
    + 무작위로 늘어놓은 데이터 모임에서 검색 수행
    + 
- 이진 검색
    + 일정한 규칙으로 늘어놓은 데이터 모임에서 아주 빠른 검색 수행
- 해시법
    + 추가, 삭제가 자주 일어나는 데이터 모임에서 아주 빠른 검색 수행
- 체인법
    + 같은 해시 값의 데이터를 선형 리스트로 연결하는 방법
- 오픈 주소법
    + 데이터를 위한 해시 값이 충돌할 때 재해시하는 방법

- 선형 검색 `linear search` == 순차 검색 `sequential search`
    + 요소가 직선 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색
    + 선형 검색의 종료조건
        * 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
        * 검색할 값과 같은 요소를 발견할 경우
    + 시간 복잡도
        * `O(n)`

- 선형 검색 구현 프로그램 `while문` 구현
```
import java.util.Scanner;

public class SeqSearch {

	public static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n) {
				return -1;
			}

			if (a[i] == key) {
				return i;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int index = seqSearch(x, num, key);

		if (index == -1) {
			System.out.println("그 값의 요소가 없다.");
		} else {
			System.out.println(key + " 는 x[" + index + "]에 있다");
		}
	}

}
```

- 선형 검색 구현 프로그램 `for문` 구현
```
import java.util.Scanner;

public class SeqSearch {

	public static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int index = seqSearch(x, num, key);

		if (index == -1) {
			System.out.println("그 값의 요소가 없다.");
		} else {
			System.out.println(key + " 는 x[" + index + "]에 있다");
		}
	}

}

```
- 보초법 `sentinel method`
    + 반복문에서 종료 판단 횟수를 절반으로 줄임
    + 종료조건
        * 검색할 값을 발견하지 못 하고 배열의 끝을 지나간 경우
        * 검색할 값과 같은 요소를 발견한 경우
```
import java.util.Scanner;

public class SeqSearchSen {

	public static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (a[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int index = seqSearchSen(x, num, key);

		if (index == -1) {
			System.out.println("그 값의 요소가 없다.");
		} else {
			System.out.println(key + " 는 x[" + index + "]에 있다");
		}
	}

}
```