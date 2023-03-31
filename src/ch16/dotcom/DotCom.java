package ch16.dotcom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public DotCom(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourSelf(String userInput) {
        String status = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                status = "kill";
            } else {
                status = "hit";
            }
        }
        return status;
    }
}
