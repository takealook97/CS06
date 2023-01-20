public class Output {
    void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(Board.frame[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void printError() {
        System.out.println("잘못된 입력 형식입니다. 다시 입력하세요.");
    }

    void PrintLimit() {
        System.out.println("그 칸으로는 움직일 수 없습니다.");
    }

    boolean inputCheck(String input) {
        boolean inputRange = false;
        if (input.length() == 2) {
            if (input.charAt(1) >= 49 && input.charAt(1) <= 56 && input.charAt(0) >= 65 && input.charAt(0) <= 72) {
                inputRange = true;
            }
        }
        return inputRange;
    }
}
