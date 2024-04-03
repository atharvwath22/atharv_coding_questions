import java.util.*;
class rotate
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(a));

        int st=a[0];

        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=st;
        System.out.println(Arrays.toString(a));
    }
}