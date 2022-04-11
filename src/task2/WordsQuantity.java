/* Подсчет количества слов в строке */

package task2;

import java.util.Scanner;

public class WordsQuantity {
    public static void main(String[] args) {
        String str = "The STOXX stock index of 600 European companies fell 0.8%, while the MSCI All-Country stock " +
                "index shed 0.4%. The focus of investors on Wednesday will be on the release of minutes from the " +
                "Fed's last policy meeting, out at 1800 GMT. The yield on benchmark 10-year Treasury notes " +
                "rose to 2.63%, hitting three-year highs after Brainard's remarks.";

        Scanner scanner = new Scanner(str);

        String[] splitedString = scanner.nextLine().split("\\s");

        System.out.println(splitedString.length);
    }
}
