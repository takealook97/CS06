public class King extends Movement{
    void makeKing() {
        Board.frame[1][4] = "\u265A";
        Board.frame[8][4] = "\u2654";
        Board.blackExistance[1][4] = true;
        Board.whiteExistance[8][4] = true;
    }
    @Override
    public void movePiece(String[] input) {
        if (input[0].equals("black")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u265A";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else if (input[0].equals("white")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u2654";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else {
            new Output().printLimit();
        }
    }
}
