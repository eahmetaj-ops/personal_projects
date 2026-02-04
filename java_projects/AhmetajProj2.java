public class AhmetajProj2
{
    public static void main(String[]args)
    {
        //first problem
        int max1 = minOrMax(1,1,2,false);
        System.out.println("the max or min of max1 = "+max1);
        int min1 = minOrMax(3,1,2,false);
        System.out.println("the max or min of min1 = "+min1);
        
        //second problem
        //2a
        double rawGrade = calcRawGrade(90,67);
        System.out.println("the raw grade of the test and project average is "+rawGrade);
        //2b
        int RCard = calcRCardGrade(75.05);
        System.out.println("the report card grade is "+RCard);
        //2c
        String profile = calcGradeFor("Jamel Banks",88,55);
        System.out.println(profile);
        
        //third problem
        int nf1 = nextFloor(5,8,4);
        System.out.println("the next floor is "+nf1);
        
        //fourth problem
        String annoyChar = annoyingChar("aCe",'e');
        System.out.println("the result of the very annoying char is: "+annoyChar);
    }
    public static int minOrMax(int a, int b, int c, boolean max)
    {
        int output;
        if(max == true)
        {
            //checking for the max 
            if(a>=b && a>=c)
            {
                output = a;
            }
            else if(b>=a && b>=c)
            {
                output = b;
            }
            else 
            {
                output = c;
            }
        }
        else
        {
            //checking for the min
            if(a<=b && a<=c)
            {
                output = a;
            }
            else if(b<=a && b<=c)
            {
                output = b;
            }
            else 
            {
                output = c;
            }
        }
        return output;
    }
    
    public static double calcRawGrade(double projAvg, double testAvg)
    {
        double output;
        //calculating their weights
        double Pavg = projAvg*0.35;
        double Tavg = testAvg*0.65;
        output = Pavg+Tavg;
        return output;
    }
    
    public static int calcRCardGrade(double raw)
    {
        int output;
        //turning the raw into an int
        int rounded = (int)(raw+0.5);
        
        //checking the definite cases
        if(raw < 55)
        {
            output = 55;
        }
        else if(rounded%5 == 0)
        {
            output = rounded;
        }
        else if(raw >100)
        {
            output = 100;
        }
        else if(rounded>=90)
        {
            output = rounded;
        }
        else if(rounded == 88)
        {
            output = 88;
        }
        else
        {
            //checking for the remainder to see if it should round up or down
            if(rounded>55 && rounded<60)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 60;
                }
                else
                {
                    output = 55;
                }
            }
            else if(rounded>60 && rounded<65)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 65;
                }
                else
                {
                    output = 60;
                }
            }  
            else if(rounded>65 && rounded<70)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 70;
                }
                else
                {
                    output = 65;
                }
            } 
            else if(rounded>70 && rounded<75)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 75;
                }
                else
                {
                    output = 70;
                }
            } 
            else if(rounded>75 && rounded<80)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 80;
                }
                else
                {
                    output = 75;
                }
            } 
            else if(rounded>80 && rounded<85)
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 85;
                }
                else
                {
                    output = 80;
                }
            } 
            else if(rounded == 87)
            {
                output = 88;
            }
            else 
            {
                int c = rounded%5;
                if(c>=3)
                {
                    output = 90;
                }
                else
                {
                    output = 85;
                }
            } 
        }
        return output;
    }
    
    public static String calcGradeFor(String name, double projAvg, double testAvg)
    {
        //putting it all together, calling the methods
        String output;
        double rawG = calcRawGrade(projAvg,testAvg);
        int rCard = calcRCardGrade(rawG);
        output = name +": "+rCard;
        return output;
    }
    
    public static int nextFloor(int current, int button1, int button2)
    {
        int output;
        //checking if both floors are on the way
        if(button1 > current && button2 > current)
        {
            if(Math.abs(current-button1)>Math.abs(current-button2))
             {
                 output = button2;
             }
            else
                 output = button1;
        }
        //goes to the first button if they are in opposite directions
        else
        {
            output = button1;
        }
        return output;
    }
    
    public static String annoyingChar(String str, char c)
    {
        String output;
        int len = str.length();
        int posCh = str.indexOf(c);
        //checking if it exists
        if(posCh == -1)
        {
            output = str;
        }
        //checking if its the last letter
        else if(posCh == len-1)
        {
            output = str;
        }
        else
        {
            //checking if the right is uppercase then changing it
            char rightCh = str.charAt(posCh+1);
            boolean up1 = Character.isUpperCase(c);
            if(up1 == true)
            {
                boolean up2 = Character.isUpperCase(rightCh);
                if(up2 == true)
                {
                    output = str;
                }
                else
                {
                    char change = Character.toUpperCase(rightCh);
                    String before = str.substring(0,posCh+1);
                    String after = str.substring(posCh+2);
                    output = before+change+after;
                }
            }
            else
            {
                //checking if its lowercase then changing it
                boolean low2 = Character.isLowerCase(rightCh);
                if(low2 == true)
                {
                    output = str;
                }
                else
                {
                    char change = Character.toLowerCase(rightCh);
                    String before = str.substring(0,posCh+1);
                    String after = str.substring(posCh+2);
                    output = before+change+after;
                }
            }
        }
        return output;
    }
}