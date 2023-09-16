import java.util.ArrayList;
public class ComputerPlayer {
    private ArrayList<Card> computerPersonalHand = new ArrayList<Card>();
    private ArrayList<Integer> ComputerHand = new ArrayList<Integer>();
    private double money;

    private int numCards;

    public ComputerPlayer(){

    }


    public void setComputerPersonalHand(Card card) {
        computerPersonalHand.add(card);
    }
}



// Money, Receive two cards, betting,