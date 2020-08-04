package weekly200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created on:  Aug 01, 2020
 * Questions: https://leetcode.com/problems/get-the-maximum-score/
 */
public class GetTheMaximumScore {
    static int mod = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 4, 5, 8, 10}, new int[]{4, 6, 8, 9}) + " = 30");
        System.out.println(maxSum(new int[]{1, 3, 5, 7, 9}, new int[]{3, 5, 100}) + " = 109");
        System.out.println(maxSum(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}) + " = 40");
        System.out.println(maxSum(new int[]{1, 4, 5, 8, 9, 11, 19}, new int[]{2, 3, 4, 11, 12}) + " = 61");
        System.out.println(maxSum(new int[]{6, 7, 12, 13, 14, 17, 20}, new int[]{1, 4, 5, 7}) + " = 93");
        System.out.println(maxSum(
                new int[]{10, 27, 32, 44, 55, 68, 73, 83, 93, 104, 106, 122, 123, 139, 152, 156, 161, 163, 177, 190, 206, 221, 234, 237, 253, 256, 270, 275, 279, 290, 295, 300, 304, 318, 332, 334, 339, 356, 358, 376, 381, 385, 390, 406, 408, 411, 429, 430, 431, 442, 458, 460, 480, 496, 501, 503, 508, 524, 528, 540, 543, 546, 547, 562, 566, 569, 574, 588, 606, 623, 634, 645, 650, 668, 673, 689, 694, 712, 727, 728, 739, 742, 762, 780, 782, 785, 787, 807, 812, 817, 833, 844, 845, 865, 870, 871, 873, 878, 879, 896, 900, 912, 927, 929, 932, 935, 947, 950, 952, 969, 987, 999, 1013, 1024, 1025, 1036, 1047, 1060, 1077, 1080, 1096, 1108, 1111, 1116, 1117, 1120, 1133, 1153, 1154, 1172, 1175, 1189, 1190, 1204, 1214, 1219, 1237, 1239, 1243, 1256, 1259, 1261, 1276, 1292, 1306, 1320, 1330, 1332, 1333, 1336, 1337, 1356, 1370, 1385, 1400, 1404, 1424, 1425, 1430, 1450, 1453, 1465, 1478, 1497, 1499, 1510, 1527, 1543, 1545, 1548, 1559, 1575, 1578, 1598, 1610, 1624, 1635, 1653, 1670, 1672, 1692, 1697, 1712, 1715, 1726, 1731, 1735, 1749, 1762, 1767},
                new int[]{5, 6, 10, 11, 30, 47, 64, 69, 72, 74, 75, 87, 92, 97, 116, 131, 135, 150, 151, 168, 172, 175, 177, 180, 183, 188, 201, 215, 234, 237, 256, 268, 272, 275, 291, 296, 307, 309, 312, 329, 332, 335, 339, 356, 361, 363, 367, 371, 375, 390, 391, 394, 411, 429, 439, 442, 452, 462, 463, 475, 477, 479, 480, 482, 496, 500, 504, 507, 510, 530, 535, 537, 542, 547, 551, 562, 565, 569, 580, 581, 583, 585, 602, 612, 626, 631, 634, 646, 648, 662, 675, 678, 697, 702, 705, 707, 708, 711, 727, 729, 731, 742, 747, 763, 768, 771, 789, 799, 809, 829, 847, 850, 855, 868, 870, 887, 897, 901, 914, 930, 941, 943, 945, 949, 950, 965, 966, 968, 987, 990, 1002, 1017, 1019, 1037, 1052, 1056, 1059, 1063, 1064, 1066, 1070, 1073, 1088, 1090, 1110, 1128, 1132, 1152, 1155, 1159, 1175, 1189, 1201, 1219, 1235, 1236, 1239, 1257, 1260, 1274, 1278, 1292, 1302, 1305, 1319, 1331, 1334, 1351, 1366, 1377, 1379, 1398, 1399, 1413, 1417, 1429, 1432, 1433, 1436, 1447, 1451, 1468, 1487, 1488, 1501, 1505, 1525, 1530, 1535, 1539, 1558, 1560, 1561, 1576, 1579, 1581, 1594, 1599, 1603, 1616, 1628, 1633, 1644, 1647, 1660, 1661, 1666, 1669, 1688, 1692, 1697, 1700, 1718, 1722, 1741, 1759, 1773, 1787, 1800, 1817, 1830, 1833, 1837, 1850, 1860, 1861, 1878, 1894, 1904, 1909, 1913, 1926, 1946, 1966, 1968, 1988, 1993, 2008, 2009, 2020, 2038, 2040, 2050, 2055, 2069, 2072, 2076, 2096, 2098, 2103, 2113, 2118, 2135, 2136, 2138, 2155, 2160, 2164, 2166, 2167, 2183, 2202, 2203, 2206, 2226, 2230, 2242, 2261, 2276, 2289, 2305, 2310, 2314, 2316, 2318, 2321, 2340, 2353, 2358, 2363, 2367, 2381, 2391, 2404, 2406, 2407, 2420, 2422, 2427, 2447, 2461, 2462, 2472, 2476, 2478, 2482, 2502, 2505, 2506, 2510, 2525, 2539, 2541, 2555, 2568, 2569, 2572, 2574, 2579, 2583, 2593, 2603, 2617, 2633, 2638, 2641, 2645, 2655, 2675, 2693, 2697, 2715, 2735, 2753, 2768, 2772, 2787, 2807, 2817, 2822, 2825, 2842})
                + " = 546247");
    }

    public static int maxSum(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < l1 - 1; i++) {
            graph.computeIfAbsent(nums1[i], val -> new HashSet<>()).add(nums1[i + 1]);
        }
        for (int i = 0; i < l2 - 1; i++) {
            graph.computeIfAbsent(nums2[i], val -> new HashSet<>()).add(nums2[i + 1]);
        }
        Map<Integer, Long> memo = new HashMap<>();
        long val1 = dfs(nums1[0], graph, memo);
        long val2 = dfs(nums2[0], graph, memo);
        return (int) (Math.max(val1, val2) % mod);
    }

    private static long dfs(int start, Map<Integer, Set<Integer>> graph, Map<Integer, Long> memo) {
        if (memo.containsKey(start)) return memo.get(start);
        long max = 0;
        for (int next : graph.getOrDefault(start, new HashSet<>())) {
            max = Math.max(max, dfs(next, graph, memo));
        }
        memo.put(start, max + start);
        return max + start;
    }
}
