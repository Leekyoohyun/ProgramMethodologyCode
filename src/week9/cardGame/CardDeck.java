package week9.cardGame;

public class CardDeck {
    private Card[] deck = new Card[4*Card.SIZE_OF_ONE_SUIT]; // 카드 덱
    private int card_count; // 덱에 남아있는 카드 장수
    // deck[0], ... , deck[card_count_1] 에 카드가 있음

    // CardDeck 카드 한 벌 생성
    public CardDeck(){
        createDeck();
    }

    private void createDeck(){
        createSuit(Card.SPADES);
        createSuit(Card.HEARTS);
        createSuit(Card.CLUBS);
        createSuit(Card.DIAMONDS);
    }

    private void createSuit(String which_suit){
        for(int i = 1; i<=Card.SIZE_OF_ONE_SUIT; i++){
            deck[card_count]= new Card(which_suit,i);
        }
    }
}
