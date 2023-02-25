public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint();
        System.out.println(p);

        for (int i = 0; i < 10; i++) {
            p.moveDown();
            p.moveRight();
            System.out.println(p);
        }

        MovableCircle c = new MovableCircle(50, 50, 4, -1, 9);
        System.out.println(c);

        for (int i = 0; i < 100; i++) {
            c.moveUp();
            System.out.println(c);
        }

        Movable[] array = new Movable[2];
        array[0] = p;
        array[1] = c;

        for (Movable m: array) {
            m.moveUp();
            System.out.println(m);
        }
    }
}