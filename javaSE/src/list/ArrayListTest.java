package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试ArrayList的性能，探寻原理
 */
public class ArrayListTest {

    private static final int COUNT = 100000; //十万
    private static final ArrayList<Object> arrayList = new ArrayList<Object>();

    public static void main(String[] args) {

        insertData(arrayList,"ArrayList");
        readAccessData(arrayList,"ArrayList");
        deleteData(arrayList,"ArrayList");

    }

    /**
     * 指定的List 的子类中删除元素，并统计删除的时间
     * @param list List 的子类
     * @param name 子类的名称
     */
    private static void deleteData(List<Object> list,String name) {
        long startTime = System.currentTimeMillis();

        // 删除list第一个位置元素
        for (int i = COUNT - 1; i >= 0; i--){
            list.remove(0);
        }


        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(name + " : 删除 "+COUNT+"元素， 使用的时间是 " + interval+" ms");
    }

    /**
     * 指定的List 的子类中插入元素，并统计插入的时间
     *
     * @param list List 的子类
     * @param name 子类的名称
     */
    private static void insertData(List<Object> list, String name) {

        long startTime = System.currentTimeMillis();

        // 向list的位置0插入COUNT个数
        for (int i = 0; i < COUNT; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(name + " : 插入 " + COUNT + "元素， 使用的时间是 " + interval + " ms");
    }

    /**
     * 指定的List 的子类中读取元素，并统计读取的时间
     *
     * @param list List 的子类
     * @param name 子类的名称
     */
    private static void readAccessData(List<Object> list, String name) {
        long startTime = System.currentTimeMillis();

        // 读取list元素
        for (int i = 0; i < COUNT; i++)
            list.get(i);

        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(name + " : 随机读取 " + COUNT + "元素， 使用的时间是 " + interval + " ms");
    }

}
