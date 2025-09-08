package main.java.Arrays;

public class OddNumberTimes {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,3,5,2,1};
        findOddOccurence(arr);
    }

public static void  findOddOccurence(int[] arr){
        int xor=0;

        for(int i:arr)
            xor^=i;

    System.out.println("Odd occurence of number"+ xor);



}


}
