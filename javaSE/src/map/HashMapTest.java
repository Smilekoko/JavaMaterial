package map;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        forEachIteration();

    }

    /**
     * 迭代HashMap
     * 只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，
     * 如果你只想获取 value，可以使用 values() 方法。
     */
    public static void forEachIteration() {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for (String value : Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}
