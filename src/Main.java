import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        Point p1 = new Point(x, y);
        x = in.nextDouble();
        y = in.nextDouble();
        Point p2 = new Point(x,y);
        System.out.println(Point.distance(p1,p2));
    }
}

