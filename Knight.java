import java.util.ArrayList;

public class Knight extends ChessPiece {
    public Knight(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_KNIGHT : ChessConstant.WHITE_KNIGHT;
    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, 2, -2, 1, -1};

        for (int i = 0; i < 8; i++) {
            int nx = dx[i] + position.getX();
            int ny = dy[i] + position.getY();
            if (nx > 0 && nx < 9 && ny > 0 && ny < 9) {
                list.get(0).add(new Position(ny,nx));
            }
        }

        return list;
    }
}
