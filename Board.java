import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    static int whiteScore;
    static int blackScore;
    public static HashMap<String, ChessPiece> pieceMap = new HashMap<>();

    public void initPiece() {
        for (int i = 1; i <= 8; i++) {
            pieceMap.put(String.valueOf((char) ('A' + i - 1)) + 2, new Pawn(new Position(2, i), ChessConstant.BLACK));
            pieceMap.put(String.valueOf((char) ('A' + i - 1)) + 7, new Pawn(new Position(7, i), ChessConstant.WHITE));
        }
        pieceMap.put("A1", new Rook(new Position(1, 1), ChessConstant.BLACK));
        pieceMap.put("H1", new Rook(new Position(1, 8), ChessConstant.BLACK));
        pieceMap.put("A8", new Rook(new Position(8, 1), ChessConstant.WHITE));
        pieceMap.put("H8", new Rook(new Position(8, 8), ChessConstant.WHITE));

        pieceMap.put("B1", new Knight(new Position(1, 2), ChessConstant.BLACK));
        pieceMap.put("G1", new Knight(new Position(1, 7), ChessConstant.BLACK));
        pieceMap.put("B8", new Knight(new Position(8, 2), ChessConstant.WHITE));
        pieceMap.put("G8", new Knight(new Position(8, 7), ChessConstant.WHITE));

        pieceMap.put("C1", new Bishop(new Position(1, 3), ChessConstant.BLACK));
        pieceMap.put("F1", new Bishop(new Position(1, 6), ChessConstant.BLACK));
        pieceMap.put("C8", new Bishop(new Position(8, 3), ChessConstant.WHITE));
        pieceMap.put("F8", new Bishop(new Position(8, 6), ChessConstant.WHITE));

        pieceMap.put("E1", new Queen(new Position(1, 5), ChessConstant.BLACK));
        pieceMap.put("E8", new Queen(new Position(8, 5), ChessConstant.WHITE));

        pieceMap.put("D1", new King(new Position(1, 4), ChessConstant.BLACK));
        pieceMap.put("D8", new King(new Position(8, 4), ChessConstant.WHITE));
    }

    public ArrayList<String> getPossiblePosition(String rankFile) {//todo : 이해하기
        ArrayList<String> result = new ArrayList<>();
        if (pieceMap.containsKey(rankFile)) {
            ChessPiece piece = pieceMap.get(rankFile);

            ArrayList<ArrayList<Position>> list = piece.getPossiblePosition();

            for (ArrayList<Position> arrList : list) {
                for (Position p : arrList) {
                    if (!pieceMap.containsKey(Converter.toRankFile(p))) {
                        result.add(Converter.toRankFile(p));//위치를 안가지고 있으면 더하기
                    } else if (pieceMap.get(Converter.toRankFile(p)).isBlack != piece.isBlack) {
                        result.add(Converter.toRankFile(p));//색깔이 다르면 더하기
                        break;
                    } else {
                        break;
                    }
                }
            }
            return result;
        }
        return result;
    }

    public void move(Position from, Position to) {
        if (pieceMap.containsKey(Converter.toRankFile(from))) {
            ArrayList<String> list = getPossiblePosition(Converter.toRankFile(from));

            for (String rankFile : list) {
                if (Converter.toRankFile(to).equals(rankFile)) {
                    pieceMap.remove(rankFile);
                    ChessPiece piece = pieceMap.get(Converter.toRankFile(from));
                    piece.position = to;
                    pieceMap.remove(Converter.toRankFile(from));
                    pieceMap.put(rankFile, piece);
                }
            }
        }
    }

    void calculateScore() { //white 부족한 기물 = black score <-> ''
        int[] pieceArray = new int[10];
        for (String key : pieceMap.keySet()) {
            switch (pieceMap.get(key).pieceType) {
                case ChessConstant.WHITE_PAWN -> pieceArray[0]++;//whitePawn
                case ChessConstant.WHITE_ROOK -> pieceArray[1]++;//whiteRook
                case ChessConstant.WHITE_KNIGHT -> pieceArray[2]++;//whiteKnight
                case ChessConstant.WHITE_BISHOP -> pieceArray[3]++;//whiteBishop
                case ChessConstant.WHITE_QUEEN -> pieceArray[4]++;//whiteQueen
                case ChessConstant.BLACK_PAWN -> pieceArray[5]++;//blackPawn
                case ChessConstant.BLACK_ROOK -> pieceArray[6]++;//blackRook
                case ChessConstant.BLACK_KNIGHT -> pieceArray[7]++;//blackKnight
                case ChessConstant.BLACK_BISHOP -> pieceArray[8]++;//blackBishop
                case ChessConstant.BLACK_QUEEN -> pieceArray[9]++;//blackQueen
            }
        }
        int whiteSum = 39 - (pieceArray[0] + (pieceArray[1] * 5) + (pieceArray[2] + pieceArray[3]) * 3 + pieceArray[4] * 9);
        int blackSum = 39 - (pieceArray[5] + (pieceArray[6] * 5) + (pieceArray[7] + pieceArray[8]) * 3 + pieceArray[9] * 9);
        whiteScore =blackSum;
        blackScore =whiteSum;
    }
}

