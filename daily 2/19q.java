import java.*;
import java.util.Scanner;
class equalto
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nuber : ");
        int n=sc.nextInt();

        int [] a={1,2,3,4,5,6,7,8};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==n)
                {
                    System.out.println("element of index "+i+" and element of index "+j+" has sum equals to "+n);
                }
            }
        }
    }
}