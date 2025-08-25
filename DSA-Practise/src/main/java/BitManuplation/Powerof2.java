package BitManuplation;

public class Powerof2 {

    public static void main(String[] args) {

        int[] checkno = {2,6,8,16,32};

        for(int i:checkno)
            System.out.println("The number is power of 2"+ checkPowerOf2(i) );

    }


    //To find whether a no is power of2
    //all no of power of 2 has only 1 bit set 010,100,1000(N) N-1  the right most bit 01,11,111,

    public static boolean checkPowerOf2(int n){

        if(n>0){

            return (n & (n-1))==0;
        }
        return false;
    }
}
