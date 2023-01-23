
public class Converter {

    public static Position toPosition(String rankFile) {
        return new Position(rankFile.charAt(1) - '0', rankFile.charAt(0) - 'A' + 1);
    }

    public static String toRankFile(Position position) {
        return String.valueOf((char) (position.getX() - 1 + 'A')) + position.getY();
    }
}
