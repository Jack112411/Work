package com.caidada.Li2;

import java.util.Scanner;

public class Number32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
       int n = Math.abs(x);
        int y = 0;
        while (n != 0) {
            if (y >214748364 || y < -214748364) {
                System.out.println("溢出错误");
                break;
            }
            y = y * 10 + n % 10;
            n = n / 10;
        }
        if (x > 0) {
            System.out.println(y);
        }else {
            System.out.println(-y);
        }

    }
}
