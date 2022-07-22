package Array;

/*
Юлианский календарь
По заданному числу n от 1 до 365 определите,
на какое число какого месяца приходится день невисокосного года с номером n.
Входные данные
Дано одно целое число n.
Выходные данные
Программа должна вывести два числа: число месяца (от 1 до 31)
и номер месяца (от 1 до 12), соответствующие  дню  с номером n.
*/
/*
* Послезавтра
По заданной дате требуется определить, какое число будет послезавтра.
Напомним, что год является високосным,
 если его номер кратен 4, но не кратен 100, а также если он кратен 400.
*/
public class Calendar {

    public void JulianCalendar(int n){
       int days= 0;
       int day = 0;
       int month=0;
        int[][] data = new int[13][32];
        for(int i =1;i<13;i++){
            month=i;
            if (day!=0) break;
            if(i==2){
                for(int j = 1; j<29;j++) {
                    days++;
                    if (days==n) {
                        day=j;
                        break;
                    }
                }
            }
            if(i==4||i==6||i==9||i==11){
                for(int j = 1;j<31;j++){
                    days++;
                    if (days==n) {
                        day=j;
                        break;
                    }
                }
            }
            else
                for (int j=1;j<32;j++){
                    days++;
                    if (days==n) {
                        day=j;
                        break;
                    }
                }
            }
        System.out.println("month:"+month+" day:"+day);
        }
        public void TheDayAfterTomorrow(int day, int month,int year){
        month = (year%400==0||(year%4==0&&year%100!=0)) ? 13 : month;
         switch (month){
             case 2:
                 if (day<27){
                     day+=2;
                 }
                 else {
                     day=(day+2)-28;
                     month++;
                 }
                 break;
             case 4,6,9,11:
                 if (day<29){
                     day+=2;
                 }
                 else {
                     day=(day+2)-30;
                     month++;
                 }
                 break;
             case 13:
                 if (day<28){
                     day+=2;
                 }
                 else {
                     day=(day+2)-29;
                     month++;
                 }
                 break;
             default:
                 if (day<30){
                     day+=2;
                 }
                 else {
                     day=(day+2)-31;
                     month++;
                 }
                 break;
            }
            System.out.println("year:"+year+" month:"+month+" day:"+day);
        }

        public void BeginningOfEra(int day, int month, int year){
        int yearDays=0;
        int monthDays=0;
            boolean isPeal = (year%400==0||(year%4==0&&year%100!=0)) ? true : false;
            for (int i = 1;i<year;i++){
                if (i%400==0||(i%4==0&&i%100!=0)){
                    yearDays+=366;
                }
                else yearDays+=365;
            }
            //if is peal
            for (int i =1;i<month;i++){
                switch (i){
                    case 2:
                        if (isPeal){
                          monthDays+=29;
                        }
                        else monthDays+=28;
                        break;
                    case 4,6,9,11:
                        monthDays+=30;
                        break;
                    default:
                        monthDays+=31;
                        break;
                }
            }
            day+=(monthDays+yearDays);
            System.out.println(day);
        }
    }

