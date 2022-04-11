/* Переворот строки */

package task2;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The STOXX stock index of 600 European companies fell 0.8%, while the MSCI All-Country stock " +
                "index shed 0.4%. The focus of investors on Wednesday will be on the release of minutes from the " +
                "Fed's last policy meeting, out at 1800 GMT. The yield on benchmark 10-year Treasury notes " +
                "rose to 2.63%, hitting three-year highs after Brainard's remarks.");

        System.out.println(str.reverse());
    }
}
