package by.itacademy.hannaklim.digitcheck;

public class CheckArrayElement {
    public static boolean checkingOfArrayElements(String[] partsStr) {
        for (String s : partsStr) {
            if (s.matches("[0-9]")) {
                return true;
            }
        }
        return false;
    }
}
