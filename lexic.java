import java.util.*;
public class lexico {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] ls= new String[5];
        System.out.println("enter the 5 string");
        ls[0]=sc.next();
        ls[1]=sc.next();
        ls[2]=sc.next();
        ls[3]=sc.next();
        ls[4]=sc.next();
        int i;
        System.out.println("order of input");
        for(i=0;i<5;i++)
        {
            System.out.println();
        }
        System.out.println();
        Arrays.sort(ls);
        System.out.println("lexico order");

        for(i=0;i<5;i++)
        {
            System.out.println(ls[i]+",");
        }
    } 
}
