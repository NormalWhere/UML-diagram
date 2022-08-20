public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] dice;

    public void takeTurn(){
        int fvTot = 0;

        for (Die die : dice){
            die.roll();

            fvTot += die.getFaceValue();
        }

        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.piece.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }
}
