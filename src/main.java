public class main {
    public static void main(String[] args) {

        Deck test = new Deck();

        test.shuffelDeck();
        for(int i=0; i<test.getDeck().length; i++){
            System.out.println(test.getDeck()[i].getNumber());
        }




    }
}
