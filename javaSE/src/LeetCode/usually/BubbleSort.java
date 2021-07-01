package LeetCode.usually;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
//        bubbleSort1();
//        bubbleSort2();
        bubbleSort3();
    }

    /**
     * 第一种实现
     * 无优化版本
     */
    public static void bubbleSort1() {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {//如果前面数字大于后面的就交换值
                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    /**
     * 第二种实现
     * 如果对于一个本身有序的序列，或则序列后面一大部分都是有序的序列，上面的算法就会浪费很多的时间开销，
     * 这里设置一个标志flag，如果这一趟发生了交换，则为true，否则为false。明显如果有一趟没有发生交换，说明排序已经完成。
     */
    public static void bubbleSort2() {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        int length = arr.length;
        boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true
        while (flag) {
            flag = false; //每次开始排序前，都设置flag为未排序过
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {//如果前面数字大于后面的就交换值
                    int temp;
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }
            }
            length--;//减少一次排序的尾边界,第一次排序后最后一位一定是最大的，所以就不计较最后一位了
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    /**
     * 第三种实现
     * <p>
     * 现在有一个包含1000个数的数组，仅前面100个无序，后面900个都已排好序且都大于前面100个数字，
     * 那么在第一趟遍历后，最后发生交换的位置必定小于100，且这个位置之后的数据必定已经有序了，
     * 也就是这个位置以后的数据不需要再排序了，于是记录下这位置，第二次只要从数组头部遍历到这个位置就可以了。
     */
    public static void bubbleSort3() {
        int j, k;
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        int flag = arr.length;//flag来记录最后交换的位置，也就是排序的尾边界

        while (flag > 0) {//排序未结束标志
            k = flag; //k 来记录遍历的尾边界
            flag = 0;//for循环不再改变flag的值，跳出while()循环，排列结束
            for (j = 1; j < k; j++) {
                if (arr[j - 1] > arr[j]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    //表示交换过数据;
                    flag = j;//记录最新的尾边界.
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

}
