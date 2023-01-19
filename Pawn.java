public class Pawn extends Movement {
    void makePawn() {
        for (int i = 1; i <= 8; i++) {
            Board.frame[2][i] = "\u265F";
            Board.frame[7][i] = "\u2659";
            Board.blackExistance[2][i] = true;
            Board.whiteExistance[7][i] = true;
        }
    }

    @Override
    public void movePiece() {

    }
}
