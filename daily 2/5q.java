import java.util.*;
class reverwseed
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        
        System.out.println(Arrays.toString(arr));
        
      arrayreversed(arr,arr.length);
      
        
               
    }
    
    public static void arrayreversed(int[]a,int l)
    {
        int b[]=new int[l];
        for(int i=0;i<a.length;i++)
        {
            b[l-1-i]=a[i];
        }
        
          System.out.println(Arrays.toString(b));
        
    }
}