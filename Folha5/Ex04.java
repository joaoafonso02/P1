import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nIntroduza n (1 a 10): ");
        int n = getIntRange(1, 10);

                
    }

    public static int getIntRange(int min, int max){
        int n = 0;
        do{
            n = KB.nextInt();
        }while( n<min || n>max );
        return n;
    }
}
