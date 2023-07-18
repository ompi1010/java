import java.util.*;
public class digitsum {
    public static void main(String[] args)
    {
           Scanner in=new Scanner(System.in);
           System.out.println("enter the number to find digitsum");
           int num=in.nextInt();
           int sum=num;
           int fin=0;
           int fin1=0;
           String temp=Integer.toString(num);
           int len=temp.length();
           for(int i=0;i<len;i++)
           {
               System.out.println(" "+sum%10);
               fin=fin+sum%10;
               if(Integer.toString(fin).length()!=1)
               {
                   for(int j=0;j<=Integer.toString(fin).length();j++)
                   {
                       System.out.println(" "+fin%10);
                       fin1=fin1+fin%10;
                       fin=fin/10;
                   }
                   fin=fin1;
               }
               sum=sum/10;
               
           }
           System.out.println("sum is: "+fin);
    }
}
