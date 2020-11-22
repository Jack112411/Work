package com.caidada.Li5;

import javax.swing.*;
import java.util.Scanner;

public class AnnouncementClass {
    public static void main(String[] args) {
//        编写一个函数来查找字符串数组中的最长公共前缀。
//        输入字符串
        Scanner input = new Scanner(System.in);
//        K输入数组元素数
        int k = 4;//k = input.nextInt();
//        定义一组数组
        String[] character = new String[k];
//        赋值数组
        for (int i = 0; i < k; i++) {
            System.out.print("输入第" + i + "个数");
            character[i] = input.nextLine();
        }
//        字符串分解成字符
        char[] chars0 = character[0].toCharArray();
        char[] chars1 = character[1].toCharArray();
        char[] chars2 = character[2].toCharArray();
        char[] chars3 = character[3].toCharArray();
        int min = chars0.length;
        //寻找字符数组的最小长度
        if (min > chars1.length) {
            min = chars1.length;
        } else if (min > chars2.length) {
            min = chars2.length;
        } else if (min > chars3.length) {
            min = chars3.length;
        }
        for (int i = 0, j = 0; i < min; i++) {
//            同一位置字符是否相同
            if (chars0[0] != chars1[0] && chars1[0] != chars2[0] && chars2[0] != chars3[0]) {
                System.out.println("无公共前缀");
                break;
            } else if (chars0[i] == chars1[i] && chars1[i] == chars2[i] && chars2[i] == chars3[i]) {
                while (j == 0) {
                    System.out.print("公共前缀是：");
                    j++;
                }
                System.out.print(chars0[i] + "\t");
            } else {
                break;//结束寻找
            }
        }
    }
}
