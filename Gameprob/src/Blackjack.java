public class Blackjack {

    public static void main(String[] args) throws Exception {

        BlackjackGame mygame = new BlackjackGame();
//starts game
        mygame.initializeGame();
        do {
            mygame.shuffle();
            mygame.getBets();
            mygame.dealCards();
            mygame.printStatus();
            mygame.checkBlackjack();
            mygame.hitOrStand();
            mygame.dealerPlays();
            mygame.settleBets();
            mygame.printMoney();
            mygame.clearHands();
        } while (mygame.playAgain());
        mygame.endGame();
    }}
