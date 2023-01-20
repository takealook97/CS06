public class Output {
    void printBoard() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(Board.frame[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void initPiece() {
        new Board().makeEmptyFrame();
        new Pawn().makePawn();
        new Rook().makeRook();
        new Knight().makeKnight();
        new Bishop().makeBishop();
        new King().makeKing();
        new Queen().makeQueen();
        new Output().printBoard();
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
