package main.java.CommonExample;

public class FibonaciSeries {


    public static void main(String[] args) {
         int n =10;
        printFabonaciSeries(n);

    }

    public static void  printFabonaciSeries(int n){
        int c,count=2, a=0 ,b=1;
        //011235813
        System.out.println("Fibonacci series of "+n+" is ");
        System.out.println(a+" ");
        System.out.println(b+" ");
        while(count<=n){

            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
            count++;
        }





    }

}
