public class Pawn {
    void makePawn() {
        for (int i = 1; i <= 8; i++) {
            Board.frame[2][i] = "\u265F";
            Board.frame[7][i] = "\u2659";
        }

    }
}
