/* Замена подстроки в строке */

package task2;

public class SubstrSubstitution {
    public static void main(String[] args) {
        String str = "Everest is the lowest mountain in the world";

        System.out.println("old string: " + str);

        StringBuilder resultedStr = new StringBuilder(str.replace("lowest", "highest"));

        System.out.println("new string: " + resultedStr);
    }
}
