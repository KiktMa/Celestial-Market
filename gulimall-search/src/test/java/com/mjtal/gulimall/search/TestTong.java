package com.mjtal.gulimall.search;

import java.util.*;

/**
 * @Author: june
 * @Date: 2023/9/22 19:29
 */
public class TestTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 消耗换行符

        Map<String, List<String>> categories = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String sortedInput = sortString(input); // 将字符串按字符排序

            if (!categories.containsKey(sortedInput)) {
                categories.put(sortedInput, new ArrayList<>());
            }
            categories.get(sortedInput).add(input);
        }

        for (List<String> category : categories.values()) {
            for (String str : category) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    // 辅助函数：将字符串按字符排序
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
}
