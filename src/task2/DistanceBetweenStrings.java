/* Расстояние между строками */

package task2;

public class DistanceBetweenStrings {
    public static void main(String[] args) {
        String sub1 = "Everest";
        String sub2 = "world";

        StringBuilder resultedStr = new StringBuilder(sub1 + " is the highest mountain in the " + sub2);

        System.out.println("Расстояние между строками 'Everest' и 'world' равно: " + (resultedStr.indexOf(sub2) - resultedStr.indexOf(sub1) - sub1.length()));

        System.out.println(resultedStr);
    }
}
