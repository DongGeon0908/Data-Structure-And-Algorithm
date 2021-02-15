# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 병합 정렬 `merge sort`
    + 배열을 앞부분과 뒷부분으로 나누어 각각 정렬한 다음 병합하는 작업을 반복해 정렬하는 알고리즘

- 병합 정렬 알고리즘의 순서
```
배열의 요소 개수가 2개 이상인 경우

1. 배열의 앞부분을 병합 정렬로 정렬
2. 배열의 뒷부분을 병합 정렬로 정렬
3. 배열의 앞부분과 뒷부분을 병합
```

- `O(nlogn)`
    + 안정적인 정렬

<hr />

- 힙 정렬 `heap sort`
    + 선택 정렬을 응용한 알고리즘
    + `heap`을 사용해 정렬하는 알고리즘
        * `heap`은 완전이진트리
        * 부모의 값이 자식의 값보다 항상 크다.
        * 가장 큰 값이 루트에 위치하는 특징을 이용
    + `O(nlogn)`

- 도수 정렬
    + 요소를 비교할 필요 없음
    + 필요과정
        * 도수분포표 작성
        * 누적도수분포표 작성
        * 목적 배열 만들기
        * 배열 복사
    + 효율적인 알고리즘
        * 데이터의 최솟값과 최대값을 미리 알고 있어야함