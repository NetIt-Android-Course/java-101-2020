package com.teo;

import java.util.Arrays;
import java.util.Scanner;

public class FilmReviews {

    public static void main(String[] args) {

        int[][] reviews = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };

        for (int reviewerIndex = 0; reviewerIndex < reviews.length; reviewerIndex++) {
            System.out.println("Reviewer " + (reviewerIndex + 1) + " scores:");
            for (int filmIndex = 0; filmIndex < reviews[0].length; filmIndex++) {
                System.out.print(reviews[reviewerIndex][filmIndex] + " ");
            }
            System.out.println();
        }

        Scanner console = new Scanner(System.in);
        int reviewerIndex = console.nextInt() - 1;
        int reviewSum = 0;
        for (int reviewIndex = 0; reviewIndex < reviews[reviewerIndex].length; reviewIndex++) {
            reviewSum = reviewSum + reviews[reviewerIndex][reviewIndex];
        }
        System.out.println("Avg:" + ((double) reviewSum / reviews[reviewerIndex].length));

        int[] reviewsLinear = new int[reviews.length * reviews[0].length];
        int linearIndex = 0;
        for (int row = 0; row < reviews.length; row++) {
            for (int col = 0; col < reviews[0].length; col++) {
                reviewsLinear[linearIndex] = reviews[row][col];
                linearIndex++;
            }
        }

        Arrays.sort(reviewsLinear);
        System.out.println(Arrays.toString(reviewsLinear));
    }
}
