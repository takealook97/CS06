public class Verification {
    boolean blackOrWhite;
    static int file;//가로
    static int rank;//세로 -> 이차원배열[세로][가로] 형태
    static int objectFile;
    static int objectRank;
    String color;
    String piece;

    String[] verifyBlock(String[] input) {//색깔 + 피스 리턴
        /*
        1. input이 들어왔을 때 빈칸인지 여부 확인
        2. 해당 칸의 말의 색깔 구분
        3. 알파벳 - 숫자 형식이므로 알파벳 - 'A' 해서 이차원배열의 x값 확인
         */
        file = input[0].charAt(0) - 'A' + 1;
        rank = input[0].charAt(1) - '0';
        objectFile = input[1].charAt(0) - 'A' + 1;
        objectRank = input[1].charAt(1) - '0';
        switch (Board.frame[rank][file]) {
            case "\u265F" -> {
                return new String[]{"black", "pawn"};
            }
            case "\u2659" -> {
                new Pawn().movePiece(input);
                return new String[]{"white", "pawn"};
            }
            case "\u265C" -> {
                return new String[]{"black", "rook"};
            }
            case "\u2656" -> {
                return new String[]{"white", "rook"};
            }
            case "\u265E" -> {
                return new String[]{"black", "bishop"};
            }
            case "\u2658" -> {
                return new String[]{"white", "bishop"};
            }
            case "\u265D" -> {
                return new String[]{"black", "knight"};
            }
            case "\u2657" -> {
                return new String[]{"white", "knight"};
            }
            case "\u265A" -> {
                return new String[]{"black", "king"};
            }
            case "\u2654" -> {
                return new String[]{"white", "king"};
            }
            case "\u265B" -> {
                return new String[]{"black", "queen"};
            }
            case "\u2655" -> {
                return new String[]{"white", "queen"};
            }
            default -> {//"빈칸"
                return new String[]{"null", "null"};
            }
        }
    }
}
