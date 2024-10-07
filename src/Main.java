import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static boolean Password(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean U = Pattern.compile("[A-Z]").matcher(password).find();
        boolean L = Pattern.compile("[a-z]").matcher(password).find();
        boolean N = Pattern.compile("[0-9]").matcher(password).find();
        boolean V = Pattern.compile("^[A-Za-z0-9_]+$").matcher(password).matches();
        return U && L && N && V;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль");
        String password = scanner.nextLine();
        if (Password(password)) {
            System.out.println("Пароль надежный.");
        } else {
            System.out.println("Пароль ненадежный.");
        }
        scanner.close();
    }
}
