public class Student
{
    private String name;
    private String IDNumber;
    private double GPA;
    
    public Student()
    {
        name = "Erion";
        IDNumber = "12345";
        GPA = 4.0;
    }
    
    public Student(String n, String i, double g)
    {
        name = n;
        IDNumber = i;
        GPA = g;
    }
    
    public String toString()
    {
        return "Name: "+name+"\nIDNumber: "+IDNumber+"\nGPA: "+GPA;
    }
    
    public String getName()
    {
        return name;
    }
    public String getIDNumber()
    {
        return IDNumber;
    }
    public double getGPA()
    {
        return GPA;
    }
    
    public void setName(String s)
    {
        name = s;
    }
    public void setIDNumber(String s)
    {
        IDNumber = s;
    }
    public void setGPA(double d)
    {
        GPA = d;
    }
}