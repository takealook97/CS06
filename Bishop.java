public class Bishop {
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
}
