package com.caidada.Li8;

import java.util.Scanner;

public class NiHao {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入字符串");
        String a = scanner.nextLine();
        System.out.println("请输入所要查找的两个字符");
        String b = scanner.nextLine();
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        int j = 0, s = 0;
        for (int i = 0; i < a.length(); i++) {
            if (chars[i] == chars1[j] && chars[i + 1] == chars1[j + 1]) {
                System.out.println(i);
            } else if (chars[i] != chars1[j] && chars[i + 1] != chars1[j + 1]) {
                s++;
            }
        }
        if (s == 0) {
            System.out.println(-1);
        }
    }
}
