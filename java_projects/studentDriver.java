public class studentDriver
{
    public static void main(String[]args)
    {
        Student s1 = new Student();
        System.out.println(s1);
        
        System.out.println("---------------------------------------------");
        
        Student s2 = new Student("Gerald","54321",2.7);
        System.out.println(s2);
        
        System.out.println("---------------------------------------------");
        
        String ss1 = s2.getName();
        System.out.println(ss1);
        String ss2 = s2.getIDNumber();
        System.out.println(ss2);
        double d1 = s2.getGPA();
        System.out.println(d1);
        
        System.out.println("---------------------------------------------");
        
        s2.setName("Beth");
        s2.setIDNumber("13579");
        s2.setGPA(3.1);
        System.out.println(s2);
    }
}