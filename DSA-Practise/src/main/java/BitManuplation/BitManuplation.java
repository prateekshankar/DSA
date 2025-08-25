package main.java.BitManuplation;

public class BitManuplation {

    public static void main(String[] args) {
        //write a program to set bit get bit
        //Git a no & to calcuate to get,set & clear ith bit.
        int setBit,getBit,clearBit,number,ithBit;

        number=14;
        ithBit=4;
        setBit = setBit(number, ithBit);

        System.out.println("Set bit noumber "+  setBit(number,ithBit))  ;

        System.out.println("Get Ith bit"+ getBit(number,ithBit));
        System.out.println(" cLEAR THE ITH BIT"+ clearBit(number,ithBit));
    }
    public static int setBit(int n, int i ){

        // To set the ith Bit we need to set it to 1 by shifting 1 by i & the or
        return  ( n | (1<<i));

    }

    public static int getBit(int n, int i){
        return n & (1<<i);
    }

    public static int clearBit(int n ,int i ){

        return n & (~(1<<i));
    }
}
