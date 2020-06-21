package com.teo;

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] arg) {
        int[][] matrix = {
                {5, 2, 6, 3},

                {9, 3, 7, 2},

                {2, 4, 5, 6}
        };

        int[][][] asd = new int[2][3][4];
        int[][][] triDmatrix = {
                {
                        {5, 2, 7, 3},
                        {5, 2, 6, 3},
                },

                {
                        {5, 2, 6, 3},
                        {5, 10, 6, 3},
                        {5}
                }
        };

        System.out.println(triDmatrix.length);
        System.out.println(triDmatrix[0].length);
        System.out.println(triDmatrix[0][0].length);
    }
}
