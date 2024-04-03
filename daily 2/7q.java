class commaonelement
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={2,4,6,8,1};

        System.out.println("common elements are: ");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}