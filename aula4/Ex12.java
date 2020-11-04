import java.util.Scanner;

public class Ex12 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.print("\n\nIntroduza Dia da semana: ");
            int day = KB.nextInt();
            System.out.print("Introduza Mẽs: ");
            int month = KB.nextInt();
            System.out.print("Introduza Year: ");
            int year = KB.nextInt();

            if( month<=0 && month>12 ){
                System.out.print("\nBad Inputs! Try again...");
                continue;
            }

            int monthsDays = 0;
            String monthName = "";
            switch(month){
                case 1:
                    monthName = "Janeiro";
                case 3:
                    monthName = "Março";
                case 5:
                    monthName = "Maio";
                case 7:
                    monthName = "Julho";
                case 8:
                    monthName = "Agosto";
                case 10:
                    monthName = "Outubro";
                case 12:
                    monthName = "Dezembro";
                    monthsDays = 31;
                    break;
                case 4:
                    monthName = "Abril";
                case 6:
                    monthName = "Junho";
                case 9:
                    monthName = "Setembro";
                case 11:
                    monthName = "Novembro";
                    monthsDays = 30;
                    break;
                case 2:
                    monthName = "Fevereiro";
                    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                        monthsDays = 29;
                    }
                    else{
                        monthsDays = 28;
                    }
                    break;
                default:
                    System.err.println("Month does not fit the switch!");
                    System.exit(3);
                    break;
            }

            System.out.print("\n----------------------\n");
            System.out.printf("|%11s %4d    |\n", monthName, year);
            System.out.print("----------------------\n");
            System.out.print("|Su Mo Tu We Th Fr Sa|\n");
            System.out.print("----------------------\n");
            for (int i = 0; i < 6; i++) {
                if( i*7>monthsDays+day ){break;}
                System.out.print("|");
                for (int j = 0; j < 7; j++) {
                    int n = i*7+j;
                    if( n<day-1 || n-day+2>monthsDays ){
                        System.out.print("  ");
                    }else{
                        System.out.printf("%2d", n-day+2);
                    }
                    if(j<6){System.out.print(" ");}
                }
                System.out.print("|\n");
            }
            System.out.print("----------------------\n");
            break;
        }
    }
}
