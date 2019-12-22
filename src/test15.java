import java.util.Arrays;
import java.util.Scanner;
public class test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int ct = in.nextInt();
        int nums [] = new int[ct];
        for (int i = 0; i < ct; i++) {
            nums[i] = in.nextInt();
            }
        System.out.println("Вывод массива : " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Массив после пузырьковой сортировки : " + Arrays.toString(nums));}

        public static void bubbleSort(int[] arr){

            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}}