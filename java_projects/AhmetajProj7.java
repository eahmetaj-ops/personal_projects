import cardgames.*;
import javax.swing.JOptionPane;
public class AhmetajProj7
{
    public static void main(String[]args)
    {
        //making the GUI
        GUI gui = new GUI(2,true);
        
        //creating a deck and shuffling it
        Deck deck = new Deck();
        deck.shuffleDeck();
        
        //setting bank amount
        double bank = 100;
        gui.showAmount(bank);
                
        Card cardOne =  new Card(1);
        Card cardTwo =  new Card(2);
        
        boolean running = true;
        //making a while loop to run the code
        while(running == true)
        {
           //deal the cards and find out their order
            cardOne = deck.dealCard();
            cardTwo = deck.dealCard();

            if(cardOne.getValue() > cardTwo.getValue())
            {
                Card temp = cardOne;
                cardOne = cardTwo;
                cardTwo = temp;
            }

            //displaying the cards 
            gui.showCard(cardOne);
            gui.showCard(cardTwo);

            //players bet
            String choiceS = JOptionPane.showInputDialog("Enter 0 for before, 1 for between, and 2 for after");
            int choice = Integer.parseInt(choiceS);

            //how much will the player bet and displaying in the GUI
            String betS = JOptionPane.showInputDialog("Enter your bet amount");
            double bet = Double.parseDouble(betS);

            gui.showBet(bet);

            //making and showing the deck card
            Card deckCard = deck.dealCard();
            gui.showDeckCard(deckCard);

            //determining the outcome of the game
            boolean won = false;

            if(choice == 0 && deckCard.getValue() < cardOne.getValue())
                won = true;
            else if(choice == 1 && deckCard.betweenCards(cardOne, cardTwo))
                won = true;
            else if(choice == 2 && deckCard.getValue() > cardTwo.getValue())
                won = true;

            //update the bank and display the changes
            if(won == true)
            {
                bank += bet;
                gui.showAmount(bank);
                gui.showMessage("winner!");
            }
            else
            {
                bank -= bet;
                gui.showAmount(bank);
                gui.showMessage("loser!");
            }
            
            //making sure the user has money left to bet
            if(bank <= 0)
            {
                running = false;
                System.out.println("You ran out of money.");
            }
            else
            {
                //asking the user if they want to play again
                String game = JOptionPane.showInputDialog("Would you like to play again? enter 0 for yes and 1 for no");
                int g = Integer.parseInt(game);

                //checking to see if the player is playing again
                if(g == 0)
                {
                    gui.clearPlayerCards();
                    gui.clearDeckCard();
                }
                else if(g == 1)
                {
                    running = false;
                }
            }
        }
        
        //displaying the final amount
        System.out.println("Game Over! Your final balance is "+bank);
    }
}
