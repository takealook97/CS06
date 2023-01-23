import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_QUEEN : ChessConstant.WHITE_QUEEN;
    }

    @Override
    public void movePiece(Position from, Position to) {

    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        return null;
    }
}
