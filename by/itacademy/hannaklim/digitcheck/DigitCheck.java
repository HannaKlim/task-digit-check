package by.itacademy.hannaklim.digitcheck;

public class DigitCheck {
    public static void main(String[] args) {
        String str = "5 5 5 j5h 5 5 5 5";

        String[] partsStr = str.split(" ");
        System.out.println(str);

        if(CheckArrayElement.checkingOfArrayElements(partsStr)) {
            System.out.println("Строка состоит из цифр");
        } else {
            System.out.println("В строке не только цифры");
        }
    }
}
