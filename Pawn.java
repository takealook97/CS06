public class Pawn extends Movement {
    int movableFile;
    int movableRank;

    void makePawn() {
        for (int i = 1; i <= 8; i++) {
            Board.frame[2][i] = "\u265F";
            Board.frame[7][i] = "\u2659";
            Board.blackExistance[2][i] = true;
            Board.whiteExistance[7][i] = true;
        }
    }

    @Override
    public void movePiece(String[] input) {
//        Verification.position file = Verification.position.file;
//        Verification.position rank = Verification.position.rank;
        if (input[0].equals("black")) {
//            if (!movePawn(new String[]{Verification.position})) {
//                new Output().printLimit();
//            }
//            movePawn(input);
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u265F";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else if (input[0].equals("white")) {
            Board.frame[Verification.objectRank][Verification.objectFile] = "\u2659";
            Board.frame[Verification.rank][Verification.file] = "·";
        } else {
            new Output().printLimit();
        }
    }

//    boolean movePawn(String[] input) {
//        boolean available = false;
//        switch ()
//    }

    void moveRange() {

    }
}
