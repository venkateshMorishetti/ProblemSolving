/*
Given a deck of cards, the task is to shuffle them. Asked in Amazon Interview
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8,
                   9, 10, 11, 12, 13, 14, 15,
                   16, 17, 18, 19, 20, 21, 22,
                   23, 24, 25, 26, 27, 28, 29,
                   30, 31, 32, 33, 34, 35, 36,
                   37, 38, 39, 40, 41, 42, 43,
                   44, 45, 46, 47, 48, 49, 50, 
                   51};
       System.out.println(Arrays.toString(shuffle(a)));
        
    }
    
    public static int[] shuffle(int[] a){
        Random r = new Random();
        int[] result = new int[a.length];
        for(int i =0; i < a.length; i++){
            int rIndex = i+r.nextInt(52-i);
            int temp = a[rIndex];
            a[rIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }
}