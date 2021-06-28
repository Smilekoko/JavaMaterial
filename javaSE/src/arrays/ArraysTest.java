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
        distributionSample();
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



}
