import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
       int b=sc.nextInt();
       while(true)

       {
        System.out.println("enter the operation needed 1.+\n 2. - \n 3. * \n 4. / \n");
        int c=sc.nextInt();
       
        switch(c)
        {
            case 1: 
            s=a+b;
            System.out.println("the sum is" +s);
            break;
            case 2:
            s=a-b;
            System.out.println("the sum is" +s);
            break;
            case 3: 
            s=a*b;
            System.out.println("the sum is" +s);
            break;
            case 4:
            s=a/b;
            System.out.println("the sum is" +s);
            break;
            default:
            System.out.println("invalid operator");
            break;
        }
    }
    }
}
