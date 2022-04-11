/* Является ли строка палиндром? */

package task2;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Для выхода введите 'close'");

        do {
            boolean isPalindrome = false;

            System.out.print("Введите строку: ");

            str = scanner.nextLine();

            if (str.length() > 1 & !str.equals("close")) {
                for (int i = 0; i < str.length()/2; i++) {
                    for (int j = str.length() - 1; j > (str.length()/2); j--){
                        if ((str.charAt(i) == str.charAt(j)) & (i != j))
                            isPalindrome = true;
                    }
                }
            } else {
                if (str.equals("close"))
                    break;
                else
                    System.out.println("Введенная строка слишком короткая, введите дургую строку: ");
            }

            System.out.println(isPalindrome);

        } while (!str.equals("close"));

        scanner.close();
    }
}
