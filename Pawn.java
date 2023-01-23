import java.util.ArrayList;

public class Pawn extends ChessPiece {
    public Pawn(Position position, Boolean isBlack) {
        super.position = position;//super = 부모꺼 / this = 자신꺼
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_PAWN : ChessConstant.WHITE_PAWN;
    }

    @Override
    public void movePiece(Position from, Position to) {

    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(new Position(isBlack ? position.getY() + 1 : position.getY() - 1, position.getX()));
        return list;
    }
}
