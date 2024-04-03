import java.util.*;
class anagram
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter string: ");
        String str1=sc.nextLine();

        System.out.print("enter string: ");
        String str2=sc.nextLine();

    //    char s= str1.toLowerCase();
    //    char st= str2.toLowerCase();
                                                                                         //   Arrays.equals(args, args)
       char[] arrays1=str1.toLowerCase().toCharArray();                                
       char [] arrays2=str2.toLowerCase().toCharArray();                                //  char[] array=str.toLowerCase().toCharArray();

        // System.out.println(str1);

        Arrays.sort(arrays1);
        Arrays.sort(arrays2);

       // System.out.println(arrays1);

        if(Arrays.equals(arrays1, arrays2))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }

    }
}