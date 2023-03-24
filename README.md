기능요구사항

1. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 
그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
   e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
   1. 스트라이크를 판단하는 메서드 o
   2. 볼을 판단하는 메서드 o
   3. 낫싱을 판단하는 메서드 n
   4. 입력 받은 숫자를 판단하는 메서드(스트라이크 볼 낫싱을 조합하여) 
   
2. 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
게 임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
   1. 랜덤수를 생성하는 메서드
   2. 랜덤수를 검증하는 메서드
   2. 사용자의 수 입력을 위한 뷰 (숫자를 입력해주세요 :)
   3. 힌트를 출력하는 뷰 (x볼 , x볼 x스트라이크, x스트라이크)
   4. 사용자의 세자리 숫자 입력값을 검증하는 메서드 o
   
3. 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
   1. 맞출 때까지 반복하는 구조
   2. 맞춘 경우 결과를 출력하는 뷰 (3개의 숫자를 모두 맞히셨습니다! 게임 종료)
4. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다. 
   1. 게임 시작 여부를 입력받는 뷰(게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.)

프로그램 동작 순서
1. 게임 시작 여부 출력
2. 게임 시작 여부 사용자 입력
3. 1인 경우 시작 2인 경우 프로그램 종료
4. 랜덤 숫자 생성하여 저장
5. 사용자 숫자 입력 뷰 호출
6. 사용자 숫자 입력
7. 결과 판단
8. 오답일 경우 힌트 출력
8. 정답일 경우 정답 결과 출력 1단계로 돌아감
9. 6단계로 돌아감

도메인 설계
1. GameController : 사용자의 요청에 따른 흐름 제어 
2. BaseballGame : Controller의 요청에 따라 게임실행과 관련된 흐름 제어하거나 그 결과를 반환
3. OpponentPlayer : 상대방(컴퓨터)역할, 랜덤 수 생성과 랜덤 수 검증
4. GameJudge : 사용자의 입력과 컴퓨터의 정답을 비교하여 결과를 반환 
5. GamePlayer : 유저의 답을 검증하고 저장
6. GameResult : strike, ball같은 게임의 결과를 저장

7. 리팩터링 중점 사항
-TDD
-목표지키지
-커밋 단위
-규칙 지키기
-기능 완성
-예외 처리
-리팩터링
-mvc
-예외

TDD 순서 
1. 검증(GamePlayer)
2. 게임 결과(스트라이크, 볼, 낫싱)
3. 랜덤 수(OpponentPlayer)
4. Controller요청과 게임 결과에 따른 BaseballGame동작
5. 사용자의 입력 검증(view)
