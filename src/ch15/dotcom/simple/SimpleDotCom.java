package ch15.dotcom.simple;

import java.util.ArrayList;

public class SimpleDotCom {
    //int[] locationCells;
    ArrayList<Integer> locationCells;
    int numOfHits;

//    public void setLocationCells(int[] locations) {
//        locationCells = locations;
//    }

    public void setLocationCells(ArrayList<Integer> locations) {
        locationCells = locations;
    }

//    public String checkYourself(String strGuess) {
//        int guess = Integer.parseInt(strGuess);
//        String result = "false";
//
//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if (numOfHits == locationCells.length) {
//            result = "kill";
//        }
//        System.out.println(result);
//        return result;
//    }

    public String checkYourself(String strGuess) {
        int guess = Integer.parseInt(strGuess);
        String result = "false";
        int index = locationCells.indexOf(guess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}
