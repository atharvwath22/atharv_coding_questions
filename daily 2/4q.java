import java.util.Arrays;
 class order
{
      public static void main(String args[])
      {
        int []a={16,9,2,7,0,1,54,2,7};
        int temp;
        
         System.out.println(Arrays.toString(a));
         
        for(int i=0;i<(a.length);i++)
        {
             for(int j=0;j<a.length;j++)
             {
                if(a[i]<a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
             }
        }
        
        for(int i=(a.length-1)/2;i<a.length;i++)
        {
            for(int j=(a.length-1)/2;j<a.length;j++)
            {
                 if(a[j]<a[i])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        
        
        System.out.println(Arrays.toString(a));

      }
}