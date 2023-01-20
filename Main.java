import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(프로그램 실행)\n" + "체스 보드를 초기화했습니다.\n");

        new Board().makeEmptyFrame();
        new Pawn().makePawn();
        new Rook().makeRook();
        new Knight().makeKnight();
        new Bishop().makeBishop();
        new King().makeKing();
        new Queen().makeQueen();
        new Output().printBoard();

        Output output = new Output();
        out:
        while (true) {
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
                            if (output.inputCheck(input[0])) {
                                //말이 움직일 수 있는 경우의수 출력
                            }
                        } else output.printError();
                    } else output.printError();
                }
                case 2 -> {
                    if (output.inputCheck(input[0]) && output.inputCheck(input[1])) {//범위확인
                        String[] colorAndPiece = new Verification().verifyBlock(input);//검증
                        switch(colorAndPiece[1]){//처리&계산
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
                }
                default -> output.printError();
            }
        }
    }
}
