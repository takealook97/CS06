public class Verification {
    boolean blackOrWhite;
    int file;//가로
    int rank;//세로 -> 이차원배열[세로][가로] 형태
    int objectFile;
    int objectRank;

    String verifyBlock(String[] input) {
        /*
        1. input이 들어왔을 때 빈칸인지 여부 확인
        2. 해당 칸의 말의 색깔 구분
        3. 알파벳 - 숫자 형식이므로 알파벳 - 'A' 해서 이차원배열의 x값 확인
         */
        file = input[0].charAt(0) - 'A';
        rank = input[0].charAt(1) - '0';
        objectFile = input[1].charAt(0) - 'A';
        objectRank = input[1].charAt(1) - '0';
        switch (Board.frame[rank][file]) {
            case "\u265F" -> {
                return "blackPawn";
            }
        }
        if (Board.frame[rank][file].equals("\u265F")) {//흑색 폰일 경우
            return "blackPawn";
        }
        return null;
    }
}
