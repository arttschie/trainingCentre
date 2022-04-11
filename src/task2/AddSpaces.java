/* Добавление пробелов в строку */

package task2;

import java.util.LinkedList;
import java.util.List;

public class AddSpaces {
    public static void main(String[] args) {
        String str = "The STOXX stock index of 600 European companies fell 0.8%, while the MSCI All-Country stock " +
                "index shed 0.4%. The focus of investors on Wednesday will be on the release of minutes from the " +
                "Fed's last policy meeting, out at 1800 GMT. The yield on benchmark 10-year Treasury notes " +
                "rose to 2.63%, hitting three-year highs after Brainard's remarks.";

        StringBuilder resultedStr = new StringBuilder("");

        List linkedString = new LinkedList();

        for (char ch : str.toCharArray()) {
            linkedString.add(ch);
            if (ch == ' ') linkedString.add(' ');
        }

        char[] resultedCharArray = new char[linkedString.size()];

        for (int i = 0; i < linkedString.size(); i++) {
            resultedCharArray[i] = (char) linkedString.get(i);
            resultedStr.append(resultedCharArray[i]);
        }

        System.out.println(resultedStr);
    }
}
