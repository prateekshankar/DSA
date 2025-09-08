package main.java.CommonExample;

public class conversionBinaryDec {


    public static void main(String[] args) {
        System.out.println("binary conversion"+ decimal("1001111111"));
    }
    public static long decimal(String binary){

        int decimal = 0;
        for(int i=0;i<binary.length();i++){
        //Each left shift put it to power of two
           decimal=(decimal<<1)+ (binary.charAt(i)-'0');
        }
     return decimal;
    }
}
