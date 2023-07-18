import java.util.*;


public class binarysearch
{
    public static void main(String[] args)
    {
         Scanner scan=new Scanner(System.in);
         int low,mid,high;
         System.out.println("enter array size");
         int n=scan.nextInt();
         System.out.println("enetr array elements in sorted order");
         int arr[]=new int[5];
         int i;
         for(i=0;i<n;i++)
         {
            arr[i]=scan.nextInt();
         }
         System.out.println("enter the element to be searched");
         int num=scan.nextInt();
         int result=bs(arr,num,0,n-1);
         if(result==-1)
         System.out.println("elemet not found");
         else
         System.out.println("element found at index "+result);
         }
         static int bs(int arr[],int num,int low,int high)
         {
            if(high>=low)
            {
                int mid=(low+high)/2;
                if(arr[mid]==num)
                {
                    return mid;
                }
                else if(arr[mid]>num)
                {
                    return bs(arr,num,low,mid-1);
                }
               else 
               {
                return bs(arr,num,mid+1,high);
               }

                }
                else 
                {
                    return -1;
                }
        }
}
         
