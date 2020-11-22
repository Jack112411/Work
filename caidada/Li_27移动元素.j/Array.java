package com.caidada.Li7;

//移除数组元素与val相同的元素
public class Array {
    public static void main(String[] args) {
        int[] s = {3, 5, 54, 5, 435, 67, 5, 78, 98};
        int val = 5;
        int a = 0, k = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] != val) {
                System.out.print(i);
                s[a] = s[i];
                a++;
            } else {
                k++;
            }
        }
        System.out.println();
        for (int i = 0; i < s.length - k; i++) {

            System.out.print(s[i] + "\t");
        }
    }
}
