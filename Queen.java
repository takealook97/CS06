public class Queen {
    void makeQueen() {
        Board.frame[1][5] = "\u265B";
        Board.frame[8][5] = "\u2655";
        Board.blackExistance[1][5] = true;
        Board.whiteExistance[8][5] = true;
    }
}
