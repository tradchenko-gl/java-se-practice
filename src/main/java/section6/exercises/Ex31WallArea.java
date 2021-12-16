package section6.exercises;

public class Ex31WallArea {
    private double width;
    private double height;

    public Ex31WallArea() {
    }

    public Ex31WallArea(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea () {
        return this.height*this.width;
    }
}
