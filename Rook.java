public class Rook {
    void makeRook() {
        Board.frame[1][1] = "\u265C";
        Board.frame[1][8] = "\u265C";
        Board.frame[8][1] = "\u2656";
        Board.frame[8][8] = "\u2656";
        Board.blackExistance[1][1] = true;
        Board.blackExistance[1][8] = true;
        Board.whiteExistance[8][1] = true;
        Board.whiteExistance[8][8] = true;
    }
}
