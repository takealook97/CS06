public class Bishop extends Movement{
    void makeBishop() {
        Board.frame[1][3] = "\u265D";
        Board.frame[1][6] = "\u265D";
        Board.frame[8][3] = "\u2657";
        Board.frame[8][6] = "\u2657";
        Board.blackExistance[1][3] = true;
        Board.blackExistance[1][6] = true;
        Board.whiteExistance[8][3] = true;
        Board.whiteExistance[8][6] = true;
    }
    @Override
    public void movePiece(String[] input) {
        if (input[0].equals("black")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u265D";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else if (input[0].equals("white")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u2657";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else {
            new Output().PrintLimit();
        }
    }
}
