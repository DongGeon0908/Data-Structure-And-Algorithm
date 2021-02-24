# 📋Data-structure-Algorithms Study📋
> 자료구조와 알고리즘 학습

<br>

### ©CopyRight
> Donggeon Kim

> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

- 해시법 `hashing`
    + 데이터를 저장할 위치를 간단한 연산으로 구하는 것
    + 검색, 추가, 삭제 효율적
    + 해시 값 `hash value`
        * 표에 정리한 값
        * 데이터에 접근할 때 사용
    + 해시 테이블 `hash table`
        * 해시 값이 인덱스가 되도록 원래의 키 값을 저장한 배열
    + 버킷 `bucket`
        * 해시 테이블의 각 요소
    + 해시 함수 `hash function`
        * 해시 값을 만드는 함수

- 충돌 `collision`
    + 저장할 버킷이 중복되는 현상
    
- 충돌 해결법
    + 체인법
        * 같은 해시 값을 갖는 요소를 연결 리스트로 관리
        * 오픈 해시법
        * 같은 해시 값을 갖는 데이터를 쇠사슬 모양으로 연결리스트에서 연결하는 방법
    + 오픈 주소법
        * 반 버킷을 찾을 때까지 해시를 반복
        * 닫힌 해시법
        * 충돌이 발생했을 때 재해시를 행하여 비어 있는 버킷을 찾아내는 방법
 