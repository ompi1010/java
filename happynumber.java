import java.util.*;
interface A{
    interface B{
        int check(int num);
    }
}
class happy implements A{
    public int check(int num){
        int rem=0,sum=0;
        while(num>0){
            rem=num%10;
            sum+=rem*rem;
            num=num/10;
        }
        return sum;
    }
}
public class happynum1{
    public static void main(String [] args){
        happy ob=new happy();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int val=num;
        while( val!=1&&val!=4)
        {
            val=ob.check(val);
        }
        if(val==1)
        {
            System.out.println("happy number");
        }
        else{
            System.out.println("not a happy number");
        }
    }

}
