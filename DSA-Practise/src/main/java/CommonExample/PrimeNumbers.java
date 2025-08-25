package main.java.CommonExample;

import java.util.Arrays;

public class PrimeNumbers {


    public static void main(String[] args) {
        int N = 100;
        int[] primeNumbers = new int[N];
        seiveOfErothesis(N);
    }


    //Seive of Erothesis problem

    public static void seiveOfErothesis(int number){

        Boolean [] isPrimeNumbersArray = new Boolean [number+1];
       Arrays.fill(isPrimeNumbersArray,true);

       for(int i=2;i<=Math.sqrt(number);i++){
           if(isPrimeNumbersArray[i]){
               for(int j=i*i;j<=number;j=j+i){
                   isPrimeNumbersArray[j] = false;
               }

           }

       }
        for  ( int  i=2; i<isPrimeNumbersArray.length; i++){

            if(isPrimeNumbersArray[i]){
                System.out.print(i+" ");
            }

        }


    }


    //Generates first hundered prime numbers
    public static void findPrimeNumbers(int N) {

        for (int i = 2; i < N; i++) {

            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
            }
            /*boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println("Prime number:+" + i);
            }*/
        }


    }

    //Check if a number is prime or not

    public static  boolean isPrime(int number){

        //Two numbers a=X*y  max it can be a =n^2 if & y are equal
        boolean isPrime=true;
        for(int i=2 ;i<Math.sqrt(number);i++){

            if (number%i==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }


}
