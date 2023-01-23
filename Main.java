import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(프로그램 실행)\n" + "체스 보드를 초기화했습니다.\n");

        Output output = new Output();
        Board board = new Board();
        board.initPiece();

        output.printBoard(Board.pieceMap.values());

        InputRange inputRange = new InputRange();
        Turn turn = new Turn();

        out:
        while (true) {
            int scoreOfBlack = Board.blackScore;
            int scoreOfWhite = Board.whiteScore;
            System.out.print("명령을 입력하세요 > ");
            String[] input = br.readLine().split("->");
            switch (input.length) {
                case 1 -> {
                    if (input[0].equals("close")) {
                        System.out.println("---GAME END---");
                        break out;
                    } else if (!input[0].equals("")) {
                        if (input[0].charAt(0) == '?') {
                            input[0] = input[0].replace("?", "");
                            if (inputRange.inputCheck(input[0])) {
                                if (!Board.pieceMap.containsKey(input[0])) {
                                    output.printEmptyError();
                                } else {
                                    System.out.println(board.getPossiblePosition(input[0]) + "\n");
                                }
                            } else output.printError();
                        } else output.printError();
                    } else output.printError();
                }
                case 2 -> {
                    turn.verifyTurn(input[0]);//차례검증
                    if (!Turn.result) continue;//자신의 차례가 아니면 오류 출력(아무일도 일어나지 않음)
                    if (inputRange.inputCheck(input[0]) && inputRange.inputCheck(input[1])) {//범위확인
                        if (!Board.pieceMap.containsKey(input[0])) {
                            output.printEmptyError();
                            continue;
                        }
                        if (board.getPossiblePosition(input[0]).contains(input[1])) {//움직일 수 있는 칸인지 확인
                            board.move(Converter.toPosition(input[0]), Converter.toPosition(input[1]));//이동
                        } else {
                            output.printLimit();
                            continue;
                        }
                        output.printBoard(Board.pieceMap.values());
                    } else output.printError();
                    board.calculateScore();
                    if (Board.blackScore != scoreOfBlack || Board.whiteScore != scoreOfWhite) {
                        output.printScore();
                    }
                }
                default -> output.printError();
            }
        }
    }
}