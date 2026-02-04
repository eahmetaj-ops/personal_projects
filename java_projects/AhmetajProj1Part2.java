import javax.swing.JOptionPane;
public class AhmetajProj1Part2
{
    public static void main(String[]args)
    {
        //The String must be entered in the following format.
        //studentName [studentInfo] course1Info, course2Info, course3Info
        String input = JOptionPane.showInputDialog("Enter a string in the following format\nstudentName [studentInfo] course1Info, course2Info, course3Info");
        //Erion Ahmetaj [12:1000] Gym-98, Science-100, Math-85
       
        //1)The String that was entered.
        System.out.println("You Entered: "+input);
       
        //2)The full name of the student.
        int posBrac = input.indexOf("[");
        String name = input.substring(0,posBrac-1);
        System.out.println("Full Name: "+name);
       
        //3)The initials of the student.
        char FirstI = input.charAt(0);
        int posSpace = input.indexOf(" ");
        char LastI = input.charAt(posSpace+1);
        System.out.println("the initals of the student are: "+FirstI + LastI);
       
        //4)The grade level of the student.
        int posColon = input.indexOf(":");
        String gradeLevel = input.substring(posBrac+1,posColon);
        System.out.println("Grade Level:"+gradeLevel);
        
        //5)The ID of the student.
        int posBrac2 = input.indexOf("]");
        String ID = input.substring(posColon+1,posBrac2);
        System.out.println("ID: "+ID);
        
        //6)The name of the first course.
        int posDash = input.indexOf("-");
        String class1 = input.substring(posBrac2+2,posDash);
        System.out.println("First Course: "+class1);
        
        //7)The name of the second course.
        String afterDash = input.substring(posDash+1);
        int posDash2 = afterDash.indexOf("-");
        int posComma2 = afterDash.indexOf(",");
        String class2 = afterDash.substring(posComma2+2,posDash2);
        System.out.println("Second Course: "+class2);
        
        //8)The name of the third course
        String afterDash2=afterDash.substring(posDash2+1);
        int posDash3 = afterDash2.indexOf("-");
        int posComma3 = afterDash2.indexOf(",");
        String class3 = afterDash2.substring(posComma3+2,posDash3);
        System.out.println("Third Course: "+class3);
        
        //9)A list of the grades that are going to be averaged.
        int posComma = input.indexOf(",");
        String grade1 = input.substring(posDash+1,posComma);
        String grade2 = afterDash.substring(posDash2+1,afterDash.indexOf(",", posDash2));
        String grade3 = afterDash2.substring(posDash3+1);
        System.out.println("The grades to be averages are: "+grade1+", "+grade2+", "+grade3);
        
        //10)The correctly calculated average.
        int num1 = Integer.parseInt(grade1);
        int num2 = Integer.parseInt(grade2);
        int num3 = Integer.parseInt(grade3);
        double average = (((double)num1+num2+num3)/3);
        System.out.println("The Average is: "+average);
    }
}