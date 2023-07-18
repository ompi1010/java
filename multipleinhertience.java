import java.util.Scanner;
interface vehicleone{
    int speed=90;
    public void distance();
}
interface vehicletwo{
    int distance=100;
    public void speed();
}
class vehicle implements vehicleone,vehicletwo{
    public void distance()
    {
        int distance=speed*100;
        System.out.println("The Distance is "+distance);
    }
    public void speed()
    {
        int speed=distance/100;
        System.out.println("speed is"+speed);
    }
}
class MultipleInheritanceUsingInterface {
    public static void main(String[] args){
        System.out.println("Vehicle");
        vehicle obj=new vehicle();
        obj.distance();
        obj.speed();
    }
}
