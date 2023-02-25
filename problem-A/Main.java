public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 5, 5);
        for (int i = 0; i < 10; i++) {
            p.moveRight();
            p.moveDown();
        }
        System.out.println(p);

        MovableCircle c = new MovableCircle(100, 100, 10, 10, 10);
        System.out.println(c);
        for (int i = 0; i < 5; i++) {
            c.moveDown();
            c.moveRight();
            System.out.println(c);
        }

        Movable[] movableObjects = new Movable[10];
        for (int i = 0; i < 10; i+=2) {
            movableObjects[i] = new MovablePoint(i, i, 3, 3);
            movableObjects[i + 1] = new MovableCircle(i, i, 3, 3, 10);
        }
        for (Movable m: movableObjects) {
            // System.out.println(m);
            System.out.println(m instanceof MovableCircle);
            System.out.println(m.getClass().getName());
        }


    }
}
