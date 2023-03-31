package ch16.dotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    private int[][] grid = new int[7][7];
    private int comCount;

    public String getUserInput(String prompt) {
        String inputLine;
        System.out.print(prompt + " ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDotCom() {
        ArrayList<String> alphaCells = new ArrayList<>();
        int randRow = 0;
        int randCol = 0;

        comCount++;
        if (comCount % 2 == 1) {
            //가로
            while (true) {
                randRow = (int) (Math.random() * 1000) % 7; //0~6
                randCol = (int) (Math.random() * 1000) % 5; //0~4
                if (grid[randRow][randCol] == 0 && grid[randRow][randCol + 1] == 0 && grid[randRow][randCol + 2] == 0) {
                    grid[randRow][randCol] = 1;
                    grid[randRow][randCol+1] = 1;
                    grid[randRow][randCol+2] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[randRow]+"%d",randCol));
            alphaCells.add(String.format(alphabet[randRow]+"%d",randCol+1));
            alphaCells.add(String.format(alphabet[randRow]+"%d",randCol+2));
        } else {
            //세로
            while (true) {
                randRow = (int) (Math.random() * 1000) % 5; //0~4
                randCol = (int) (Math.random() * 1000) % 7; //0~6
                if (grid[randRow][randCol] == 0 && grid[randRow+1][randCol] == 0 && grid[randRow+2][randCol] == 0) {
                    grid[randRow][randCol] = 1;
                    grid[randRow+1][randCol] = 1;
                    grid[randRow+2][randCol] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[randRow]+"%d",randCol));
            alphaCells.add(String.format(alphabet[randRow+1]+"%d",randCol));
            alphaCells.add(String.format(alphabet[randRow+2]+"%d",randCol));
        }
        return alphaCells;
    }

    public void printAll() {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
