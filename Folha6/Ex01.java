import java.util.Scanner;

class Ex01{
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduza numero de elementos: ");
        int n = 
    }

    public static int getIntRange(int min, int max){
        int n = KB.nextInt();
        while( n<min||n>max ){
            System.out.printf("Número inválido. Introduza inteiro (%d a %d): ",min,max);
            n = KB.nextInt();
        }
        return n;
    }
}