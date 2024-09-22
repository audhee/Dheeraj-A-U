//To FInd the single unique number present in the array and the time complexity is should be O(n^2)
import java.util.*;
public class Singlenumber {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter THe Size of the array");
        int n=sc.nextInt();
        System.out.println("Enter The Elements of the array");
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        //System.out.println("The Unique numbers are");
        int unique=0;
        for(int x:array)
        {
            unique=unique^x;
        }
        System.out.println("The unique element of the array is "+unique);
    }
    
}
