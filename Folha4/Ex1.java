import java.util.Scanner;

class Ex1 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        int counter = 0;
        int n = 0;
        while(true){
            System.out.print("Next: ");
            n = KB.nextInt();
            if( n<0 ){break;}
            counter++;
        }
        System.out.printf("\n%d numeros introduzidos.\n\n", counter);
    }
}