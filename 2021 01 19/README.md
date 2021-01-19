# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 이진 검색 `binary search`
	+ 데이터가 키 값으로 이미 정려되어 있음을 전제
	+ 선형 검색보다 좀 더 빠르게 검색 가능
	+ 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색
	+ 한 단계씩 진행할 때마다 검색 범위가 반으로 좁혀짐

- 이진 검색 오름차순
```
package chap0;

import java.util.Scanner;

public class BinSearch {

	public static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pl <= pr);
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");

		int num = scan.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력");

		System.out.print("[0] : ");
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값 : ");
		int key = scan.nextInt();

		int index = binSearch(x, num, key);

		if (index == -1) {
			System.out.println("그 값의 요소가 없음");
		} else {
			System.out.println(key + "는 x[" + index + "]에 존재");
		}

	}
}
```

- 복잡도 `complexity`
	+ 알고리즘의 성능을 객관적으로 평가하는 기준
	+ 시간 복잡도 `time complexity`
		* 실행에 필요한 시간을 평가하는 것
	+ 공간 복잡도 `space complexity`
		* 기억 영역과 파일 공간이 얼마나 필요한가를 평가하는 것
	+ 2개 이상의 복잡도로 구성된 알고리즘의 전체 복잡도는 차원이 더 높은 쪽의 복잡도를 우선
	+ 전체 복잡도는 차원이 가장 높은 복잡도 선택
	
- `API`
	+ 라이브러리를 사용하는 방법을 작성해 놓은 것

- `binarySearch` 메소드
	+ 검색에 성공한 겨우
		* `key`와 일치하는 요소의 인덱스를 반환
		* 일치하는 요소가 다수이면 무작위의 인덱스를 반환
	+ 검색에 실패한 경우
		* 변환값 == 삽입 포인트
		* 삽입 포인트는 검색하기 위해 지정한 `key`보다 큰 요소 중 첫 번쨰 요소의 인덱스
```
package chap0;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력");

		System.out.print("x[0] : ");
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);
		}
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();

		int index = Arrays.binarySearch(x, key);

		if (index < 0) {
			System.out.println("그 값은 요소가 없음");
		} else {
			System.out.println(key + "는 x[" + index + "]에 있음");
		}
	}

}
```

- JAVA 메소드의 종류
	+ 인스턴스 메서드 == 비정적 메서드
		* `static`을 붙이지 않고 선언한 메서드
		* `클래스형 변수 이름.메서드 이름`
	+ 클래스 메서드 == 정적 메서드
		* `static`을 붙여 선언한 메서드
		* 클래스 전체에 대한 처리를 담당
		* 인스턴스 메서드와 처리 영역을 구분
		* `클래스 이름.메서드 이름`
	+ 클래스 변수도 인스턴스에 포함되지 않은 변수

- 클래스 생성자 예제
```
package chap0;

class Id {
	private static int counter = 0;
	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}
}

public class IdTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id a = new Id();
		Id b = new Id();

		System.out.println("a의 아디는 : " + a.getId());
		System.out.println("b의 아디는 : " + b.getId());

		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
	}

}
```

- `static int binarySearch(Object[] a, Object key)`
	+ 자연 정렬 방법
	+ 요소의 대소 관계를 판단

- `static <T> int binarySearch(T[] a, T Key, Comparator<? super T> c)`
	+ 순서로 줄지어 있는 배열에서 검색
	+ 자연 순서를 논리적으로 갖지 않는 클래스 배열에서 검색

- `String` 클래스가 구현한 메서드
	+ `Comparable<T>`
	+ `compareTo()`

- 자연 정렬로 정렬되지 않는 배열에서 검색
	+ 제네릭 메서드 `generic method`

- `Comparator` 사용 예제
```
package chap0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("이나영", 162, 1.3), new PhyscData("김동건", 165, 3.3),
				new PhyscData("오한얼", 169, 2.3), new PhyscData("강동진", 172, 1.8), new PhyscData("성민수", 177, 1.2),
				new PhyscData("이준표", 125, 0.7), new PhyscData("이준희", 100, 0.4), new PhyscData("정준희", 120, 0.5) };
		System.out.print("몇 cm인 사람을 찾고 있나 : ?");
		int height = scan.nextInt();
		int index = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

		if (index < 0) {
			System.out.println("요소가 없음");
		} else {
			System.out.println("x[" + index + "]에 있음");
			System.out.println("찾은 데이터 : " + x[index]);
		}
	}

}
```

- 제네릭
	+ 처리해야 할 대상의 자료형에 의존하지 않은 클래스(인터페이스) 구현 방식
	+ 자료형에 의존하지 않기 때문에 범용으로 사용

- 제네릭 클래스 예제
```
package dd;

class GenericClassTester {

	static class GenericClass<T> {
		private T xyz;

		GenericClass(T t) {
			this.xyz = t;
		}

		T getXyz() {
			return xyz;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
```