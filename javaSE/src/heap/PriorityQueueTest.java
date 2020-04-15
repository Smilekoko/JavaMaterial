package heap;

import java.util.PriorityQueue;

/**
 * PriorityQueue类
 * 优先队列的作用是能保证每次取出的元素都是队列中权值最小的
 * 元素大小的评判可以通过元素本身的自然顺序（natural ordering），也可以通过构造时传入的比较器（Comparator，类似于C++的仿函数）。
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        int[] stones = {8, 5, 3, 21, 3};
        System.out.print("用print输出i:" + lastStoneWeight(stones));

    }


    /**
     * 有一堆石头，每块石头的重量都是正整数。
     * <p>
     * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。
     * 假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
     * <p>
     * 如果 x == y，那么两块石头都会被完全粉碎；
     * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
     * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
     */
    @SuppressWarnings("ConstantConditions")
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxpq = new PriorityQueue<Integer>(
                (a, b) -> b - a
        );
        for (int i : stones)
            //加入一个元素,offer()会破话顶部最小结构
            maxpq.offer(i);
        while (maxpq.size() > 1) {

            int y = maxpq.poll();
            int x = maxpq.poll();

            if (x != y)
                maxpq.offer(y - x);
        }
        if (maxpq.isEmpty()) return 0;
        return maxpq.peek();

    }
}
