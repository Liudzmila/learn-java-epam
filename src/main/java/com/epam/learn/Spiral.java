package main.java.com.epam.learn;

public class Spiral {
    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(9, 5);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }

    public static int[][] spiral (int rows, int columns) {
        int[][] spiral = new int[rows][columns];

        int value = 1;
        int row = 0;
        int column = 0;

       while (spiral[row][column] == 0) {
        for (int i = row; i < spiral.length - row; i++) {
            for (int j = column; j < spiral[i].length - column; j++) {
                if (i == row && spiral[i][j] == 0) {
                    spiral[i][j] = value;
                    value++;
                } else {
                    if (j == spiral[i].length - 1 - column && spiral[i][j] == 0) {
                        spiral[i][j] = value;
                        value++;
                    }
                }
            }
        }
        for (int i = spiral.length - 1 - row; i > row; i--) {
            for (int j = spiral[i].length - 1 - column; j >= column; j--) {
                if (i == spiral.length - 1 - row && spiral[i][j] == 0) {
                    spiral[i][j] = value;
                    value++;
                } else {
                    if (j == column && spiral[i][j] == 0) {
                        spiral[i][j] = value;
                        value++;
                    }
                }
            }
        }
        row++;
        column++;
    }
        return spiral;
    }
}
