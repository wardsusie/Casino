public class Card {

    // 4 suits with 13 cards each - reference Farmville 1d

    public String suit;
    public String name; //king, queen, etc.
    public int cardValue;

    public Card(int suitNum, int cardNum){
        if(suitNum==0){
            suit = "spades";
        } else if (suitNum==1){
            suit="clubs";
        } else if (suitNum==2){
            suit="diamonds";
        } else if (suitNum==3){
            suit="hearts";
        }

        if(cardNum==0){
            name = "ace";
            cardValue = 11;
        } else if(cardNum== 1){
            name = "two";
            cardValue = 2;
        } else if (cardNum==2){
            name = "three";
            cardValue=3;
        } else if (cardNum==3){
            name = "four";
            cardValue=4;
        } else if (cardNum==4){
            name = "five";
            cardValue=5;
        } else if (cardNum==5){
            name = "six";
            cardValue=6;
        } else if (cardNum==6){
            name="seven";
            cardValue=7;
        } else if (cardNum==7){
            name="eight";
            cardValue=8;
        } else if (cardNum==8){
            name = "nine";
            cardValue=9;
        } else if (cardNum==9){
            name="ten";
            cardValue=10;
        } else if (cardNum==10){
            name="jack";
            cardValue=10;
        } else if (cardNum==11){
            name="queen";
            cardValue=10;
        } else if (cardNum==12){
            name="king";
            cardValue=10;
        }

    }
    public void printInfo(){
        System.out.println(name + " of " + suit);
    }




}
