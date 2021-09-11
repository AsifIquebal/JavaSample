package com.company.commonQAs.array;

import org.testng.annotations.Test;

public class ValidMountain {

    @Test
    public void test01() {
        System.out.println(isValidMountain(new int[]{0, 3, 2, 1}));
        System.out.println(isValidMountain(new int[]{0, 3, 2,4, 1}));
    }

    boolean isValidMountain(int[] arr) {
        int l = 0, n = arr.length, r = n - 1;
        if (n < 3) return false;
        else {
            while (l + 1 < n && arr[l] < arr[l + 1]) l++;
            while (r - 1 >= 0 && arr[r - 1] > arr[r]) r--;
            if (l == r && l > 0 && r < n - 1) return true;
            else return false;
        }
    }

}
