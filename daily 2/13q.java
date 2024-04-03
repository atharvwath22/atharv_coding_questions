import java.util.*;
class rotate
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter rotate by: ");
        int k=sc.nextInt();

        int a[]={1,2,3,4,5,6,7,8};

     for(int j=0;j<k;j++)
    {
        int s=a[0];
    
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=s;
    }
        System.out.println(Arrays.toString(a));

 }
}