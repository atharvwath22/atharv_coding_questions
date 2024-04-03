import java.util.*;
 class unique
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,1,4,6,9};

        System.out.print("given array:");
        printarray(a);
        System.out.print("unique  array:");
        onlyunique(a);

    }  

    public static void onlyunique(int arr[])
    {
        Set<Integer> hs= new HashSet<Integer>();

         for (int i : arr) 
         {
            hs.add(i);
         }

         for (int num: hs) 
         {
            System.out.print(num+" ");
         }
    }
    

    public static void printarray(int []arr)
    {
         for (int i : arr) {
            System.out.print(i+" ");
         }
         System.out.println();
    }

}








// Duplicates : ArrayList allows duplicate values while HashSet doesn't allow duplicates values. 
//Ordering : ArrayList maintains the order of the object in which they are inserted while HashSet is an unordered collection and doesn't maintain any order