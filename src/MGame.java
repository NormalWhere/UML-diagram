public class MGame {

    private static final int N = 10;
    private int roundCnt = 0;
    private Player[] players;
    private Board board;
    private Die[] dice;

    public void playGame(){
        while(roundCnt < N){
            playRound();
            roundCnt++;
        }
    }
    public void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }

}
