import java.util.Arrays;
import java.util.Collection;

public class Output {
    static String[][] frame = new String[9][9];

    public void printBoard(Collection<ChessPiece> chessPieces) {


        for(String[] arr : frame) {
            Arrays.fill(arr, "·");
        }

        for(ChessPiece chessPiece : chessPieces) {
            frame[chessPiece.position.getY()][chessPiece.position.getX()] = chessPiece.pieceType;
        }

        System.out.println(" ABCDEFGH");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i);
            for (int j = 1; j <= 8; j++) {
                System.out.print(frame[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ABCDEFGH\n");
    }


    void printScore() {
//        calculateScore();
        System.out.println("white : " + Board.whiteScore + " | black : " + Board.blackScore + "\n");
    }

    void printError() {
        System.out.println("잘못된 입력 형식입니다. 다시 입력하세요.");
    }

    void printEmptyError() {
        System.out.println("빈 칸입니다. 다시 입력하세요.");
    }

    void printTurnError() {
        System.out.println("상대의 차례입니다.");
    }

    void printLimit() {
        System.out.println("그 칸으로는 움직일 수 없습니다. 다시 입력하세요");
    }
}
