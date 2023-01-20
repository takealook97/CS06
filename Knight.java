public class Knight extends Movement {
    void makeKnight() {
        Board.frame[1][2] = "\u265E";
        Board.frame[1][7] = "\u265E";
        Board.frame[8][2] = "\u2658";
        Board.frame[8][7] = "\u2658";
        Board.blackExistance[1][2] = true;
        Board.blackExistance[1][7] = true;
        Board.whiteExistance[8][2] = true;
        Board.whiteExistance[8][7] = true;
    }
    @Override
    public void movePiece(String[] input) {
        if (input[0].equals("black")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u265E";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else if (input[0].equals("white")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u2658";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else {
            new Output().printLimit();
        }
    }
}
