package com.company.uday;

public class moveZeros {
    public void moveZeroesMethod(int[] nums) {
        int counter = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                counter++;
            }
            else {
                nums[temp] = nums[i];
                temp++;
            }
        }
        for(int j=nums.length-counter; j<nums.length; j++) {
            nums[j] = 0;
        }
        for (int num:nums) {
            System.out.println(num);
        }
        //System.out.println(nums);
    }

    public static void main(String[] args) {
        moveZeros moveZeros = new moveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros.moveZeroesMethod(nums);
    }

}
