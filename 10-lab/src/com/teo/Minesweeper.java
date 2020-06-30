package com.teo;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    static final int MINES_COUNT = 15;
    public static final int COMMAND_OPEN = 0;
    public static final int COMMAND_FLAG = 1;
    static char[][] visibleBoard = new char[10][10];
    static boolean[][] minesBoard = new boolean[10][10];

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        populateVisibleBoard();
        printVisibleBoard();
        populateMines();
        do {
            int[] userCommand = getUserCommand();
            playCommand(userCommand);
            printVisibleBoard();
        } while (!isGameOver());

        if (isMineOpen()) {
            System.out.println("BOOM!");
        } else {
            System.out.println("Congrats!");
        }
    }

    private static boolean isGameOver() {
        boolean isMineOpen = isMineOpen();
        boolean areAllMinesFlagged = areAllMinesFlagged();
        return isMineOpen || areAllMinesFlagged;
    }

    private static boolean areAllMinesFlagged() {
        for (int row = 0; row < minesBoard.length; row++) {
            for (int col = 0; col < minesBoard[0].length; col++) {
                if (minesBoard[row][col] == true && visibleBoard[row][col] != 'F') return false;
            }
        }
        return true;
    }

    private static boolean isMineOpen() {
        for (int row = 0; row < visibleBoard.length; row++) {
            for (int col = 0; col < visibleBoard[0].length; col++) {
                if (visibleBoard[row][col] == '*') return true;
            }
        }
        return false;
    }

    private static void playCommand(int[] userCommand) {
        int selectedRow = userCommand[0];
        int selectedCol = userCommand[1];
        int selectedCommand = userCommand[2];
        if (selectedCommand == COMMAND_OPEN) {
            if (minesBoard[selectedRow][selectedCol] == true) {
                visibleBoard[selectedRow][selectedCol] = '*';
            } else {
                openCell(selectedRow, selectedCol);
            }
        } else if (selectedCommand == COMMAND_FLAG) {
            visibleBoard[selectedRow][selectedCol] = 'F';
        }
    }

    private static void openCell(int selectedRow, int selectedCol) {
        if(visibleBoard[selectedRow][selectedCol] != '▒') return;
        visibleBoard[selectedRow][selectedCol] = getNumberOfNearbyMines(selectedRow, selectedCol);
        if(visibleBoard[selectedRow][selectedCol] == '0') openAllNearby(selectedRow, selectedCol);
    }

    private static void openAllNearby(int row, int col) {
        if(row - 1 >= 0) openCell(row - 1, col);
        if(row - 1 >= 0 && col - 1 >= 0) openCell(row - 1, col - 1);
        if(col - 1 >= 0)openCell(row, col - 1);
        if(col - 1 >= 0 && row + 1 < minesBoard.length) openCell(row + 1, col - 1);
        if(row - 1 >= 0 && col + 1 < minesBoard[0].length) openCell(row - 1, col + 1);
        if(col + 1 < minesBoard[0].length) openCell(row, col + 1);
        if(row + 1 < minesBoard.length && col + 1 < minesBoard[0].length) openCell(row + 1, col + 1);
        if(row + 1 < minesBoard.length) openCell(row + 1, col);
    }

    private static char getNumberOfNearbyMines(int row, int col) {
        int nearbyMinesCount = 0;
        if (col - 1 >= 0 && minesBoard[row][col - 1]) nearbyMinesCount++;
        if (col - 1 >= 0 && row -1 >=0 && minesBoard[row - 1][col - 1]) nearbyMinesCount++;
        if (row -1 >=0 && minesBoard[row - 1][col]) nearbyMinesCount++;
        if (row + 1 < minesBoard.length && minesBoard[row + 1][col]) nearbyMinesCount++;
        if (row + 1 < minesBoard.length && col + 1 < minesBoard[0].length && minesBoard[row + 1][col + 1]) nearbyMinesCount++;
        if (col + 1 < minesBoard[0].length && minesBoard[row][col + 1]) nearbyMinesCount++;
        if (row - 1 >=0 && col + 1 < minesBoard[0].length && minesBoard[row - 1][col + 1]) nearbyMinesCount++;
        if (row + 1 < minesBoard.length && col - 1 >= 0 && minesBoard[row + 1][col - 1]) nearbyMinesCount++;
        return (char) (nearbyMinesCount + 48);
    }

    private static int[] getUserCommand() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int command = scanner.nextInt();
        return new int[]{row, col, command};
    }

    private static void populateMines() {
        Random rnd = new Random();
        for (int i = 0; i < MINES_COUNT; i++) {
            int row;
            int col;
            do {
                row = rnd.nextInt(visibleBoard.length);
                col = rnd.nextInt(visibleBoard[0].length);
            } while (minesBoard[row][col]);
            minesBoard[row][col] = true;
        }
    }

    private static void printVisibleBoard() {
        //Print column indexes
        System.out.print("  ");
        for (int col = 0; col < visibleBoard[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        //Print the cells
        for (int row = 0; row < visibleBoard.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < visibleBoard[0].length; col++) {
                System.out.print(visibleBoard[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void populateVisibleBoard() {
        for (int row = 0; row < visibleBoard.length; row++) {
            for (int col = 0; col < visibleBoard[0].length; col++) {
                visibleBoard[row][col] = '▒';
            }
        }
    }
}
