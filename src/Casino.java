import java.util.ArrayList;

public class Casino {

    ArrayList<Card>deck = new ArrayList<>();

    public static void main(String[] args) {
        Casino table = new Casino();
    }

    public Casino(){
        for(int x = 0; x< 4; x++) {
            for (int y = 0; y < 13; y++) {
                deck.add(new Card(x, y));
            }
        }
            shuffle();
            printDeck();


    }
    public void printDeck(){
        for(Card c : deck){
            c.printInfo();
        }
    }
    public void shuffle(){

        for(int x = 0; x<52; x++) {
            int randomPos = (int)(Math.random() *52);
            int randomPos2 = (int)(Math.random() *52);
            Card temp = deck.get(x);
            deck.set(x, deck.get(randomPos2));
            deck.set(randomPos2 , temp);
        }
    }
    public void deal(){

    }
}
