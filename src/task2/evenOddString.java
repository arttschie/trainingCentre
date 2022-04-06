/* Четные и нечетные символы разделить по разным строкам */

package task2;

public class evenOddString {
    public static void main(String[] args) {
        String str1 = "The STOXX stock index of 600 European companies fell 0.8%, while the MSCI All-Country stock " +
                "index shed 0.4%. The focus of investors on Wednesday will be on the release of minutes from the " +
                "Fed's last policy meeting, out at 1800 GMT. The yield on benchmark 10-year Treasury notes " +
                "rose to 2.63%, hitting three-year highs after Brainard's remarks.";
        String evenStr = "";
        String oddStr = "";

        for (int i = 0; i < str1.length(); i ++) {
            if (i % 2 == 0)
                evenStr = evenStr + str1.charAt(i);
            else
                oddStr = oddStr + str1.charAt(i);
        }

        System.out.println(evenStr);
        System.out.println(oddStr);
    }
}
