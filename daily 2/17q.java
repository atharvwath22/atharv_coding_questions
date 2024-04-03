import java.util.Scanner;
class armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();

        checklength(n);
        
    }


    public static void checklength(int num)
    {
        int digit=0;
        int temp=num;

        while(num>0)
        {
            num=num/10;
            digit++;
        }
    

    
        num=temp;
        int unit;
        double s=0;
        while(num>0)
        {
            unit=num%10;
            s=s+(Math.pow(unit, digit));
            num=num/10;

        }

        num=temp;

        if(s==num){
            System.out.println("armstrong");
        }
        else{
            System.out.println(" no armstrong");
        }
    }
}