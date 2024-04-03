class missingnumber
{
    public static void main (String args[])
    {
        int a[]={1,2,3,4,6,7,8};

        // orriginalarray(a);

        missing(a);
    }

    public static void missing(int arr[])
    {
        int s=0,sm=0;
        for(int i=0;i<=8;i++)
        {
            s=s+i;
        }

        for(int i=0;i<arr.length;i++)
        {
            sm=sm+arr[i];
        }
  

        int mn=s-sm;

        System.out.println("missing number is: "+mn);


    }
}