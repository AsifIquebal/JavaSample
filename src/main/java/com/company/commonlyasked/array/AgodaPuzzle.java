package com.company.commonlyasked.array;

import java.util.*;

// 1. li=[1, 7, 23, 72, 171, 71, 1772] , n = 171
//{1=1,7=1}
// find distinct digits of n    171                            ------> 1, 7
// find distinct digits of each index in li                    ------>
//li[0] = 1
//li[1] = 7 li[2] =2,3  li[3] = 7,2 li[4] = 1,7 li[5] = 7,1 li[6] = 1,7,2
// Check if the digits returned in step 2 , is a subset of n
// if li[0] = 1 is a subset of n(1,7) -> true , counter ++
// if li[1] = 7 is a subset of n(1,7)
// li[2] =2,3  li[3] = 7,2 li[4] = 1,7 li[5] = 7,1
// if  li[6] = 1,7,2 is a subset of n(1,7)
//  ------> TRUE : li[0], li[1], li[4], li[5]
// finally return the total number of subsets of n             ------> 4
// expected output for above example: 4
public class AgodaPuzzle {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        Integer[] a = {1, 7, 23, 72, 171, 71, 1772};
        List<Integer> list = Arrays.asList(a);
        int n = 171, counter = 0;
        printDistinct(n);
        System.out.println("=====================================");
        list.forEach(e -> printDistinct(e));

        List<Integer> l = getList(n);

        for (int i = 0; i < list.size(); i++) {
            Map<Integer, Integer> s = new LinkedHashMap();
            int m = list.get(i);
            while (m > 0) {
                int b = m % 10;
                if (!s.containsKey(b)) {
                    s.put(b, 1);
                }
            }
            List<Integer> list2 = new ArrayList<>();
            s.forEach((k, v) -> list2.add(k));
            if (l.containsAll(list2)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void printDistinct(int n) {

        Map<Integer, Integer> s = new LinkedHashMap();
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            if (!s.containsKey(a)) {
                s.put(a, 1);

            }
            System.out.println(a);
        }
        s.forEach((k, v) -> System.out.println(k));
    }

    public static List<Integer> getList(int n) {
        Map<Integer, Integer> s = new LinkedHashMap();
        while (n > 0) {
            int a = n % 10;
            if (!s.containsKey(a)) {
                s.put(a, 1);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        s.forEach((k, v) -> list2.add(k));
        return list2;
    }
}
