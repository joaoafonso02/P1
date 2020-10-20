import java.util.Scanner;

public class Ex5 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        // request inputs
        System.out.print("\nP1:\n");
        System.out.print("x: ");
        double p1X = KB.nextDouble();
        System.out.print("x: ");
        double p1Y = KB.nextDouble();

        System.out.print("\nP2:\n");
        System.out.print("x: ");
        double p2X = KB.nextDouble();
        System.out.print("x: ");
        double p2Y = KB.nextDouble();

        System.out.print("\nP3:\n");
        System.out.print("x: ");
        double p3X = KB.nextDouble();
        System.out.print("x: ");
        double p3Y = KB.nextDouble();

        System.out.print("\nP4:\n");
        System.out.print("x: ");
        double p4X = KB.nextDouble();
        System.out.print("x: ");
        double p4Y = KB.nextDouble();

        // calcs
        double topSide = dist(p1X,p1Y,p2X,p2Y);
        double rightSide = dist(p2X,p2Y,p3X,p3Y);
        double bottomSide = dist(p3X,p3Y,p4X,p4Y);
        double leftSide = dist(p4X,p4Y,p1X,p1Y);

        if(topSide==rightSide&&rightSide==bottomSide&&bottomSide==leftSide){
            System.out.print("\nA figura é um quadrado.\n");
        }else{
            System.out.print("\nA figura não é um quadrado.\n");
        }

    }

    public static double dist(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}