package Lesson2.HomeWork2.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        String a = "41233214";
        System.out.println(isItPolindrom(a));
    }

    public static boolean isItPolindrom(String a) {

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
