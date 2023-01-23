import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_QUEEN : ChessConstant.WHITE_QUEEN;
    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>(4);
//        new Bishop().getPossiblePosition();
//        new Rook().getPossiblePosition();
        return list;
    }
}
