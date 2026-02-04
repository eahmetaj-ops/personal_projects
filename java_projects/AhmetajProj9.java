import java.util.ArrayList;
public class AhmetajProj9
{
    public static void main(String[]args)
    {
        ArrayList<String> s = new ArrayList();
        s.add("hola");
        s.add("word");
        s.add("night");
        boolean q1 = comesBefore(s,"xen");
        System.out.println("q1 = "+q1);
        
        ArrayList<Integer> i = new ArrayList();
        i.add(2);
        i.add(10);
        i.add(3);
        i.add(10);
        i.add(20);
        i.add(15);
        int q2 = maxAdjDist(i);
        System.out.println("q2 = "+q2);
        
        ArrayList<String> strs =  new ArrayList();
        strs.add("NO");
        strs.add("THIS");
        strs.add("IS");
        strs.add("better");
        
        ArrayList<String> noEs = noMoreEvilEsPLEASE(strs);
        System.out.println(noEs);
        
        
    }
    
    public static boolean comesBefore(ArrayList<String> words, String str)
    {
        for(String s: words)
        {
            if(s.compareTo(str) >= 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int maxAdjDist(ArrayList<Integer> nums)
    {
        int max = 0;
        for(int i = 0; i < nums.size()-1; i++)
        {
            if(Math.abs(nums.get(i) - nums.get(i+1)) > max)
            {
                max = Math.abs(nums.get(i) - nums.get(i+1));
            }
        }
        return max;
    }
    
    public static ArrayList<String> noMoreEvilEsPLEASE(ArrayList<String> strs)
    {
        ArrayList<String> output = new ArrayList();
        
        for(String s: strs)
        {
            if(s.indexOf("E") == -1)
            {
                output.add(s);
            }
        }
        return output;
    }
}