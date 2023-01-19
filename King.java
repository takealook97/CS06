public class King {
    void makeKing() {
        Board.frame[1][4] = "\u265A";
        Board.frame[8][4] = "\u2654";
        Board.blackExistance[1][4] = true;
        Board.whiteExistance[8][4] = true;
    }
}
