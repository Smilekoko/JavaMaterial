package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组常见需求
 */
public class ArraysTest2 {

    public static void main(String[] args) {
        sortFunction();

    }

    /**
     * 数组的排序
     */
    public static void sortFunction() {
        double[] scores = new double[]{78, 45, 85, 97, 87};
        //升序
        Arrays.sort(scores);
        for (double score : scores) {
            System.out.print(score + "\t");
        }
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a, Collections.reverseOrder());

        for (int arr : a) {
            System.out.print(arr + " ");
        }
    }

    /**
     * 数组去重
     * 然后遍历 nums 中的元素，对每个元素判断是否在 tmpNums 出现过，
     * 如果出现过，那么就不放到新数组里面，也就是不做处理；
     * 如果没有出现过，那么就把它放到新的数组里面
     */
    public static void removeDuplicates() {
        //原数组
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 66, 6, 8};
        //申请一个和nums大小一样的数组tmpNums，
        int[] tmpNums = new int[nums.length];
        tmpNums[0] = nums[0];
        int index = 1;

        for (int i = 1, len = nums.length; i < len; i++) {
            int j = 0;
            for (; j < index; j++) {
                if (tmpNums[j] == nums[i]) {
                    break;
                }
            }
            if (j == index) {
                tmpNums[index++] = nums[i];
            }
        }
        nums = tmpNums;

    }
}
