public class Board {
    boolean existance;
    static String[][] frame = new String[10][9];
    int whiteScore;
    int BlackScore;
    void makeEmptyFrame() {
        frame[0][0] = " ";
        frame[9][0] = " ";
        for (int i = 1; i < 9; i++) {
            frame[0][i] = Character.toString(i - 1 + 'A');
            frame[9][i] = Character.toString(i - 1 + 'A');
            frame[i][0] = Integer.toString(i);
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                frame[i][j] = "·";
            }
        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(frame[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
    }
}
