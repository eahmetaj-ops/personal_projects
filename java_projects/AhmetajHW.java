public class AhmetajHW
{
    public static void main (String[]args)
    {
        System.out.println("I love to watch TV shows in my free time. My current favoirte is Dexter.");
        
        int hour = 11;   //can be any number from 0 to 23
        
        int minute = 59;
        
                System.out.println("the minutes that have passed since midnight is "+(hour*60+minute));
                
                System.out.println("HELLO");
                System.out.println("WORLD");
                
                System.out.println("---------");
                
                System.out.println("HELLO");
                System.out.print("WORLD");
                
                System.out.println("--------");
                
                System.out.print("HELLO");
                System.out.println("WORLD");
                
                
                
                Double d = checkDouble(5.0,5.5);
                System.out.println(d);
    }
    public static Double checkDouble(Double a, Double b)
    {
        Double output;
        boolean b1 = a.equals(b);
        if(b1 == true)
        {
            output = new Double(a.doubleValue()*b.doubleValue());
        }
        else
        {
            output = new Double(Math.abs(a.doubleValue()-b.doubleValue()));
        }
        return output;
    }
}