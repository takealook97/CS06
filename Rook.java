import java.util.ArrayList;

public class Rook extends ChessPiece {

    public Rook(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_ROOK : ChessConstant.WHITE_ROOK;
    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>(4);
        for(int i = 0; i < 4; i++) list.add(new ArrayList<>());

        for(int i = position.getX() - 1; i >= 1; i--) {
            list.get(0).add(new Position(position.getY(), i));//서
        }

        for(int i = position.getX() + 1; i <= 8; i++) {
            list.get(1).add(new Position(position.getY(), i));//동
        }

        for(int i = position.getY() - 1; i >= 1; i--) {
            list.get(2).add(new Position(i, position.getX()));//남
        }

        for(int i = position.getY() + 1; i <= 8; i++) {
            list.get(3).add(new Position(i, position.getX()));//북
        }


        return list;
    }
}
