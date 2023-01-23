import java.util.ArrayList;

public class King extends ChessPiece {
    public King(Position position, Boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
        pieceType = isBlack ? ChessConstant.BLACK_KING : ChessConstant.WHITE_KING;
    }

    @Override
    public void movePiece(Position from, Position to) {

    }

    @Override
    public ArrayList<ArrayList<Position>> getPossiblePosition() {
        ArrayList<ArrayList<Position>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, 1, -1, 1, 0, -1};

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
