/**
    Given an array a, your task is to output an array b of the same length by applying the following transformation:

    For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
    If an element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, use 0 in its place
    For instance, b[0] = 0 + a[0] + a[1]
    Example: For a = [4, 0, 1, -2, 3]:

    b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
    b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
    b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
    b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
    b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
    So, the output should be solution(a) = [4, 5, -1, 2, 1].
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = new int[]{1,2,3,4,5};
       int[] res = new int[arr.length];
       for(int i = 0; i < arr.length; i++){
            int prev = 0, next = 0;
           if(i != 0){
               prev = arr[i-1];
           }
           if(i != arr.length-1){
               next = arr[i+1];
           }
           res[i] = prev+arr[i]+next;
       }
       System.out.println(Arrays.toString(res));
    }
}