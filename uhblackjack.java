package Four;
import java.util.InputMismatchException;
import java.util.Scanner;

class uhblackjack {

	
	public uhblackjack() {
		
		  Scanner scan = new Scanner(System.in);
	        
	        boolean uCardSetFull = false;        // '유저'의 카드set이 비어있는 상태로 초기화
	        boolean dCardSetFull = false;        // '딜러'의 카드set이 비어있는 상태로 초기화
	        boolean gameWin = true;              // 게임 결과 판단. 승리로 초기화
	        int comCardSet[] = new int[52];      // 무작위로 결정된 숫자를 저장
	 
	        comCardSetInit(comCardSet);          // 공용 카드set 생성 및 초기화 
	        
	/*        // 테스트: 생성된 공용 카드set 확인
	      System.out.print("공용 카드set");
	        comCardSetPrint(comCardSet);
	*/
	        // 플레이어, 딜러 블랙잭 판단을 위한 저장 공간
	        boolean uBlackjack[] = new boolean[2];        // 유저의 카드set이 블랙잭 상태인지 판단하는 공간
	        boolean dBlackjack[] = new boolean[2];        // 딜러의 카드set이 블랙잭 상태인지 판단하는 공간
	        boolean uBlackjackWin = false;                // 유저의 블랙잭 승리 상태 초기화
	        boolean dBlackjackWin = false;                // 딜러의 블랙잭 승리 상태 초기화
	        
	        // 카드 기본 셋팅: 유저 2장, 딜러 2장 배분
	        String uCardSet[] = new String[6];            // 유저의 카드set 준비
	        String dCardSet[] = new String[3];            // 딜러의 카드set 준비
	        cardSetInit(uCardSet, dCardSet);              // 유저과 딜러의 카드set 생성
	        basicCardSetInit(comCardSet, uCardSet, uBlackjack);        // 유저의 기본 카드 2장 배분
	        basicCardSetInit(comCardSet, dCardSet, dBlackjack);        // 딜러의 기본 카드 2장 배분
	        
	/*      // 테스트: 블랙잭 확인
	        uCardSet[0] = checkNum(27, uBlackjack);
	        uCardSet[1] = checkNum(1, uBlackjack);
	*/
	/*      // 테스트: 유저, 딜러의 최초 카드 'A(1), K(13)' 판단 결과 확인
	        System.out.println("uBlackjackWin = " + uBlackjackWin + ", dBlackjackWin = " + dBlackjackWin);
	*/        
	/*      // 테스트: 변경된 공용 카드set 확인
	        System.out.println();
	        System.out.print("변경된 카드 묶음");
	        comCardSetPrint(comCardSet);
	*/        
	        // 게임 진행 루프
	        gameLoop(comCardSet, uCardSet, dCardSet, uCardSetFull, dCardSetFull,
	                uBlackjack, dBlackjack, uBlackjackWin, dBlackjackWin, gameWin, scan);
	 
	        // 결과 출력
	        gameResult(uCardSet, dCardSet, uBlackjackWin, dBlackjackWin, gameWin);
	 
	        scan.close();
	    }
	 
	////////////////////////// 메소드 영역
	 
	/*
	 * 52장이 들어있는 트럼프 공용 카드set을 생성 및 초기화
	 * 동일한 카드는 중복불가(스페이드,다이아몬드,하트,클로버 13장씩 4쌍 존재)
	 * 순서 상관없이 무작위로 섞음
	 */
	    public static void comCardSetInit(int comCardSet[]) {
	        
	        boolean noSame[] = new boolean[52];
	        
	        // 무작위 숫자 결정 시 중복 불가를 위한 준비
	        for(int i = 0; i < noSame.length ; i++) {
	            noSame[i] = false;
	        }
	        
	        // 총 결정될 개수만큼 중복없는 숫자가 나올 때까지 무작위 결정을 반복
	        int randLoop = 0;
	        int randTemp;
	        while(randLoop < 52) {
	            randTemp = (int)(Math.random() * 52);
	            if(noSame[randTemp] == false) {
	                noSame[randTemp] = true;
	                comCardSet[randLoop] = randTemp + 1;
	                randLoop++;
	            }
	        }
	    }
	    
	    // 섞인 공용 카드set을 출력
	    public static void comCardSetPrint(int cardSet[]) {
	        for(int i=0; i < cardSet.length; i++) {
	            if (i % 3 == 0) {
	                System.out.println();
	            }
	            System.out.print("cardSet[" + i + "] = " + cardSet[i] + " ");
	        }
	        System.out.println("\n");
	    }
	    
	    // 유저과 딜러의 카드set 초기화
	    public static void cardSetInit(String uCardSet[], String dCardSet[]) {
	        for (int i = 0; i < uCardSet.length; i++) {
	            uCardSet[i] = "0";
	        }
	        for (int i = 0; i < dCardSet.length; i++) {
	            dCardSet[i] = "0";
	        }
	    }
	    
	    // 공용 카드에서 초기 카드 2장 뽑기
	    public static void basicCardSetInit(int comCardSet[], String cardSet[], boolean blackjack[]) {
	        String drawCardStr = "";
	        int drawCard = 0;
	        int cardSetPos = 0;
	        int drawLoop = 0;
	        
	        // 공용 카드set에서 뽑은 카드는 다시 뽑지 않음
	        while (drawLoop < 2) {
	            cardSetPos = (int)(Math.random() * 52);
	            drawCard = comCardSet[cardSetPos];
	            if (drawCard != 0) {
	                // 테스트: 공용 카드set에서 뽑은 카드의 위치 확인
	                // System.out.println("뽑은 카드의 배열 인덱스 = " + cardSetPos);
	                
	                drawCardStr = checkNum(drawCard, blackjack);
	                cardSet[drawLoop] = drawCardStr;
	                comCardSet[cardSetPos] = 0;
	                drawLoop++;
	            }
	        }
	 
	/*      // 테스트: 블랙잭
	        cardSet[0] = checkNum(1, blackjack);
	        cardSet[1] = checkNum(13, blackjack);
	*/
	    }
	 
	/*
	 * 카드번호 체크 메소드는 두 가지 종류가 있으며,
	 * 첫 번째 체크시에만 블랙잭을 판단
	 */
	    // 카드번호 체크 및 변환 + 블랙잭 판단
	    public static String checkNum(int cardNum, boolean blackjack[]) {
	        String result = "";
	 
	        // 뽑은 카드의 번호가 '1'이면 'A'로 변환 
	        if (cardNum == 1 || cardNum % 13 == 1) {
	            result = "A";
	            blackjack[0] = true;
	        } else if (cardNum % 13 == 0) {
	            cardNum = 13;
	            blackjack[1] = true;
	        }
	        else {
	            cardNum = (cardNum % 13);
	        }
	 
	        // 카드 번호가 '11' 이상이면 'J, Q, K'로 변환
	        if (cardNum > 10) {
	            switch (cardNum) {
	                case 11:
	                    result = "J";
	                    break;
	                case 12:
	                    result = "Q";
	                    break;
	                case 13:
	                    result = "K";
	                    break;
	            }
	        }
	        // 일반 숫자면 변환 없음
	        else {
	            if (cardNum > 1 && cardNum <= 10) {
	                result = Integer.toString(cardNum);
	            }
	        }
	 
	        return result;
	    }
	    
	    // 카드번호 체크 및 변환
	    public static String checkNum(int cardNum) {
	        String result = "";
	 
	        // 실제 카드 숫자로 변환
	        if (cardNum == 1 || cardNum % 13 == 1) {
	            result = "A";
	        } else if (cardNum % 13 == 0) {
	            cardNum = 13;
	        }
	        else {
	            cardNum = (cardNum % 13);
	        }
	 
	        // 카드 번호가 '11' 이상이면 'J, Q, K'로 변환
	        if (cardNum > 10) {
	            switch (cardNum) {
	                case 11:
	                    result = "J";
	                    break;
	                case 12:
	                    result = "Q";
	                    break;
	                case 13:
	                    result = "K";
	                    break;
	            }
	        }
	        // 일반 숫자면 변환 없음
	        else {
	            result = Integer.toString(cardNum);
	        }
	 
	        return result;
	    }
	    
	    // 게임 반복 루프
	    public static void gameLoop(int comCardSet[], String uCardSet[], String dCardSet[],
	            boolean uCardSetFull, boolean dCardSetFull,
	            boolean uBlackjack[], boolean dBlackjack[],
	            boolean uBlackjackWin, boolean dBlackjackWin, boolean gameWin, Scanner scan) {
	    	 System.out.println();
	        System.out.println("유혹과 블랙잭 게임을 시작합니다.");
	        System.out.println("이기시면 유혹에 빠지지 않습니다.");
	        System.out.println();
	        // 최초에 배분된 기본 카드 2장을 각각 공개
	        System.out.println(Student.name+"에게 배분된 카드");
	        cardSetNum(uCardSet, 1);
	        
	        System.out.println("유혹에게 배분된 카드");
	        cardSetNum(dCardSet, 2);
	        System.out.println();
	        
	        // 유저의 기본 카드 2장이 'A'와 'K'면 유저의 블랙잭 승리로 판단
	        if (uBlackjack[0] == true && uBlackjack[1] == true) {
	            uBlackjackWin = true;
	        } 
	        // 딜러의 기본 카드 2장이 'A'와 'K'면 딜러의 블랙잭 승리로 판단
	        if (dBlackjack[0] == true && dBlackjack[1] == true) {
	            dBlackjackWin = true;
	        }
	        
	        // 반복 시작
	        while (true) {
	            // 카드를 뽑은 후 유저의 점수가 '21'을 초과하면 즉시 게임 패배
	            if (pointResult(uCardSet) > 21) {
	                gameWin = false;
	                break;
	            }
	            
	            // 유저 or 딜러가 '블랙잭'이면 즉시 게임 종료
	            if (uBlackjackWin || dBlackjackWin) {
	                break;
	            } else if (!gameWin) {
	                break;
	            }
	            else {
	            // 유저에게 'Hit or Stay' 물어봄
	            System.out.print("행동을 결정해주세요. Hit(1), Stay(2): ");
	            int decision=0;
	            try {
	                decision =scan.nextInt();
	    			
	    		}catch(InputMismatchException e) {
	    			scan = new Scanner(System.in);
	    		}
	           
	            
	            System.out.println();
	        
	                // 유저이 'Hit' 결정 시 추가 카드 1장 받음            
	                if (decision == 1) {
	        
	                    // 카드 뽑기 조건: 대상의 카드set이 비어있는 상태이어야 함
	                    if (!cardFull(uCardSet, uCardSetFull)) {
	                        drawCardOne(comCardSet, uCardSet);        // 카드 뽑기
	                    }
	                    // 카드가 꽉 찾을 경우 강제로 'Stay'로 판단
	                    else {
	                        System.out.println("더 이상 카드를 받을 수 없습니다. 강제로 'Stay'됩니다.");
	                        decision = 2;
	                    }
	                    
	                    // 각 점수 비교 후 딜러의 점수가 플레이어보다 낮으면, 딜러 추가 카드 1장  ※ 1회 한정
	                    // 카드 뽑기 조건: 딜러의 점수가 유저의 점수보다 낮고, 공간의 여유가 있는 상태여야 함(= 카드가 2개인 상태)
	                    if (pointResult(dCardSet) < pointResult(uCardSet) && !cardFull(dCardSet, dCardSetFull)) {        
	                        drawCardOne(comCardSet, dCardSet);        // 카드 뽑기
	                    }
	                    
	                    // 카드를 뽑은 후 유저의 점수가 '21'을 초과하면 즉시 게임 패배
	                    if (pointResult(uCardSet) > 21) {
	                        gameWin = false;
	                        break;
	                    }
	                    
	                    System.out.println(Student.name+"에게 배분된 카드 숫자");
	                    cardSetNum(uCardSet, 1);
	                    
	                    System.out.println("유혹에게 배분된 카드 숫자");
	                    cardSetNum(dCardSet, 2);
	                    
	                } else if (decision == 2) {
	                    // 각 점수 비교 후 딜러의 점수가 플레이어보다 낮으면 딜러 추가 카드 1장  ※ 1회 한정
	                    
	                    // 카드 뽑기 조건: 딜러의 점수가 유저의 점수보다 낮고, 공간의 여유가 있는 상태여야 함(= 카드가 2개인 상태)
	                    if (pointResult(dCardSet) < pointResult(uCardSet) && !cardFull(dCardSet, dCardSetFull)) {        
	                        drawCardOne(comCardSet, dCardSet);        // 카드 뽑기
	                    }
	                    break;
	                }
	                else {
	                    // 예외 처리
	                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
	                    System.out.println();
	                }
	            }
	        }
	    }
	    
	    // 카드 1장 뽑기
	    public static void drawCardOne(int comCardSet[], String cardSet[]) {
	        int drawLoop = 0;
	        int cardSetPos = 0;
	        int drawCard = 0;
	        String drawCardStr = "";
	        while (drawLoop < 1) {
	            cardSetPos = (int)(Math.random() * 52);
	            drawCard = comCardSet[cardSetPos];
	    
	            if (drawCard != 0) {
	                // 테스트: 공용 카드set에서 뽑은 카드의 위치 확인
	                // System.out.println("뽑은 카드의 배열 인덱스 = " + cardSetPos);
	    
	                drawCardStr = checkNum(drawCard);
	                for (int i = 0; i < cardSet.length; i++) {
	                    if (cardSet[i] == "0") {
	                        cardSet[i] = drawCardStr;
	                        comCardSet[cardSetPos] = 0;
	                        drawLoop++;
	                        break;
	                    }
	                }
	            }
	        }
	    }
	 
	    // 배분된 카드 출력
	    public static void cardSetNum(String cardSet[], int index) {
	        
	        // 'index' 값이 1이면 카드set 공개
	        // 'index' 값이 2면 카드set에서 카드 1개 숨김
	        if (index == 1) {
	            for (int i = 0; i < cardSet.length; i++) {
	                if (cardSet[i] == "0") {
	                    System.out.print(" ");
	                }
	                else {
	                    System.out.print(cardSet[i] + " ");
	                }
	            }
	            System.out.println();
	        } else if (index == 2) {
	            for (int i = 0; i < cardSet.length; i++) {
	                if (i == 0) {        // 첫 번째 자리의 카드 숨김
	                    System.out.print("? ");
	                }
	                else {
	                    if (cardSet[i] == "0") {
	                        System.out.print(" ");
	                    }
	                    else {
	                        System.out.print(cardSet[i] + " ");
	                    }
	                }
	            }
	            System.out.println();
	        } 
	        else {
	            // 예외 처리
	            System.out.println("디버그. 인덱스 값이 잘못되었습니다.");
	        }
	    }
	    
	    // 유저의 카드set이 꽉 찬 상태인지 체크
	    public static boolean cardFull(String cardSet[], boolean cardSetFull) {
	        int count = 0;
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "0") {
	                count++;
	            }
	        }
	        // 비어있는 개수가 없으면 꽉 찬 상태
	        if (count == 0) {
	            cardSetFull = true;
	        }
	        
	        return cardSetFull;
	    }
	    
	    // 점수 구하기
	    public static int pointResult(String cardSet[]) {
	        int point = 0;
	        
	        // 1차 점수 합산: 알파벳 카드는 따라 점수를 다르게 합산
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "A") {
	                point += 1;
	            } else if (cardSet[i] == "J") {
	                point += 10;
	            } else if (cardSet[i] == "Q") {
	                point += 10;
	            } else if (cardSet[i] == "K") {
	                point += 10;
	            } else if (Integer.parseInt(cardSet[i]) > 1 
	                    && Integer.parseInt(cardSet[i]) <= 10) {
	                point += Integer.parseInt(cardSet[i]);
	            } 
	            else {
	                point += 0;
	            }
	        }
	        // 2차 점수 합산: 1차 점수 합산이 끝난 뒤 카드set에 'A'가 존재할 경우,
	        // 10점을 추가한 점수가 '21점 이하'면 10점 추가(= 'A'는 '11점'과 같은 의미)
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "A" && point + 10 <= 21) {
	                point += 10;
	            } 
	        }
	    
	        return point;
	    }
	    
	/*
	 * 승패
	 * 1.유저 승리
	 *  - 유저의 기본 카드 2장이 블랙잭(A, K)이고, 딜러는 해당되지 않을 경우
	 *  - 각자 점수가 '21점 이하'이고, 유저의 점수가 더 높을 경우
	 *  - 유저의 점수가 '21점 이하'이고, 딜러의 점수는 '21점을 초과'할 경우
	 *  
	 * 2.유저 패배
	 *  - 딜러의 기본 카드 2장이 블랙잭(A, K)이고, 유저는 해당되지 않을 경우
	 *  - 각자 점수가 '21점 이하'이고, 딜러의 점수가 더 높을 경우
	 *  - 유저의 점수가 '21점을 초과'할 경우
	 *  
	 * 3.무승부
	 *  - 각자 기본 카드 2장이 블랙잭(A, K)일 경우 
	 *  - 각자 점수가 동일한 경우 
	 */
	    
	    // 결과 출력
	    public static void gameResult(String uCardSet[], String dCardSet[], 
	            boolean uBlackjackWin, boolean dBlackjackWin, boolean gameWin) {
	        System.out.println("카드를 오픈합니다.");
	        System.out.println();
	        
	        // 유저에게 배분된 카드와 점수 출력
	        System.out.println(Student.name+"에게 배분된 카드");
	        cardSetNum(uCardSet, 1);
	        
	        System.out.println(Student.name+"의 점수 = " + pointResult(uCardSet));
	        System.out.println();
	        
	        // 딜러에게 배분된 카드와 점수 출력
	        System.out.println("유혹에게 배분된 카드");
	        cardSetNum(dCardSet, 1);
	        
	        System.out.println("유혹의 점수 = " + pointResult(dCardSet));
	        System.out.println();
	        
	        // 결과 메시지 - 블랙잭 유무
	        if (uBlackjackWin && !dBlackjackWin) {
	        	System.out.println();
	            System.out.println("대박! ★ 축하합니다 ★ '블랙잭'으로 승리!!");
	            System.out.println("다시 집중합니다.");
	        	if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}
	            System.out.println();
	            new samusil();
	            
	        } else if (!uBlackjackWin && dBlackjackWin) {
	        	System.out.println();
	            System.out.println("헐... '블랙잭'으로 패배!");
	            System.out.println("집으로 이동합니다.");
	            System.out.println();
                Time.count+=2;
    			Student.concentration-=2;
    			samusil.junhothread=false;
    			samusil.junhoeventthread=false;
    			System.out.println("-----------------------------------------------------");
    			System.out.println();
    			System.out.println("                       집입니다.");
    			System.out.println();
    			System.out.println("-----------------------------------------------------");
                new room();
	            
	        } else if (uBlackjackWin && dBlackjackWin) {
	        	System.out.println();
	            System.out.println("이럴수가!! '블랙잭'으로 무승부!!! 재경기합니다.");
	            System.out.println();
	            new uhblackjack();
	        }
	        // 결과 메시지 - 점수 비교
	        else {
	            if (gameWin && pointResult(uCardSet) > pointResult(dCardSet) 
	                    && pointResult(uCardSet) <= 21
	                    || gameWin && pointResult(uCardSet) < pointResult(dCardSet)
	                    && pointResult(dCardSet) > 21) {
	            	System.out.println();
	                System.out.println("결과 = ★ 축하합니다 ★ 승리하셨습니다!!");
	                System.out.println("다시 집중합니다.");
	            	if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
						samusil.junhothread=true;
						samusil.junhoeventthread=false;
					}
	                System.out.println();
	                new samusil();
	            } else if (gameWin && pointResult(uCardSet) == pointResult(dCardSet)
	                    && pointResult(uCardSet) <= 21) {
	            	System.out.println();
	                System.out.println("이럴수가... 무승부입니다! 재경기합니다.");
	                System.out.println();
	                new uhblackjack();
	            }
	            else {System.out.println();
	                System.out.println("결과 = 패배!");
	                System.out.println("집으로 이동합니다.");
	                samusil.junhothread=false;
        			samusil.junhoeventthread=false;
	                System.out.println();
	                Time.count+=2;
	    			Student.concentration-=2;
	    			samusil.samusilevent16=true;
	    			samusil.samusilevent17=true;
	    			samusil.samusilevent18=true;
	    			
	    			if(Student.junho=true) {
	    				Student.concentration-=1;
	    				Student.junho=false;
	    			}
	    			System.out.println("-----------------------------------------------------");
	    			System.out.println();
	    			System.out.println("                       집입니다.");
	    			System.out.println();
	    			System.out.println("-----------------------------------------------------");
	                new room();
	            }
	        }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
