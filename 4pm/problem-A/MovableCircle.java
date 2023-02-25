public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle() {
    }

    public MovableCircle(int x, int y, int xs, int ys, int radius) {
        this.center = new MovablePoint(x, y, xs, ys);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("%s, radius=%d", this.center.toString(), this.radius);
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }
}
