import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
//        создать логин и пароль
//        Попросить пользователя ввести логин и пароль
//        Если пользователь вводит правильный логин и пароль, то вывести - «Успешно зашли в аккаунт»
//        Если нет, то вывести не правильный логин или пароль
//        Также вывести ответ «введите действительную электронную почту», если логин не будет содержать знак «@«


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your login");
        String login = sc.next();
        System.out.println("Enter your password");
        int password = sc.nextInt();

    }
}
