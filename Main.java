import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(프로그램 실행)\n" + "체스 보드를 초기화했습니다.\n");
        Board board = new Board();
        board.frame();
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
                    if (output.inputCheck(input[0]) && output.inputCheck(input[1])) {
                        //이동 메서드 실행
                    } else output.printError();
                }
                default -> output.printError();
            }
        }
    }
}
