package Homework;

import example.List;

import java.util.Scanner;
import java.util.Random;

public class BaseballGame {

    Random random = new Random();
    public List<Integer> number;
    List<Integer> answer = new List<>();

    // 객체 생성 시 정답을 만들도록 함
    public BaseballGame() {

    }

    public void number() {

        for (int i = 0; i < 3; i++) {
            int randomValue = random.nextInt(9) + 1;// 0에서 8까지의 랜덤 값 생성
            answer.add(randomValue);
        }
        System.out.println(answer);// Collections.random(answer);
        // return answer.getResult();
    }


    public List<Integer> getAnswer() {
        return answer;
    }

    public int play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문제 정답 : " + answer);
        while (true) {
            // 1. 유저에게 입력값을 받음
            System.out.println("서로 다른 3자리 수를 입력하세요. 단, 각 자리는 1~9 사이의 숫자이고, 0은 사용할 수 없습니다.");
            String input = sc.nextLine();

            // 2. 올바른 입력값을 받았는지 검증
            if (){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 3. 게임 진행횟수 증가


            // 4. 스트라이크 개수 계산


            // 5. 정답여부 확인, 만약 정답이면 break 를 이용해 반복문 탈출


            // 6. 볼 개수 계산


            // 7. 힌트 출력
        }
        // 게임 진행횟수 반환
    }

    protected boolean validateInput(String input) {

    }

    private int countStrike(String input) {

    }

    private int countBall(String input) {

}



