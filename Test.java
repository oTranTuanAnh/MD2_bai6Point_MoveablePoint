public class Test {
    public static void main(String[] args) {
        Point p = new Point(5,10);
        System.out.println(p);

        MoveablePoint mp = new MoveablePoint();
        mp.setxSpeed(20);
        mp.setySpeed(15);
        mp.setX(3);
        mp.setY(6);
        System.out.println(mp);

        MoveablePoint move = mp.move();
        System.out.println(move);
    }
}
