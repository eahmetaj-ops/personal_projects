import java.util.ArrayList;
public class AhmetajBlackJackHand
{
    private ArrayList<Card> hand;
    
    //constructor
    public AhmetajBlackJackHand(Card c1, Card c2)
    {
        hand = new ArrayList<Card>();
        hand.add(c1);
        hand.add(c2);
    }
    
    //toString
    //method 1
    public String toString()
    {
        return hand.toString();
    }
    
    //method 2
    public void addCard(Card c)
    {
        hand.add(c);
    }
    
    //method 3
    //returns total points in a hand
    public int getPoints(boolean highA)
    {
        int total = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            total += hand.get(i).getPointValue(highA);
        }
        return total;
    }
    
    //method 4
    //checks to see if the someone has won
    public boolean check21()
    {
        boolean win = getPoints(false) == 21 || getPoints(true) == 21;
        return win;
    }
    
    //method 5
    public ArrayList<Card> removeSuit(String suit)
    {
        ArrayList<Card> removed = new ArrayList<Card>();
        for(int i = hand.size() - 1; i >= 0; i--)
        {
            if(hand.get(i).getSuit().equals(suit))
            {
                removed.add(hand.remove(i));
            }
        }
        return removed;
    }
    
    public static void main(String[]args)
    {
        //testing
        Card c1 = new Card(14);
        Card c2 = new Card(28);
        AhmetajBlackJackHand h1 = new AhmetajBlackJackHand(c1,c2);
        System.out.println(h1.toString());
        
        Card c3 = new Card(43);
        h1.addCard(c3);
        System.out.println(h1);
        
        int points = h1.getPoints(false);
        System.out.println(points);
        
        int points2 = h1.getPoints(true);
        System.out.println(points2);
        
        boolean check = h1.check21();
        System.out.println(check);
        
        ArrayList<Card> remove = h1.removeSuit("diamonds");
        System.out.println(remove);
    }
}