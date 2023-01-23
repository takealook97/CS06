
public class Position {

    int y;
    int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Position(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "x = " + getX() + " y = " + getY();
    }
}
