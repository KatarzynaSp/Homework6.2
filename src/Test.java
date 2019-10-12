
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        WhichQuarter whichQuarter = new WhichQuarter();
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj współrzędną x:");
        double x = user.nextDouble();
        System.out.println("Podaj współrzędną y:");
        double y = user.nextDouble();
        user.nextLine();
        user.close();

        Point point1 = new Point(x, y);
        whichQuarter.whichQuarter(point1);
        System.out.println(whichQuarter.getInfo(point1));
    }
}