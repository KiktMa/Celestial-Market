package com.mjtal.gulimall.search;

import java.util.Scanner;

/**
 * @Author: june
 * @Date: 2023/9/22 19:58
 */
public class PackBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取箱子容量和物品数量
        int V = scanner.nextInt(); // 箱子容量
        int n = scanner.nextInt(); // 物品数量

        int[] volumes = new int[n]; // 物品体积
        for (int i = 0; i < n; i++) {
            volumes[i] = scanner.nextInt();
        }

        // 创建动态规划数组dp，dp[i][j]表示前i个物品装入容量为j的箱子时的最小剩余空间
        int[][] dp = new int[n + 1][V + 1];

        // 动态规划过程
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= V; j++) {
                if (volumes[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j]; // 物品i的体积超过箱子容量，无法装入
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - volumes[i - 1]] + volumes[i - 1]);
                }
            }
        }

        // 最小剩余空间即为箱子容量减去动态规划数组的最后一个元素
        System.out.println(V - dp[n][V]);
    }
}
