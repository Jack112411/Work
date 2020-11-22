package com.caidada.Li3;

import java.util.Scanner;
//判断一个整数是不是回文数
public class ReturnNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      如果是整数进入if语句
        if (scanner.hasNextInt()) {
//            输入一个数
            int input = scanner.nextInt();
//            小于零直接pass
            if (input < 0) {
                System.out.println("false");
            } else {//进入都为正整数
//               求这个数的位数
                int length = (int) (Math.log10(input) + 1);
//                用数组查看是否对称
                int[] a = new int[length];
                for (int i = 0; i < length; i++) {
                    a[i] = input % 10;
                    input = (input - input % 10) / 10;
                }
//               若num小于零则不对称
                int num = 0;
                for (int i = 0; i < length; i++, length--) {
                    if (a[i] != a[length - 1]) {
                        num = 1;
                    }
                }
                System.out.println();
                if (num == 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
//                 如输入的非整数则输入错误
        } else {
            System.out.println("输入错误");
//                直接结束程序
//            System.exit(0);
//            System.exit(1);
        }
    }
}
