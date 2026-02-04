import javax.swing.JOptionPane;
public class AhmetajProj3
{
    public static void main(String []args)
    {
        //asking the user to input points
        String input = JOptionPane.showInputDialog("Enter coordinates (x,y)"); 
        String input2 = JOptionPane.showInputDialog("Enter coordinates (x,y)");
        String input3 = JOptionPane.showInputDialog("Enter coordinates (x,y)");
        String input4 = JOptionPane.showInputDialog("Enter coordinates (x,y)");
        //turning their inputs into points
        Point p1 = makePoint(input);
        Point p2 = makePoint(input2);
        Point p3 = makePoint(input3);
        Point p4 = makePoint(input4);
        System.out.println(p1);
        System.out.println(p2);
        
        Double d1 = p1.getX();
        System.out.println(d1);
        
        Double d2 = p1.getY();
        System.out.println(d2);
        
        //tesgint the distance method
        double distance = distanceBetween(p1,p2);
        System.out.println(distance);
        
        //testing the mid point method
        Point midP = midPoint(p1,p2);
        System.out.println(midP);
        
        //testing the slope method
        double slope = slope(p1,p2);
        System.out.println(slope);
        
        System.out.println("------------------------------------------------");
        
        //checking to see if the points make certain shapes
        
        //checking to see if its a parralelogram 
        boolean Parralelogram = isParallelogram(p1,p2,p3,p4);
        //System.out.println(Parralelogram);
        if(Parralelogram == true)
        {
            System.out.println("ABCD is a parralelogram");
        }
        else
        {
            System.out.println("ABCD is not a parralelogram");
        }
        //A(-3.0, 2.0), B(-2.0, -1.0), C(4.0, 1.0), D(3.0, 4.0)
        
        //checking to see if its a parralelogram
        boolean Rhombus = isRhombus(p1,p2,p3,p4);
        //System.out.println(Rhombus);
        if(Rhombus == true)
        {
            System.out.println("ABCD is a rhombus");
        }
        else
        {
            System.out.println("ABCD is not a rhombus");
        }
        //A(2.0, 2.0), B(4.0, 6.0), C(6.0, 2.0), D(4.0, -2.0)
        
        //checking to see if its a rectangle
        boolean Rectangle = isRectangle(p1,p2,p3,p4);
        //System.out.println(Rectangle);
        if(Rectangle == true)
        {
            System.out.println("ABCD is a rectangle");
        }
        else
        {
            System.out.println("ABCD is not a rectangle");
        }
        //A(-3.0, 2.0), B(-2.0, -1.0), C(4.0, 1.0), D(3.0, 4.0)
        
        //checking to see if its a square
        boolean Square = isSquare(p1,p2,p3,p4);
        //System.out.println(Square);
        if(Square == true)
        {
            System.out.println("ABCD is a square");
        }
        else
        {
            System.out.println("ABCD is not a square");
        }
        //A(8.0, 14.0), B(10.0, 10.0), C(14.0, 12.0), D(12.0, 16.0)
        
    }
    
    public static Point makePoint(String str)
    {
        //making a new point our of the JOptionPane in order to isolate x and y
        Point output;
        int posComma = str.indexOf(",");
        String x = str.substring(0,posComma);
        String y = str.substring(posComma+1);
        Double x1 = Double.parseDouble(x);
        Double y1 = Double.parseDouble(y);
        output = new Point(x1,y1);
        return output;
    }
    
    public static Double getX()
    {
        //making my own getX method
        Double output;
        String input = JOptionPane.showInputDialog("Enter coordinates (x,y)");;
        int posComma = input.indexOf(",");
        String x = input.substring(0,posComma);
        output = Double.parseDouble(x);
        return output;
    }
    
    public static Double getY()
    {
        //making my own getY method
        Double output;
        String input = JOptionPane.showInputDialog("Enter coordinates (x,y)");;
        int posComma = input.indexOf(",");
        String y = input.substring(posComma+1);
        output = Double.parseDouble(y);
        return output;
    }
    
    public static double distanceBetween(Point a, Point b)
    {
        double output;
        Double x1 = a.getX();
        Double x2 = b.getX();
        Double y1 = a.getY();
        Double y2 = b.getY();
        //using the distance formula to find the distance between two points
        output = Math.sqrt(Math.pow(x2.doubleValue() - x1.doubleValue(), 2) + Math.pow(y2.doubleValue() - y1.doubleValue(), 2));
        return output;
    }
    
    public static Point midPoint(Point a, Point b)
    {
        Point output;
        Double x1 = a.getX();
        Double x2 = b.getX();
        Double y1 = a.getY();
        Double y2 = b.getY();
        //finding the mid point of each coordinate
        double midX = (x1.doubleValue()+x2.doubleValue())/2;
        double midY = (y1.doubleValue()+y2.doubleValue())/2;
        
        output = new Point(midX,midY);
        return output;
    }
    
    public static double slope(Point a, Point b)
    {
        double output;
        
        Double x1 = a.getX();
        Double x2 = b.getX();
        Double y1 = a.getY();
        Double y2 = b.getY();
        //finding the slope
        output = (y2.doubleValue()-y1.doubleValue())/(x2.doubleValue()-x1.doubleValue());
        return output;
    }
    
    //checking if two lines create a right angle
    public static boolean rightAngle(Point a, Point b, Point c)
    {
        boolean output;
        
        //getting the slopes of the two lines
        double s1 = slope(a,b);
        double s2 = slope(b,c);
        
        //checking if the slopes are perpindicular
        boolean perp = s1*s2 == -1;
        
        if(perp == true)
        {
            output = true;
        }
        else
        {
            output = false;
        }
        
        return output;
    }
    
    //checking for a parrallelogram
    public static boolean isParallelogram(Point a, Point b, Point c, Point d)
    {
        boolean output;
        
        //finding the distance between each points to check if their congruent
        double d1 = distanceBetween(a,b);
        double d2 = distanceBetween(c,d);
        double d3 = distanceBetween(b,c);
        double d4 = distanceBetween(a,d);
        
        boolean congruentOpposites = (d1==d2)&&(d3==d4);
        
        //checking to see if the slopes are equal, meaning they are parralel
        double s1 = slope(a,b);
        double s2 = slope(a,d);
        double s3 = slope(b,c);
        double s4 = slope(c,d);
        
        boolean parralelOpposites = (s1==s4)&&(s3==s2);
        
        if(congruentOpposites == true && parralelOpposites == true)
        {
            output = true;
        }
        else
        {
            output = false;
        }
        
        return output;
    }
    
    public static boolean isRhombus(Point a, Point b, Point c, Point d)
    {
        boolean output;
        //checking to see if its a parralelogram, if false then it CANNOT be a rhombus
        boolean isP = isParallelogram(a,b,c,d);
        if(isP == true)
        {
            //means that its a parralelogram
            double d1 = distanceBetween(a,b);
            double d2 = distanceBetween(c,d);
            double d3 = distanceBetween(b,c);
            double d4 = distanceBetween(a,d);
            
            //checking to see if all sides of the shape are equal
            boolean allEqual = d1 == d2 && d3 == d4 && d1 == d4;
            if(allEqual == true)
            {
                output = true;
            }
            else
            {
                output = false;
            }
        }
        else
        {
            output = false;
        }
        return output;
    }
    
    public static boolean isRectangle(Point a, Point b, Point c, Point d)
    {
        boolean output;
        //checking if its a Parallelogram
        boolean isP = isParallelogram(a,b,c,d);
        
        if(isP == true)
        {
            //it is a parralelogram
            
            //checking to see if all four sides form right angles
            
            boolean r1 = rightAngle(a,b,c);
            boolean r2 = rightAngle(b,c,d);
            boolean r3 = rightAngle(c,d,a);
            boolean r4 = rightAngle(d,a,b);
            
            //checking to make sure they all form right angles and if they do its a rectangle
            if(r1 == true && r2 == true && r3 == true && r4 == true)
            {
                output = true;
            }
            else
            {
                output = false;
            }
        }
        else
        {
            output = false;
        }
        return output;
    }
    
    public static boolean isSquare(Point a, Point b, Point c, Point d) 
    {
        boolean output;
        
        //checking to see if its a rhombus and a rectangle
        boolean rhombus = isRhombus(a,b,c,d);
        boolean rectangle = isRectangle(a,b,c,d);
        
        //if they are both true its a square if not its not a square
        
        if(rhombus == true && rectangle == true)
        {
            output = true;
        }
        else
        {
            output = false;
        }
        
        return output;
    }
}