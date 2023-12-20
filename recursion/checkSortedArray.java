// Time Complexity -> O[n]
// Check if the array is strictly increasing

import java.util.Scanner;
public class checkSortedArray {

    private static boolean checkArray(int[] arr,int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx] >= arr[idx+1]){
             return false;
        }else {
           return checkArray(arr,idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int[] arr = {12,23,34,45,56,67,78};

        System.out.println(checkArray(arr,0));
    }
}
