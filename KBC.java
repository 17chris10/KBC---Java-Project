import java.util.*;
public class KBC
{
    public static void main(String args[])
    {
        KBC1 ob = new KBC1();
        KBC2 o = new KBC2();
        KBC3 obj = new KBC3();
        KBC4 ob4 = new KBC4();
        int max = 4, min = 1, range = max - min + 1, rand = 0;
        rand = (int)(Math.random() * range) + min;
        switch(rand)
        {
            case 1 :
                ob.q1();
                break;
            case 2:
                o.q2();
                break;
            case 3:
                obj.q3();
                break;
            case 4 :
                ob4.q4();
                break;
            default :
                System.out.println("Invalid choice");
        }
        
    }
}