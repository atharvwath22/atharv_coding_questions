import java.util.*;
class removeduplicate
{
    public static void main(String[] args) 
    {
       
        Set<Integer> hs=new HashSet<Integer>();

        int a[]={1,2,3,4,4,5,5,6,6,7};

        for (int i : a) {
            hs.add(i);
        }

        for (int i : hs) {
            System.out.print(i+" ");
        }

       
    }
}