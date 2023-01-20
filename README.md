🎯CS06 체스게임
=

# 입력 → 검증 → 처리/계산 → 형식 → 출력 단계

### 입력

- verifyBlock()메서드를 사용하여 색상과 어떤말인지 리턴 (빈칸이면 error 출력)

### 출력

- [ ] 입력할 때마다 체스판 체스말 현황을 출력한다.
- [ ] 잡는 경우는 현재 체스판 점수를 출력 -> Pawn 1점, Bishop와 Knight 3점, Rook 5점, Queen은 9점
- [ ] display() 함수 : 1-rank 부터 8-rank 까지 전체 리턴
- [ ] initPiece(type, position) 함수 : 특정 말 생성(초기위치에), ->?? 해당위치에 다른말 있다는게 무슨 소리지 아예 초기화하는거아닌가
- [ ] setPiece(type, position) 함수 : 특정 위치에 특정 말 생성
- [ ] move(from, to) 함수 : Board클래스에서 제공하는 메서드를 통해 이동/옮길 수 있으면 true, 아니면 false 리턴 -> 잡으면 점수출력
- [ ] 체스말의 위치값(position) : Position 데이터구조 생성 -> file 과 rank = **enum으로 선언**
- [ ] 