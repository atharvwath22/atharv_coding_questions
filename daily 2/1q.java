import java.util.Scanner;
class Reverse
{
    public static void main (String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number: ");
    int n=sc.nextInt();
    int t;

    System.out.print("reversed number is : ");

    while(n!=0)
    {
        t= n%10;
        n= n/10;
        System.out.println(+t);
    }
   } 

}