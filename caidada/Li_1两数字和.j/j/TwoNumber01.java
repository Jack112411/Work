package com.caidada.Li1两数字和.j;

public class TwoNumber01 {
    public static void main(String[] args) {
        int [] nums ={2323,54,6,67,6};
        int target=73;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i]+nums[j]==target){
                    System.out.println(i+"和"+j);
                }
            }
        }
    }
}
