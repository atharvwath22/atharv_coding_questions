import java.util.*;
class vowel
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string : ");
        String str=sc.nextLine();                                          //if you want to traverse an string first convert it into char array 

        char[] ch=str.toCharArray();
        

         int v=0;
         int c=0;

      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='a'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='e'|| str.charAt(i)=='u'||  str.charAt(i)=='a')
        {
               v++;
        }
        else{
          c++;
        }
        
      }

      System.out.println("vowel = "+v);
      System.out.println("consonant = "+c);
            
        
    }
}