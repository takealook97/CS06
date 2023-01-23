import java.util.ArrayList;

public abstract class ChessPiece {
    /*
    이동 전 자리는 false 이동 후 자리는 true로 변환해주어야 한다.
    상대 말을 잡으면 상대 기준 그 칸은 false가되고 자신은 true가 된다.
     */
    public Position position;

    public String pieceType;

    public Boolean isBlack;


    abstract void movePiece(Position from, Position to);

    public abstract ArrayList<ArrayList<Position>> getPossiblePosition();
}
