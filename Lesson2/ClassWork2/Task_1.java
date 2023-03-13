package Lesson2.ClassWork2;

public class Task_1 {
    public static void main(String[] args) {
        int n =6;
        char a ='a';
        char b ='b';
        StringBuilder res =new StringBuilder();

        for (int i=0;i<n/2;i++){
            res.append(a);
            res.append(b);
        }
        System.out.println(res);

    }
}
