package basicType;

public class IntTest {
    public static void main(String[] args) {

//        intChangeBinaryString();
        addOne();
    }

    /**
     * int和二进制字符串互转
     */
    public static void intChangeBinaryString() {

        int i = Integer.MAX_VALUE;
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);

        int i2 = Integer.parseUnsignedInt(binaryString, 2);
        System.out.println(i2);
    }


    /**
     * 获取自然增长值
     * 没什么机器就是先写固定数据，然后修改 起始条件和判断条件 还有边界值
     */
    public static void addOne() {
        //外层循环12次，
        for (int i = 1; i < 13; i++) {
            //内存循环20次
            for (int j = 20 * (i - 1) + 1; j < (20 * i) + 1; j++) {
                System.out.println("key=" + i + "-------" + "value=" + j);
            }
        }
    }

}
