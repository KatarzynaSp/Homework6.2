import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Calc calc = new Calc();
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj współrzędną x:");
        double x = user.nextDouble();
        user.nextLine();
        System.out.println("Podaj współrzędną y:");
        double y = user.nextDouble();
        user.nextLine();
        user.close();

        Point point1 = new Point(x, y);
        System.out.println(calc.getInfo(point1));
    }
}