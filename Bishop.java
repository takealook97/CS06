import java.util.ArrayList;

public class Bishop extends ChessPiece {
    public Bishop(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_BISHOP : ChessConstant.WHITE_BISHOP;
    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        //TODO 위 아래 나눠서 움직이는 게 아니라 한번에 움직일 수 있는 방법 생각해보기
        ArrayList<ArrayList<Position>> list = new ArrayList<>(4);
        int curY = position.getY();
        int leftX = position.getX();
        int rightX = position.getX();

        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }

        while (curY++ <= 7) {
            if (leftX-- >= 2) {
                list.get(0).add(new Position(curY, leftX));//북서
            }
            if (rightX++ <= 7) {
                list.get(1).add(new Position(curY, rightX));//북동
            }
        }

        curY = position.getY();
        leftX = position.getX();
        rightX = position.getX();

        while (curY-- >= 2) {
            if (leftX-- >= 2) {
                list.get(2).add(new Position(curY, leftX));//서남
            }
            if (rightX++ <= 7) {
                list.get(3).add(new Position(curY, rightX));//동남
            }
        }

        return list;
    }
}
