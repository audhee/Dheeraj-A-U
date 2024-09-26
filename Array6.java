import java.util.*;

//LINEAR SEARCH

public class Array6 {
    static int LinearSearch(int key,int n,int array[]){
        for(int i=0;i<n;i++)
        {
            
            if(key==array[i])
            {
                System.out.println("The Key is in the index "+i);
                return 1;
            }
        }
        return -1;
    }   
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Size of the array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter The Elements of array");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter The Key To Be Searched");
        int key=sc.nextInt();
        System.out.println("The Result of the Linear Search is "+LinearSearch(key, n, array));
        if(LinearSearch(key, n, array)==1)
        {
            System.out.println("The Element is in the array at index ");
        }
        else
            System.out.println("The Element is not in the array");
    }
}
