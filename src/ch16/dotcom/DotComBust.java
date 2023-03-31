package ch16.dotcom;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper gameHelper = new GameHelper();
    private ArrayList<DotCom> dotComs = new ArrayList<>();
    private int numOfGuesses;

    private void setUpGame() {
        dotComs.add(new DotCom("google.com"));
        dotComs.add(new DotCom("naver.com"));
        dotComs.add(new DotCom("kakao.com"));

        for (DotCom dotCom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocationCells(newLocation);
        }
        gameHelper.printAll();
    }

    private void startPlaying() {
        while (!dotComs.isEmpty()) {
            String userGuess = gameHelper.getUserInput("enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotCom : dotComs) {
            result = dotCom.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComs.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println(numOfGuesses + " guesses.");
        if (numOfGuesses <= 18) {
            System.out.println("good job");
        } else {
            System.out.println("^_^;");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
