package buchalka.section6.exercises;

public class Ex32Point {
    private int x;
    private int y;

    public Ex32Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ex32Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return distance(0, 0);
    }

    public double distance (int x, int y) {
        return Math.sqrt((x - getX())*(x - getX()) + (y - getY())*(y - getY()));
    }

    public double distance (Ex32Point point) {
       return distance(point.x, point.y);
    }
}
