package main.java.Arrays;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class MissingNumber {


    public static void main(String[] args) {
        //Find the missing Number
        int n = 5;
        int[] numbers = {1, 8, 3, 5, 6, 7, 2};
        //int[] numbers = {1, 2, 3, 5, 6, 7, 8,15};
        findMissingNumberApproach5(numbers);
    }


    //Approach 1 check each number from max number present & iterate with evry elaemnt in the array time complexit O(n2)
    //this will give any missing number

    public static void findMissingNumberApproiach1(int[] arr) {
        int missingNumber;
        Arrays.sort(arr);
        int[] sortedArraay = arr;
        boolean notfound = true;
        for (int i = 1; i <= sortedArraay[sortedArraay.length - 1]; i++) {
            notfound = true;
            for (int j = 0; j < sortedArraay.length; j++) {
                if (i == sortedArraay[j]) {
                    notfound = false;
                    System.out.println(" The number is found" + i);
                    break;


                }

        /*
          }*/

            }
            if (notfound) {

                System.out.println("Missing number" + i);
                // break;

            }

            //return missingNumber;
        }

    }


//Approach 2 for finding the numbers without sorting but this will work for finding only 1 missing number
//For Consecutive numbers it will work


    public static void findMissingNumberApproiach2(int[] arr) {
        int missingNumber;
        // Arrays.sort(arr); Nlogn
        // int[] sortedArraay = arr;
        boolean notfound = true;
        for (int i = 1; i <= arr.length - 1; i++) {
            notfound = true;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    notfound = false;
                    System.out.println(" The number is found" + i);
                    break;


                }

        /*
          }*/

            }
            if (notfound) {

                System.out.println("Missing number" + i);
                // break;

            }

            //return missingNumber;
        }

    }

    //Approach 3
  public static void findMissingNumberApproach3(int[] arr){
        Arrays.sort(arr);

        //logic check the previous number with current number if the difference is >1 then that is the missing number
         int i= arr.length;
         int j=0;
         while(j<(i-1)){

            if((arr[j+1]-arr[j])>1){
                System.out.println("Missing number is "+(arr[j+1]-1));
                break;

            }
             System.out.println("number is "+ arr[j]);
                j=j+1;
         }






      }


//Approach 4

    // Find the sum of N numbers substarct by the missing number
    public static void findMissingNumberApproach4(int[] arr){
        int sumArr =0;
        for(int i: arr){
            sumArr = sumArr +i;

        }
        System.out.println("Sum of arrays"+sumArr);
        //Length of array
        int length = arr.length;
         //Sum of N elements n(n+1)/2
        int sumNNumbers=0;
        sumNNumbers= (length *(length+1))/2;
        System.out.println("Sum of N numbers"+sumNNumbers);


        System.out.println("Missing number "+ Math.abs(sumNNumbers-sumArr));
  }

    //Approach Five XOR of a number with itself is zero

    public static void findMissingNumberApproach5(int[] arr) {

        int length = arr.length;
        //Becuase one additional number 8 is added the new array will have no from 1-7  but the arr is having number 8 as well.
        int[] numb = new int[length+1];
        for (int i = 0; i < length+1; i++) {
            numb[i] = i + 1;
        }
        System.out.println("Array of numbers"+Arrays.toString(numb));
        System.out.println("Array of numbers"+Arrays.toString(arr));
         int xorArray=0;
         //this is till length of last element in arr but num is length +1
        for (int i = 0; i < length; i++)
        {  xorArray=xorArray ^ arr[i]^numb[i];}

        //The last number of array should also be XOR
            xorArray=xorArray^ numb[length];

        System.out.println("Missing number "+ xorArray);
    }

    }





