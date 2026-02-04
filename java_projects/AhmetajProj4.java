import javax.swing.JOptionPane;
public class AhmetajProj4
{
    public static void main(String[]args)
    {
        //question 1
        boolean q1 = ICJava("javajav");
        System.out.println("q1 = "+q1);
        
        //question 2
        boolean q2 = differentNeighbors("alabama");
        System.out.println("q2 = "+q2);
        
        //question 3a
        String q3a = reverse("1234");
        System.out.println("q3a = "+q3a);
        
        //question 3b
        String q3b = mirrorM("blahMboom");
        System.out.println("q3b = "+q3b);
        
        //question 4
        String q4 = mockMeme("!a,b,c d e,!f");
        System.out.println("q4 = "+q4);
        
        //question 5a
        String q5 = getHint("HAPPY","HAPPY");
        System.out.println("q5 = "+q5);
        
        //question 5b
        playGuessingGame("HAPPY");
        
        //question 6
        String q6 = theEvilestE("HAPPY");
        System.out.println("q6 = "+q6);
    }
    
    //question 1
    public static boolean ICJava(String str)
    {
        boolean output;
        int count = 0;
        int posJ = str.indexOf("java");
        for(int i = 0; i<str.length()-3; i++)
        {
            if(posJ == -1)
            {
                return false;
            }
            else
            {
                String check = str.substring(i,i+4);
                if(check.equals("java"))
                {
                    posJ = check.indexOf("java");
                    count++;
                }
            }
        }
        if(count > 0 && count%2 == 0)
        {
            output = true;
        }
        else
        {
            output = false;
        }
        
        return output;
    }
    
    //question 2
    public static boolean differentNeighbors(String str)
    {
        for(int i = 0; i < str.length()-1; i++)
        {
            char b4 = str.charAt(i);
            char after = str.charAt(i+1);
            if(b4 == after)
            {
                return false;
            }
            
            if(str.charAt(str.length()-1) == str.charAt(str.length()-2))
            {
                return false;
            }
        }
        return true;
    }
    
    //question 3a
    public static String reverse(String str)
    {
        String output = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);
            output += c;
        }
        return output;
    }
    
    //question 3b
    public static String mirrorM(String str)
    {
        String output = "";
        int posM = str.indexOf("M");
        String before = str.substring(0,posM);
        int len1 = before.length();
        String after = str.substring(posM+1);
        int len2 = after.length();
        
        if(len1 < len2)
        {
            String newB4 = reverse(before);
            String newAfter = reverse(str.substring(posM+1,posM+1+len1));
            String last = str.substring(posM+1+len1);
            output = newAfter+"M"+newB4+last;
        }
        else
        {
            String newAfter2 = reverse(after);
            String newB42 = reverse(str.substring(posM-len2,posM));
            String last2 = str.substring(0,posM-len2);
            output = last2+newAfter2+"M"+newB42;
        }
        return output;
    }
    
    //question 4
    public static String mockMeme(String phrase)
    {
        String output = "";
        for(int i = 0; i < phrase.length(); i++)
        {
            char c = phrase.charAt(i);
            if(Character.isLetter(c) == true)
            {
                if(i%2 == 0)
                {
                    c = Character.toUpperCase(c);
                    output+=c;
                }
                else
                {
                    c = Character.toLowerCase(c);
                    output+=c;
                }
            }
            else if(c == ' ')
            {
                output+=c;
            }
            else 
            {
                output+= "";
            }
        }
        return output;
    }
    
    //question 5a
    public static String getHint(String hiddenWord, String guess)
    {
        int len = hiddenWord.length();
        int len2 = guess.length();
        String output = "";
        for(int i = 0; i<len; i++)
        {
            char c = hiddenWord.charAt(i);
            char c2 = guess.charAt(i);
                if(c == c2)
                {
                    output+=c2;
                }
                else if(hiddenWord.indexOf(c2) != -1)
                {
                    output+="+";
                }
                else
                {
                    output+="*";
                }
        }
         return output;
    }
    
    //question 5b
    public static void playGuessingGame(String hiddenWord)
    {
        int count = 0;
        boolean ended = false;
        while(count<10 && ended == false)
        {
            count++;
            String input = JOptionPane.showInputDialog("guess a word ");
            String play = getHint(hiddenWord, input);
            System.out.println(play);
            if(input.equals(hiddenWord))
            {
                System.out.println("congrats you got it in "+count+" tries");
                ended = true;
            }
        }
        if(ended == false)
        System.out.println("You tried your best! Failed though, the word was "+hiddenWord);
    }
    
    //question 6 helper
    public static boolean neighborEs(String str,int posE)
    {
        if(posE == -1)
        {
            return false;
        }
        else if(str.charAt(posE-1) == 'e' && str.charAt(posE+1) == 'e')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    //question 6
    public static String theEvilestE(String str)
    {
        str = "$"+str+"$";
        String output = "";
        int count = 0;
        for(int i = 1; i<str.length()-1; i++)
        {
            char c = str.charAt(i);
            if(c == 'E')
            {
                count++;
            }
        }
        
        if(count%2 == 0 || count == 1)
        {
            return str.substring(1,str.length()-1);
        }
        
        //finding the middle E
        int mid = (count/2)+1;
        int currE = 0;
        int evilestEPos = -1;
        boolean foundE = false;
        
        for(int j = 1; j<str.length()-1; j++)
        {
            if(foundE == false)
                {
                char cE = str.charAt(j);
                if(cE == 'E')
                {
                    currE++;
                }

                if(currE == mid)
                {
                    evilestEPos = j;
                    foundE = true;
                }
            }
        }
        
        if(evilestEPos == -1 || neighborEs(str,evilestEPos) == false)
        {
            return str.substring(1,str.length()-1);
        }
        
        for(int k = 1; k<str.length()-1; k++)
        {
            char c = str.charAt(k);
            if(k != evilestEPos)
            {
                output+= "-";
            }
            else
            {
                output+="E";
            }
        }
        return output;
    }
}