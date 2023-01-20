public class Board {
    static boolean[][] blackExistance = new boolean[10][9];
    static boolean[][] whiteExistance = new boolean[10][9];
    static String[][] frame = new String[10][9];
    static int whiteScore;
    static int blackScore;

    void makeEmptyFrame() {
        frame[0][0] = " ";
        frame[9][0] = " ";
        for (int i = 1; i < 9; i++) {
            frame[0][i] = Character.toString(i - 1 + 'A');
            frame[9][i] = Character.toString(i - 1 + 'A');
            frame[i][0] = Integer.toString(i);
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                frame[i][j] = "·";
            }
        }
    }



    void calculateScore() { //white 부족한 기물 = black score <-> ''
        int[] pieceArray = new int[10];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                switch (frame[i][j]) {
                    case "\u2659" -> pieceArray[0]++;//whitePawn
                    case "\u2656" -> pieceArray[1]++;//whiteRook
                    case "\u2658" -> pieceArray[2]++;//whiteKnight
                    case "\u2657" -> pieceArray[3]++;//whiteBishop
                    case "\u2655" -> pieceArray[4]++;//whiteQueen
                    case "\u265F" -> pieceArray[5]++;//blackPawn
                    case "\u265C" -> pieceArray[6]++;//blackRook
                    case "\u265E" -> pieceArray[7]++;//blackKnight
                    case "\u265D" -> pieceArray[8]++;//blackBishop
                    case "\u265B" -> pieceArray[9]++;//blackQueen
                }
            }
        }
        int whiteSum = 39 - (pieceArray[0] + (pieceArray[1] * 5) + (pieceArray[2] + pieceArray[3]) * 3 + pieceArray[4] * 9);
        int blackSum = 39 - (pieceArray[5] + (pieceArray[6] * 5) + (pieceArray[7] + pieceArray[8]) * 3 + pieceArray[9] * 9);
        whiteScore = blackSum;
        blackScore = whiteSum;
    }
}
