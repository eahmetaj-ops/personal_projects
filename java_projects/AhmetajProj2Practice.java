import javax.swing.JOptionPane;
public class AhmetajProj2Practice
{
    public static void main(String[]args)
    {
        //asking the user for their input;
        String input = JOptionPane.showInputDialog("type a word, must have the letter Y");
       
        //1)The String being worked on
        System.out.println("the string is "+input);
       
        //2)The first letter
        String firstLet = input.substring(0,1);
        System.out.println("the first letter is "+firstLet);
       
        //3)The 3rd letter
        String thirdLet = input.substring(2,3);
        System.out.println("the third letter is "+thirdLet);
       
        //4)The first 4 characters
        String firstFour = input.substring(0,4);
        System.out.println("the first four letters are "+firstFour);
       
        //5)A String from the third letter to the end.
        String thirdToEnd = input.substring(2);
        System.out.println("The third letter to the end is "+thirdToEnd);
       
        //6)The length of the String.
        int len = input.length();
        System.out.println("the length of the string is "+len);
       
        //7)The position of the first occurrence of a, and if it doesn’t exist in the string just print the value -1
        int posA = input.indexOf("a");
        System.out.println("the first position of a is "+posA);
        
        //8)The last letter
        String lastLetter = input.substring(len-1);
        System.out.println("the last letter is "+lastLetter);
        
        //9)The last 3 characters.
        String lastThreeLets = input.substring(len-3);
        System.out.println("The last three letters are "+lastThreeLets);
       
    }
}