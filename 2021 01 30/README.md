# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 재귀 `recursive`
    + 어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용해 정의됨
    
- 재귀적 정의 `recursive definition`

- 재귀적 호출 `recursive call`
    + 자기 자신과 똑같은 메서드 호출
    + 직접 재귀 `direct`
        * 자신과 같은 메서드를 호출
    + 간접 재귀 `indirect`    
        * `a` 메서드가 `b` 메서드를 호출하고, 다시 `b` 메서드가 `a` 메서드를 호출하는 구조

- 유클리드 호제법 `Euclidean method of mutual division`
    + 두 정수가 주어질 경우 큰 값을 작은 값으로 나누었을 때 나누어떨이즌 가장 작은 값이 최대공약수
    + 나누어지지 않으면 작은 값에 대해 나누어 떨어질 때 까지 같은 과정을 재귀적으로 반복