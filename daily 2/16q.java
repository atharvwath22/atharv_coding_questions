class pangram
{
    public static void main(String args[])
    {
        String s="qwertyuiopasdfghjklzxcvnnmmm";

       s= s.toLowerCase();

       System.out.println(ispangram(s));

    }

      public static boolean ispangram(String str)
      {
       if(str.length()<26)
       {
            return false;
       }
       else
       {
          for(char i='a';i<='z';i++)  
          {                                                                         //  If a character or substring is not found, indexOf() and lastIndexOf() return -1.
            if(str.indexOf(i)<0)
            {
                return false;
            }
          }
        }

       return true;
    
      } 
}