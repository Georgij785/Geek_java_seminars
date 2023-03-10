package Lesson1.ClassWork1;

public class Task_2 {
    public static void main(String[] args) {
        int[] array =new int[] {1,1,1,1,0,1,1,0,1,0,1,0,1,1,1,0,1,1};
        int count_1_1=0;
        int count_1_2=0;
        for (int i :array)
        {
            if (i==1)
            {
                count_1_1++;
            }
            else
            {
                if (count_1_1>count_1_2){
                    count_1_2=count_1_1;
                }
                count_1_1=0;
            }
        }
        System.out.println(count_1_2);
    }
}
