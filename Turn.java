public class Turn {
    static boolean turn = true;//true = white / false = black
    static boolean result = true;

    void verifyTurn(String input) {
        if (Board.pieceMap.containsKey(input) && Board.pieceMap.get(input).isBlack != null) {
            if (Board.pieceMap.get(input).isBlack) {
                if (turn) {
                    new Output().printTurnError();
                    result = false;
                } else {
                    turn = true;//본인의 차례이면 다음 턴을 위해 boolean을 미리 상대측으로 바꾼다.
                    result = true;
                }
            } else if (!Board.pieceMap.get(input).isBlack) {
                if (!turn) {
                    new Output().printTurnError();
                    result = false;
                } else {
                    turn = false;
                    result = true;
                }
            }
        }
    }
}