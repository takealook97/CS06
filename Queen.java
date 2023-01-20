public class Queen extends Movement{
    void makeQueen() {
        Board.frame[1][5] = "\u265B";
        Board.frame[8][5] = "\u2655";
        Board.blackExistance[1][5] = true;
        Board.whiteExistance[8][5] = true;
    }
    @Override
    public void movePiece(String[] input) {
        if (input[0].equals("black")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u265B";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else if (input[0].equals("white")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u2655";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else {
            new Output().printLimit();
        }
    }
}
