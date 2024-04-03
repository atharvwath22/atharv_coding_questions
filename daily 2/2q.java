import java.util.Scanner;
 class fibonica
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter number upto you want fibonaci series: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print("series is : ");
        System.out.print(+a);
        
        while(a<=n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(+c);
        }
    }
}