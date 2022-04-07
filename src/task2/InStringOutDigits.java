/* Вводится строка из букв и цифр, построить новую только из цифр */

package task2;

import java.util.Scanner;

public class InStringOutDigits {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");

        str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                System.out.print(str.charAt(i));
        }

        scanner.close();
    }
}
