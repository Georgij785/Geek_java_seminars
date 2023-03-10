package Lesson1.ClassWork1;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        //     int [] arr = {1,2,4,4,6,7,3,3,2,1,1,5,6,3,4};
        //     // Scanner iScanner=new Scanner(System.in);
        //     int n =3;//iScanner.nextInt();
        //     for (int i=0;i<arr.length;i++)
        //     {
        //         if (arr[i]==n){
        //             for (int j=i;j<arr.length-1;j++){
    
        //                 arr[j]=arr[j+1];
        //             }
        //             arr[arr.length-1]=n;
        //         }
        //     }
        //     System.out.println(Arrays.toString(arr));
            int val = 3;
            int[] nums = new int[] {1, 2, 4, 3, 3, 7, 3, 2, 3, 1, 5, 6, 4, 2, 4};
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val){
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                nums[nums.length - 1] = val;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
}
