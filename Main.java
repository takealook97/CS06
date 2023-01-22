import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(프로그램 실행)\n" + "체스 보드를 초기화했습니다.\n");

        new Output().initPiece();

        InputRange inputRange = new InputRange();
        Output output = new Output();
        
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
                                new Cases().showMovablePosition(input[0]);
                            }
                        } else output.printError();
                    } else output.printError();
                }
                case 2 -> {
                    if (inputRange.inputCheck(input[0]) && inputRange.inputCheck(input[1])) {//범위확인
                        String[] colorAndPiece = new Verification().verifyBlock(input);//검증

                        new Turn().verifyTurn(colorAndPiece[0]);//차례 검증
                        if (!Turn.result) continue;//자신의 차례가 아니면 오류 출력(아무일도 일어나지 않음)

                        switch (colorAndPiece[1]) {//처리&계산
                            case "pawn" -> new Pawn().movePiece(colorAndPiece);
                            case "rook" -> new Rook().movePiece(colorAndPiece);
                            case "knight" -> new Knight().movePiece(colorAndPiece);
                            case "bishop" -> new Bishop().movePiece(colorAndPiece);
                            case "king" -> new King().movePiece(colorAndPiece);
                            case "queen" -> new Queen().movePiece(colorAndPiece);
                            default -> {
                                output.printEmptyError();
                                continue;
                            }
                        }
                        output.printBoard();
                    } else output.printError();
                    new Board().calculateScore();
                    if (Board.blackScore != scoreOfBlack || Board.whiteScore != scoreOfWhite) {
                        output.printScore();
                    }
                }
                default -> output.printError();
            }
        }
    }
}