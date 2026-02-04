public class APLine
{
    private int a;
    private int b;
    private int c;
    
    public APLine(int A, int B, int C)
    {
        a = A;
        b = B;
        c = C;
    }
    
    public double getSlope()
    {
        return (-1*a)/b;
    }
    
    public boolean isOnline(int x, int y)
    {
        boolean output = (a * x + b * y + c == 0);
        return output;
    }
}