# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 다차원 배열
    + 배열을 구성 요소로 하는 것이 2차원 배열
    + 2차원 배열을 구성 요소로 하는 것이 3차원 배열
    + 보통의 배열과 구분된 다배열을 다차원 배열
    + `int[][] data = new int[n][n]`
        * `int형을 구성 자료형으로 하는 배열을 구성 자료형으로 하는 배열`을 의미
    + 요소 `element`
        * 자료형 레벨의 구성 요소

- 다차원 배열의 복제
```
int[][] a = {{1,2,3,4}, {5,6,7}};
int[][] b = a.clone();
```

- 확장된 `for`문
```
String[] a = {"hello", "kmd", "ddd"};

for(String tmp : a){
    System.out.println(tmp);
}
```

- 클래스 `class`
    + 임의의 데이터형을 자유롭게 조합해 만들 수 있는 자료구조
    + 여러 형의 요소를 조합해 만든 자료구조
    + `field`
        * 데이터 요소
    + 클래스형 변수 사용
        * 클래스형 변수를 만들고, 실체인 클래스 인스턴스 생성
        ```
        XYZ a;
        a = new XYZ();

        XYZ a = new XYZ();
        ```
    + [클래스의 배열](https://github.com/DongGeon0908/Data-Structure-And-Algorithm/blob/master/2021%2001%2015/src/PhysicalExamination.java)

- 클래스 본체와 멤버
    + 멤버
        * 필드, 메서드, 중첩 클래스, 중첩 인터페이스
        * 클래스 초기화, 인스턴스 초기화
        * 생성자
    + `public, protected, private` 지정 가능
    + 상속 가능

- 공개 클래스
    + 다른 패키지에서 사용할 수 있는 클래스

- `final` 클래스
    + 접근 제한자를 통해 서브 클래스를 가질 수 없음

- 파생 클래스
    + extends한 클래스

- 추상 클래스 `abstract class`
    + 불완전한 클래스
    + 추상 메서드를 가질 수 있는 클래스

- 중첩 클래스
    + 클래스 또는 인터페이스 안에 선언된 클래스
    + 멤버 클래스
        * 선언이 다른 클래스 또는 인터페이스 선언에 둘러싸인 클래스
    + 내부 클래스
        * 명시적으로, 암뭄적으로 정적으로 선언되는 않은 중첩 클래스
        * 정적 초기화 또는 멤버 인터페이스 선언 불가
    + 지역 클래스
        * 이름이 주어진 중첩 클래스
        * 어떤 클래스의 멤버도 될 수 없음
