package practice1.com.example;

public class Line {
    private Dot start;
    private Dot end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public Dot getEnd() {
        return end;
    }

    public Dot getStart() {
        return start;
    }

    public double lenght() {
        double dX = start.getX() - end.getX();
        double dY = start.getY() - end.getY();
        return Math.sqrt( dX * dX + dY * dY);
    }
}