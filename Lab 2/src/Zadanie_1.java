import java.util.Scanner;
public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату ");
        String date = in.nextLine();
        while(!date.matches("(\\d\\d)/(\\d\\d)/(\\d\\d\\d\\d)")){
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            System.out.println("Введите дату корректно");
            date = in.nextLine();
        }
        int day, month, year;
        year = (date.charAt(6) - 48) * 1000 + (date.charAt(7) - 48) * 100 + (date.charAt(8) - 48) * 10 + date.charAt(9) - 48;
        month = (date.charAt(3) - 48) * 10 + date.charAt(4) - 48;
        day = (date.charAt(0) - 48) * 10 + date.charAt(1) - 48;
        if(year > 1899 && year < 10000){
            if(month > 0 && month < 13){
                if (day < 1 || ((month == 2) && (day > 28) || ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 31)) || ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)))) {
                    System.out.println("Введенное выражение не является датой. Пожалуйста, перезапустите программу.");
                    in.close();
                } else {
                    System.out.println("Введенное выражение является датой");
                    in.close();
                }
            } else {
                System.out.println("Введенное выражение не является датой. Пожалуйста, перезапустите программу.");
                in.close();
            }
        } else {
            System.out.println("Введенное выражение не является датой. Пожалуйста, перезапустите программу.");
            in.close();
        }
    }
}