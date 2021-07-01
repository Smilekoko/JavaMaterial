package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试ArrayList的性能，探寻原理
 */
public class ArrayListTest {

    private static final int COUNT = 100000; //十万
    private static final ArrayList<Object> arrayList = new ArrayList<Object>();

    public static void main(String[] args) {

//        insertData(arrayList, "ArrayList");
//        readAccessData(arrayList, "ArrayList");
//        deleteData(arrayList, "ArrayList");

//        listChangeStringArray();

        arraysContainsEach();
    }

    /**
     * 指定的List 的子类中删除元素，并统计删除的时间
     *
     * @param list List 的子类
     * @param name 子类的名称
     */
    private static void deleteData(List<Object> list, String name) {
        long startTime = System.currentTimeMillis();

        // 删除list第一个位置元素
        for (int i = COUNT - 1; i >= 0; i--) {
            list.remove(0);
        }


        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(name + " : 删除 " + COUNT + "元素， 使用的时间是 " + interval + " ms");
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

    /**
     * List和数组间转换
     */
    public static void listChangeStringArray() {

        //先准备一个List
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        //List转String
        String[] strs1 = testList.toArray(new String[0]);
        for (String s : strs1) {
            System.out.println(s);
        }


        //准备一个String数组
        String[] strs = {"aa", "bb", "cc"};
        //String数组转List
        List<String> strsToList1 = Arrays.asList(strs);
        for (String s : strsToList1) {
            System.out.println(s);

        }
    }

    /**
     * 两个集合比较，是否包含对方的元素
     */
    public static void arraysContainsEach() {
        //样本RFID是String[]
        String[] sampleRFID = {"1", "2", "3", "4", "5", "6", "7"};
        //返回结果是List<String>
        ArrayList<String> result1 = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            result1.add(i + "");
        }

        //转换样本数组为集合方便比对
        ArrayList<String> sampleRFIDList = new ArrayList<>(Arrays.asList(sampleRFID));

        //新增RFID：遍历结果集合，是否被包含中样本集合中，不包含就是新增的
        //https://geek-docs.com/java/java-collection/how-to-compare-two-arraylist.html
        ArrayList<String> newRFIDList = new ArrayList<String>(); //包含新增RFID集合
        for (String temp : result1)
            if (!sampleRFIDList.contains(temp))
                newRFIDList.add(temp);
        System.out.println("新增RFID=" + newRFIDList);

        //丢失RFID,遍历样本集合，确定样本中的每一个RFID是否包含在结果集合中，不包含就是丢失的
        ArrayList<String> lostRFIDList = new ArrayList<String>(); //包含新增RFID集合
        for (String temp : sampleRFIDList)
            if (!result1.contains(temp))
                lostRFIDList.add(temp);
        System.out.println("丢失的RFID=" + lostRFIDList);
    }

}
