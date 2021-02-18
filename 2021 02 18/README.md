# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 문자열 검색 
    + `String searching`
    + 어떤 문자열 안에 다른 문자열이 들어 있는지 조사하고 들어 있다면 그 위치를 찾아내는 것
    + 검색할 문자열
        * `pattern`
    + 문자열 원본
        * `text`

- 브루트 포스
    + `brute force method`
    + 선형 검색을 확장한 알고리즘
        * 단순법
        * 소박법
    + 단순하게 하나씩 이동하면 원본 문자열과 대칭으로 비교함

- `KMP`법
    + 다른 문자를 만나면 패턴에서 문자를 검사했던 위치 결과를 버리고 다음 텏트의 위치로 이동한 다음 다시 패턴의 첫 번째 문자부터 검사 진행
    + 검사했던 위치 결과를 버리지 않고 효율적으로 활용
        * 텍스트와 패턴의 겹치는 부분을 찾아내어 검사를 다시 시작할 위치를 구함 

- `Boyer-Moore`법
    + 패턴의 마지막 문자부터 앞쪽으로 검사를 진행하면서 일치하지 않는 문자가 있으면 미리 준비한 표에 따라 패턴을 옮길 크기를 정함
    + 브루트포스, kmp 보다 효율적이고 우수한 알고리즘