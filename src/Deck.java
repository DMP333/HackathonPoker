import java.util.ArrayList;

public class Deck {
    private Card [] deck;
    private String [] suits = {"Spade", "Diamonds", "Heart", "Club"};
    private String [] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private ComputerPlayer cpu;

    private ArrayList<Card> burntCard = new ArrayList<Card>();

    private int currentCardNumber = 0; // used to count the location of card in the deck in this game

    public Deck(){
        cpu = new ComputerPlayer();

        deck = new Card [52];
        int cardCounter = 0;

        for(int i = 0; i < 13; i++) {
            for(int j=0; j<4; j++) {
                Card card = new Card(numbers[i], suits[j], cardCounter);
                deck[cardCounter] = card;
                cardCounter ++;

            }
        }
    }

    //******* add a method that resets deck

    public void shuffelDeck(){
        int randomNum1 = (int)(Math.random()*52);
        int randomNum2 = (int)(Math.random()*52);
        Card tempCard = null;

        for(int i=0; i<3333; i++) {
            tempCard = deck[randomNum1];
            deck[randomNum1] = deck[randomNum2];
            deck[randomNum2] = tempCard;
            randomNum1 = (int)(Math.random()*52);
            randomNum2 = (int)(Math.random()*52);
        }
    }

    public void printCard(int i){

    }


    public Card[] getDeck() {
        return deck;
    }

    public void dealPreFlop() {
        for(int i=0; i<2; i++) {
            cpu.setComputerPersonalHand(deck[currentCardNumber]);
            currentCardNumber++;
        }
    }
}
