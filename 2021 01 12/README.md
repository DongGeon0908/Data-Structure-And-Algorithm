# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 순차적(concatenation) 구조
    + 여러 문장(프로세스)이 순차적으로 실행되는 구조

- 선택(selection) 구조
    + `()`안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐픔을 변경하는 if문

- 순서도(flowchart)
    + 어떤 일을 처리할때 여러 종류의 상자와 이를 이어주는 화살표를 이용해 명령의 순서를 보여주는 알고리즘(algorithm) 혹은 프로세스(process)

- 쌍기(양 갈래) 선택
    + if문에 의한 프로그램 흐름의 분기

- `a -> max`
    + 변수 a의 값을 변수 max에 대입

- 알고리즘
    + 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이뤄진 집합

- 결정 트리(decision tree)
    + 조합을 나열한 모양이 나무(tree) 형태
    + 왼쪽 끝에서 시작해 오른쪽으로 이동

- 반복(repetition) 구조, 루프(loop)
    + 어떤 조건이 성립하는 동안 처리를 반복하여 실행하는 것

- 사전 판단 반복 구조
    + while문처럼 실행 전에 반복을 계속할지 판단하는 구조

- 가우스 덧셈
    + 1부터 N까지 덧셈
    + 짝수 -> `(1+N)*(N/2)`
    + 홀수 -> `N*((N-1)/2) + N`

- 사후 판단 반복문
    + do문처럼 일단 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지 판단하는 반복문

- 구조적 프로그래밍(structured programming)
    + 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치해 프로그램을 구성하는 방법
    + 순차, 선택, 반복이라는 3종류의 제어 흐름 사용

- 단축 평가(Short Circuit Evaluation)
    + 논리 연산의 식 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 정확해지는 경우 오른쪽 피연산자의 평가를 수행하지 않음

- 드로므간 법칙(De Morgan's law)
    + 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같음

- 다중 루프
    + 반복문 안에 반복문

- 자료구조
    + 데이터 단위와 데이터 자체 사이의 물리적 또는 논리적 관계
    + 데이터 단위
        * 데이터를 구성하는 한 덩어리
    + 자료구조
        * 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법

- 배열
    + 같은 자료형의 변수로 이루어진 구성 요소가 모인 것

- 접근 제한자
    + `public`
        * 모든 접근 허용
    + `protected`
        * 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용
    + `default`
        * 같은 패키지의 객체 허용
    + `private`
        * 현재의 객체 안에서만 허용

- 난수 생성 (1부터 10까지)
```
Random rand = new Random();
int a = rand.nextInt(10) + 1
```

- 전위형 증가 연산자 ++a
    + ++를 앞에 놓으면 식 전체를 평가하기 전에 피연산자의 값을 증가

- 후위형 증가 연산자 a++
    + ++를 뒤에 놓으면 식 전체를 평가한 후에 피연산자의 값을 증가

- 합성수
    + 약수의 개수가 3개 이상인 자연수

- [소수 구하기1](https://github.com/DongGeon0908/Data-Structure-And-Algorithm/blob/master/2021%2001%2012/src/primeNumber1.java)
    + for문을 통해 모든 조건 실행

- [소수 구하기2](https://github.com/DongGeon0908/Data-Structure-And-Algorithm/blob/master/2021%2001%2012/src/primeNumber2.java)
    + 구한 소수를 배열에 저장해서 계산수 줄이기

- [소수 구하기](https://github.com/DongGeon0908/Data-Structure-And-Algorithm/blob/master/2021%2001%2012/src/primeNumber3.java)
    + n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는 조건 활용