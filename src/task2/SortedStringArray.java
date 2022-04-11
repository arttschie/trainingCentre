package task2;

import java.util.Scanner;

public class SortedStringArray {
    public static void main(String[] args) {
        String str = "The STOXX stock index of 600 European companies fell 0.8%, while the MSCI All-Country stock " +
                "index shed 0.4%. The focus of investors on Wednesday will be on the release of minutes from the " +
                "Fed's last policy meeting, out at 1800 GMT. The yield on benchmark 10-year Treasury notes " +
                "rose to 2.63%, hitting three-year highs after Brainard's remarks.";
        String temp = "";

        Scanner scanner = new Scanner(str);

        String[] splitedString = scanner.nextLine().split("\\s");

        for (int i = 0; i < splitedString.length; i++) {
            for (int j = splitedString.length - 1; j >= 0; j--) {
                if (splitedString[i].charAt(0) > splitedString[j].charAt(0)) {
                    temp = temp + splitedString[i];
                    splitedString[i] = splitedString[j];
                    splitedString[j] = temp;
                    temp = "";
                }
            }
        }

        for (String s : splitedString) {
            System.out.print(s + " ");
        }
    }
}
