import java.util.Scanner;

public class Ex2 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\nIntroduza uma lista de números (terminada com 0):\n");

        double product = 1;
        while(true){
            double n = KB.nextDouble();
            if(n==0){break;}
            product *= n;
        }
        
        System.out.printf("Produto = %.3f\n\n", product);
    }
}
