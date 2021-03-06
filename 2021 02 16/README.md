# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 집합 `set`
    + 명확한 조건을 만족하는 자료의 모임
    + 객관적으로 범위를 규정한 모임
    + 집합에 포함되는 요소는 서로 상이
        * 집합은 집합을 요소로 가질 수 없음
    + `element`
        * 집한 안에서 각각의 요소

- 무한집합
    + 정수집합
    + 요소의 개수가 무한한 집합

- 유한집합
    + 요소의 개수가 유한한 집합

- 공집합
    + `empty set`
    + 요소가 하나도 없는 집합

- 부분집합
    + 진부분집합
        * 집합 `A`의 모든 요소가 집합 `B`의 요소이면서 집합 `B`가 같지 않을 때
    + 다른 집합에 포함된 집합
    + 집합 `A`의 모든 요소가 집합 `B`의 요소

- 합집합
    + 집합 `A`와 집합 `B` 가운데 적어도 한쪽에 속하는 요소의 집합

- 교집합
    + 집합 `A,B` 양쪽 모두에 속하는 요소의 집합

- 차집합
    + 집합 `A`의 요소 가운데 집합 `B`의 요소를 제외한 요소의 집합

- 배열로 집합 만들기
    + 집합의 요소 개수와 배열의 요소 개수가 같아야함
    + 집합의 상태를 표현할 데이터 필요
```
class IntSet{
    int max; // 집합의 최대 개수
    int num; // 집합의 요소 개수
    int[] set; // 집합 본체
}
```



