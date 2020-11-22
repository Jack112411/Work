package com.caidada.Li6;

public class DeleteTheArray {
    public static void main(String[] args) {
        int[] s = {1, 34, 56, 5647, 4, 65, 3456, 234, 4, 345};
        int[] d = {1, 34, 562, 789, 90, 9, 65};
        int k = s.length + d.length;
        int l = 0;
//        将数组元素放在一起
        int[] comprehensive = new int[k];
        for (int i = 0; i < s.length; i++) {
            comprehensive[l] = s[i];
            l++;
        }
        for (int j = 0; j < d.length; j++) {
            comprehensive[l] = d[j];
            l++;
        }
//        升序排列
        int media;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (comprehensive[i] > comprehensive[j]) {
                    media = comprehensive[i];
                    comprehensive[i] = comprehensive[j];
                    comprehensive[j] = media;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(comprehensive[i] + "\t");
        }
        System.out.println();
        System.out.println("====================================");
        int lth = 0;
        for (int m = 1; m < k; m++) {
            if (comprehensive[m - 1] == comprehensive[m]) {
                lth = k - 1;
                k--;
            }
        }
        System.out.println(lth);
        System.out.println("================================");
//        定义新数组 新数组赋值
        int[] newArray = new int[lth];
        int a = 0;
        for (int i = 1; i < s.length + d.length; i++) {
            if (comprehensive[i - 1] != comprehensive[i]) {
                newArray[a] = comprehensive[i - 1];
                a++;
                if (i + 1 == s.length + d.length)
                    newArray[a] = comprehensive[i];
            }
        }
        for (int p = 0; p < lth; p++) {
            System.out.print(newArray[p] + "\t");
        }
    }

}