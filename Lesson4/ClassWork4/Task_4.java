package Lesson4.ClassWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Task_4 {
    public static void main(String[] args) {
    //     Написать метод, который принимает массив элементов, помещает их в стэк
    //      и выводит на консоль содержимое стэка.
        ArrayList<String> str=new ArrayList<>(Arrays.asList("asd","aSDAS","FUJFG"));
        Stack <String> strStack=new Stack<>();
        for (String string : str) {
            strStack.push(string);
        }
        while(!strStack.isEmpty()){
            System.out.println(strStack.pop());
        }
    }
}
