package org.example;

public class LCM {

    public static void main(String[] args) {

            long result=   lcmOfArray(4, new int[]{1, 2, 8, 3});
          System.out.println("Hello Worlkd"+ result);
    }

    static long lcmOfArray(int N, int[] A) {
        // omplete the function here

        int initial = A[0];
        for (int i = 1; i < N; i++) {
            initial = findLCM(initial, A[i]);
        }
        return initial;
    }

    public static int findLCM(int a, int b) {

        int lcm = 0;

        lcm = a * (b / findGCD(a, b));
        return lcm;

    }


    public static int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);

    }
}


