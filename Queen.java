import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_QUEEN : ChessConstant.WHITE_QUEEN;
    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>(8);
        for(int i = 0; i < 8; i++) list.add(new ArrayList<>());
        for(int i = position.getX() - 1; i >= 1; i--) {
            list.get(0).add(new Position(position.getY(), i));
        }
        for(int i = position.getX() + 1; i <= 8; i++) {
            list.get(1).add(new Position(position.getY(), i));
        }
        for(int i = position.getY() - 1; i >= 1; i--) {
            list.get(2).add(new Position(i, position.getX()));
        }
        for(int i = position.getY() + 1; i <= 8; i++) {
            list.get(3).add(new Position(i, position.getX()));
        }

        int curY = position.getY();
        int leftX = position.getX();
        int rightX = position.getX();

        while (curY++ <= 7) {
            if (leftX-- >= 2) {
                list.get(4).add(new Position(curY, leftX));//북서
            }
            if (rightX++ <= 7) {
                list.get(5).add(new Position(curY, rightX));//북동
            }
        }

        curY = position.getY();
        leftX = position.getX();
        rightX = position.getX();

        while (curY-- >= 2) {
            if (leftX-- >= 2) {
                list.get(6).add(new Position(curY, leftX));//서남
            }
            if (rightX++ <= 7) {
                list.get(7).add(new Position(curY, rightX));//동남
            }
        }
        return list;
    }
}
