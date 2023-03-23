package ch15.dotcom.simple;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper(); //입력을 받기 위한 클래스

//        1. SimpleDotCom 객체 만들기
        SimpleDotCom simpleDotCom = new SimpleDotCom();

//        2. 위치를 만들기(7개 중 3개)
        int randomNum = (int) (Math.random() * 1000)%5; //0~4, 연속된 3개의 공간을 할당받기 위해
        //int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);
        simpleDotCom.setLocationCells(locations);

//        3. 사용자에게 위치 물어보기
        while (true) {
            String guess = helper.getUserInput("enter a number");
//        4. 사용자가 추측한 위치 확인하기
            String result = simpleDotCom.checkYourself(guess);
            numOfGuesses++;
//        5. 닷컴이 죽을 때까지 같은 작업 반복하기
            if (result.equals("kill")) {
//        6. 몇 번의 추측 끝에 닷컴을 잡았는지 알려주기
                System.out.println(numOfGuesses + " guesses");
                break;
            }
        }
    }
}
