
# javaGame
클래스와 스레드를 이용한 첫 게임


[작품 이름]

팀노바에서 살아남기


[작품 소개]

이 작품은 팀노바에서 살아남기 입니다.

1탄과 2탄으로 구성되어있으며 클래스 주차에 2탄을 만들고 쓰레드 주차에 1탄을 추가하였습니다. 

1탄은 팀노바에 들어가고 싶어하는 학생이 어머니에게 프로그래밍을 하고싶어 학원에 들어가고 싶다고 하지만

어머니는 컴퓨터도 없는 학생에게 컴퓨터를 30일 안에 맞춰오면 학원에 갈돈을 주겠다고 하는 내용입니다.

2탄은 어렵게 컴퓨터 부품을 다 모아서 컴퓨터를 맞춘 학생이 드디어 팀노바에 들어가서 과제를 하며 

마지막 7일차에 파트장님에게 검사를 받는 내용으로 구성을 하였습니다.  




[주요 기능]

[1탄]

1. 아르바이트 

7시와 13시에만 갈 수 있습니다.

작은 트레일러, 큰 트레일러 그리고 적재품 종목이 5가지로 총 10가지 조합의 트레일러가 나오며 그것을 다 내려야합니다. 

내릴때마다 체력과 허기가 줄어듭니다. 체력이 줄어들수록 한번에 내릴 수 있는 적재량이 줄어 들게 만들어 힘듦을 표현했습니다. 

내릴때마다 랜덤적으로 실수를 하게 되고 그로인해 벌점을 받게 되는데 벌점이 30점이상이면 일급을 받지 못합니다. 

아르바이트 하는 동안 3개의 쓰레드가 돌아가는데 

근육통 스레드 : 일을 하다보면 랜덤 확률로 근육통에 걸리고 근육통이 걸리면 60초 동안 행동의 딜레이가 생깁니다. 파스를 이용하여 

치료할 수 있습니다. 근육통에 한번이라도 걸리면 다음 아르바이트 가기전에 파스를 한번 더 붙여서 치료해야합니다.

온도 스레드 : 일정 시간마다 일하는 곳의 온도가 달라지는데, 일당을 받을때 온도가 32도 이상이면 추가금을 받게됩니다. 

허기 스레드 : 학생의 허기 스탯이 0이되면 3초마다 체력이 깍이게 만들었습니다. 박카스를 먹든지 , 음식을 먹게 되면 허기스탯이 오르고

스레드는 멈춥니다.


2. 아이템 사용

편의점에서 산 박카스와 파스를 사용할 수 있습니다 .

박카스는 체력과 허기를 조금 회복시켜줍니다.

파스는 근육통을 치료할 수 있게 해줍니다. 


3. 편의점

박카스와 파스를 팝니다. 

1+1 스레드 : 일정 시간마다 ,  박카스 또는 파스의 1+1 행사를 진행합니다. 


4. 식사

시켜먹거나 도시락을 만들어 먹을 수 있습니다. 

시켜먹는 것은 시간이 1시간 흐르고 돈을 지불합니다. 

도시락은 돈이 들지 않는 대신에 도시락을 싸는데 약간의 체력과 시간이 흐르고 도시락을 먹는데 시간을 한번 더 사용합니다. 

도시락을 만들고 바로 먹지 못하게 막아놓았고 만들어진 도시락은 만든날 기준 2일뒤 아침에 폐기가 되게 만들었습니다. 


5. 컴퓨터가게

컴퓨터 가게에서는 7가지의 부품을 팝니다. 

각 부품마다 가격이 다르고 사서 보유하면 가격에 맞게 희망이라는 보이지 않는 스탯이 오르는데 이는 아르바이트를 할 때 한번에 더 많은 적재량을 내릴 수 있게 합니다. 


6. 컴퓨터 조립 현황

현재 보유중인 컴퓨터 부품을 보여줍니다. 


7. 어머니한테 가기

어머니한테 가면 1시간이 흐르며 부품을 다모으면 엔딩을 보게 되는데 그 엔딩은 2탄으로 연결됩니다. 


8. 남은 시간 보내기 

캐릭터는 7시부터 22시까지 활동하는데 그전에 스킵하고 싶으면 선택하시면 됩니다.

허나 무분별한 스킵을 막기위해 시간대별로 스킵이 멈추는 시간을 만들어 놧고 이는 약간의 가이드라인으로 작용합니다. 


9. 일일알바 찾기

아르바이트가 7시와 13시에만 갈 수 있게 해놧기 때문에 , 그 시간을 놓쳤다면 일일 알바를 찾아볼 수 있습니다 .

찾는데 한시간이 걸리며 찾는다면 사장이 랜덤적으로 3시간에서 5시간까지 일을 시킵니다. 

시급은 일일알바기 때문에 1번의 정규알바 시급1만원보다 적은 8천원을 받습니다. 

16시까지이후에는 일일알바를 찾을 수 없게 막아놨고

2가지의 스레드가 흐르는데

온도 스레드 : 아르바이트중 온도가 변하는데 32도 이상이 3번이 되면 탈수 증상에 걸리게 만들고 아이들과 눈치싸움 스레드를 실행시킵니 다. 영상에서는 시연을 위해 1번이라

도 32도 이상이 되면 탈수증상이 나오게 만들었습니다. 

아이들과 눈치싸움 : 인형탈 알바가 탈수에 걸리면 아이들이 보지 않을때 물을 3번을 마셔야합니다. 걸리면 벌점을 받습니다. 


[2탄]

공통 스레드 : 허기 스레드 ( 허기스탯이 0이되면 3초마다 체력이 깍입니다)


{ 학원 }

학원에 가서 공부하면 집중력 스탯이 조금 오르게 됩니다. 

대신에 학원을 가는데 2시간이 걸리고 아침에 학원에 가는것이 힘들기 때문에 체력이 깍입니다. 

파트너 스레드 : 11시 ,12시 ,13시에 일정 확률로 하브루타 파트너가 학원에 오는데 파트너가 오면 일정시간 집중력 스탯이 오릅니다. 

파트너자극 스레드 : 파트너스레드의 시간이 지나면 자극 스레드가 켜지는데 일정 확률로 버프와 디버프가 있고 일정시간 유지됩니다. 

파트너가 옆에서 집중을 하면 자극을 받아 집중력이 오르고, 신경쓰이게 하면 집중력이 떨어집니다. 


1. 과제하기 

집중력에 비례하여 과제율이 오릅니다. 


2. 발표연습하기 

과제 달성율이 70이상이 안되면 발표 연습을 못하게 해놨습니다. 


3. 잠시 휴식

휴식을 통하여 체력을 회복 할 수 있습니다 .


4. 먹기 

누네띄네를 먹을 수 있고 나가서 먹을 수 있습니다 .

누네띄네는 별도의 시간이 들지 않지만 허기가 매우 조금 씩 찹니다. 

나가서 먹으면 시간이 흐르지만 허기를 전부 회복 할 수 있습니다.

1탄에서 2탄으로 넘어올 때 어머니가 카드를 주셨기 때문에 2탄에서는 돈의 개념이 사라졌습니다. 


5. 집으로 가기

7시에 자동적으로 집으로 가게 해놨지만 그 전에 집으로 퇴근을 할 수 있습니다. 

4시 5시 6시에 퇴근하고 싶은 유혹이 랜덤적으로 찾아오는데 

사무실에 있을 때는 유혹과 블랙잭 미니게임을 해서 이겨야 학원에 남아있을 수 있습니다. 


{집}

집에서 공부하면 학원에 가는 시간과 체력을 아낄 수 있습니다. 

허나 2시간에 한번씩 유혹이 자주 찾아오고 확률이 높습니다. 

종류는 유튜브, 페이스북, 침대에 눕기가 있습니다.

집에서는 유혹이 찾아오면 가위바위보로 승부를 해야합니다.

유혹에 넘어가면 시간을 낭비하는 대신에 체력이 조금 회복됩니다. 

학원에 비해 멘토가 없기 때문에 과제 준비도나 발표 준비도를 확인 할 수 없습니다. 

중간에 학원에 갈 수도 있는데 13시 이후에는 학원에 갈 마음이 생기지 않아 갈 수 없습니다. 

22시에는 자동적으로 취침에 들어갑니다. 


{오늘 쉬기}

체력과 허기가 모두 회복되며 하루를 쉬며 다음날로 넘어갑니다. 


{엔딩}

7일차에 파트장님이 과제와 발표의 완성도에 따라 여러가지 엔딩을 만들었는데

검사를 하실때 과제완성도에 0~10까지 랜덤의 확률로 뺀 후 검사합니다. 

이는 파트장님은 더 많은것을 원한다는것을 표현하고 싶었습니다. 확정적으로 100이상을 받으려면 110을 준비하면 됩니다. 

1탄과 2탄 모두 체력이 0이 되면 입원을 하여 엔딩이 나옵니다. 

# playvideo
[1탄](https://www.youtube.com/watch?v=5bT7MsGHdyI)
[2탄](https://www.youtube.com/watch?v=7y7roXhpK-8)
