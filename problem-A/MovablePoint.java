public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xs, int ys) {
        this.x = x;
        this.y = y;
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d), speed=(%d, %d)", this.x, this.y, this.xSpeed, this.ySpeed);
    }
    
    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }
}