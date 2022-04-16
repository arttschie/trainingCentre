/* Преобразования: 1) Сортировка по алфавиту; 2) Переворот каждого слова. */

package task3;

import java.io.*;
import java.util.Scanner;

public class IOTask {
    public static void main(String[] args) {
        String s;
        String temp = "";

        StringBuilder sb;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("src\\task3\\InitialFile.txt"));
            FileWriter fw =
                    new FileWriter("src\\task3\\ResultedFile.txt")) {

            while ((s = br.readLine()) != null) {
                Scanner scanner = new Scanner(s);

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
                for (String string : splitedString) {
                    sb = new StringBuilder(string);
                    sb.reverse();
                    fw.write(String.valueOf(sb) + " ");
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
