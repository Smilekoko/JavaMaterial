package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Arrays类
 * 数组的一些常见功能
 */
public class ArraysTest {

    public static void main(String[] args) {
//        distributionSample();
        int[] i = {1, 2, 3, 4, 5, 6, 6, 8};
        System.out.println(Arrays.toString(removeDuplicates(i)));
    }

    /**
     * 分配测试样本
     */
    public static void distributionSample() {
        //设计样本集合
        HashMap<String, String[]> samples = new HashMap<String, String[]>();
        ArrayList<String> rfidTestList = new ArrayList<String>();


        //外层循环12次，
        for (int i = 1; i < 13; i++) {
            //内存循环20次
            for (int j = 20 * (i - 1) + 1; j < (20 * i) + 1; j++) {
                System.out.println("key=" + i + "-------" + "value=" + j);
                rfidTestList.add(j + "");
            }
            String[] temp;
            temp = rfidTestList.toArray(new String[20]);
            samples.put("" + i, temp);
            rfidTestList.clear();

        }

        // Iterating entries using a For Each loop
        for (Map.Entry<String, String[]> entry : samples.entrySet()) {
            String s = Arrays.toString(entry.getValue());
            System.out.println("Key = " + entry.getKey() + ", Value = " + s);
        }

    }

    /**
     * 删除数组重复项
     * 不要使用额外的数组空间，必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * @param nums 需要去重复的数组
     * @return
     */
    public static int[] removeDuplicates(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0)
            return nums;

        int left = 0;
        for (int right = 1; right < nums.length; right++) { //  左右标的值一样，右标随循环移动，可能移动多次(重复多次)

            //{0,0,0,1,1,2,3,3,5}
            //{0,1,0,0,1,2,3,3,5}
            if (nums[left] != nums[right])
                nums[++left] = //当左右值不一样，left自增，nums[left] 指向的值向右边移动一位
                        nums[right];//同时把右标赋值给移动后的坐标

        }

        return Arrays.copyOf(nums, ++left);

    }


}
