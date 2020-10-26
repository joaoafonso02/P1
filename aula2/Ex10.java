import java.util.Scanner;

public class Ex10 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        // request inputs
        System.out.print("\nDay: ");
        int day = KB.nextInt();
        System.out.print("Mês: ");
        int month = KB.nextInt();
        System.out.print("Ano: ");
        int year = KB.nextInt();

        if(month==2){
            int diaBisseixto = 0;
            if(year%4==0){
                diaBisseixto = 1;
            }
            int prevDay = (day)%(28+diaBisseixto)+1;
            int prevMonth = (day+1)>28+diaBisseixto ? month+1 : month;
            int nextDay = (day)%(28+diaBisseixto)+1;
            int nextMonth = (day+1)>28+diaBisseixto ? month+1 : month;
            System.out.printf("%nDia anterior é %d / %d / %d%n%n", prevDay, prevMonth, year);
            System.out.printf("%nDia seguinte é %d / %d / %d%n%n", nextDay, nextMonth, year);
        }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.printf("%nO mês %d do ano %d tem 31 dias.%n%n", month, year);
        }else{
            System.out.printf("%nO mês %d do ano %d tem 30 dias.%n%n", month, year);
        }
    }

        /*if(month==2){
            int diaBisseixto = 0;
            if(year%4==0){
                diaBisseixto = 1;
            }
            if(day==28+diaBisseixto){
                System.out.printf("%nO dia anterior é %d-%d-%d",day-1,month,year);
                System.out.printf("%nO dia anterior é %d-%d-%d",1,month+1,year);
            }else if(day==1){
                System.out.printf("%nO dia anterior é %d-%d-%d",31,month-1,year);
                System.out.printf("%nO dia anterior é %d-%d-%d",2,month,year);
            }else{
                System.out.printf("%nO dia anterior é %d-%d-%d",day-1,month,year);
                System.out.printf("%nO dia anterior é %d-%d-%d",day+1,month,year);
            }
        }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            if(day==1){
                if(month==1){
                    
                }
                System.out.printf("%nO dia anterior é %d-%d-%d",day-1,month,year);
                System.out.printf("%nO dia anterior é %d-%d-%d",1,month+1,year);
            }
        }else{
            System.out.printf("%nO mês %d do ano %d tem 30 dias.%n%n", month, year);
        }
    }*/
}
