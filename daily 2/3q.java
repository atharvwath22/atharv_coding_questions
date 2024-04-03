import java.util.Scanner;
 class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the string value : ");
        String s=sc.nextLine();
          
        boolean flag=true;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.print("palindrome");
        }
        else{
            System.out.print(" not palindrome");
        }
    }  
}