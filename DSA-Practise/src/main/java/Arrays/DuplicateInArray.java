package main.java.Arrays;

import java.util.HashMap;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] array= {1,2,2,3,4,5,6,6,5,6};

        hashingAlgo(array);
    }

    public static void  hashingAlgo(int[] arr){


        HashMap<Integer ,Integer> freqMap = new HashMap<Integer, Integer>();
        Integer currFreq=0;
        int length =arr.length;

        for(int i=0;i<arr.length;i++){
          //  currFreq=freqMap.put(i+1,1);

            if(freqMap.get(arr[i])!=null )
              {  freqMap.put((arr[i]),freqMap.get(arr[i])+1);
                  System.out.println("The duplicate no of  & frequency"+ arr[i] +"Frequency  "+ freqMap.get(arr[i]));
            }else{
                freqMap.put(arr[i],1);
                System.out.println("The no of  & frequency"+ freqMap.get(arr[i]));
            }

        }





    }

}
