package main.java.CommonExample;

public class GCD {
    public static void main(String[] args) {

        int a = 280, b = 36;


        System.out.println("Hello, World!" + gcdwithoutrecurssion(a, b));
    }

    private static int GcdMainnumbers(int a, int b) {

        if (b == 0) {
            return a;
        }
        return GcdMainnumbers(b, a%b);

    }


    private  static int  gcdwithoutrecurssion(int a,int b){
        
         while(b!=0){
             int temp= b;
           b=a%b;
             a=temp;
         }
        System.out.println("Hello, World!2" + a);
         return Math.abs(a);
    }
}