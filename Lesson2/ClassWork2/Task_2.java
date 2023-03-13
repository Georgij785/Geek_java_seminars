package Lesson2.ClassWork2;

public class Task_2 {
    public static void main(String[] args) {
        int count=1;
        String a="aaaaaaaaaabbbbbcccchccccdddddeeeeeeeennnnnn";
        StringBuilder res=new StringBuilder();
        for (int i = 1; i <= a.length()-2; i++) {
            if (a.charAt(i)==a.charAt(i+1))count++;
            else{
                res.append(a.charAt(i));
                if (count>1)res.append(count);
                count=1;
                }
            }
            res.append(a.charAt(a.length()-1));
            if (count>1)res.append(count);
            System.out.println(res);
        }
    }