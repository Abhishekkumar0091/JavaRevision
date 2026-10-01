public class App
{
    public static void main (String [] args)
    {
        AA o1,o2,o3;
        o1=new AA();
        o2=new AA();
        o3=new AA();

        o1.y=90;
        o2.y=10;
        o3.y=5;
        System.out.println(o1.y+o2.y+o3.y);

        o1.x=10;
        o2.x=90;
        o3.x=5;
        System.out.println(o1.x+o2.x+o3.x);


    }
}
