import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату ");
        String password = in.nextLine();
        while(!password.matches("([\\w][\\w][\\w][\\w][\\w][\\w][\\w][\\w]+)") &&(!password.matches("[0-9]") )&& (!password.matches("[a-z]"))&& (!password.matches("[A-Z]"))){
            System.out.println("Пароль ненадежен.");
            System.out.println("Повторите ввод");
            password = in.nextLine();
        }
        System.out.println("Пароль надежен.");
    }
}
