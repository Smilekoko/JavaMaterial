package basicType;

public class byteTest {
    public static void main(String[] args) {
//        byte2int();
        byte2BinaryString();
    }

    /**
     * byte 转为 int
     */
    public static void byte2int() {

        //要保持数值不变
        //应用场景：数值计算，等等。
        byte b = (byte) 0xff;//-1
        int i = (int) b;
        System.out.println(b + i);


    }

    /**
     * byte 转换为二进制字符串
     * 主要用到了Integer.toBinaryString方法转化为二进制的。
     * 但这个方法的参数是int型，所以需要先转换为int型。
     * <p>
     * 转换为int型的方式：tByte & 0xFF
     */
    public static void byte2BinaryString() {
        byte a = 0x00;
        int i = a;
        String tString = Integer.toBinaryString((a & 0xFF) + 0x100).substring(1);
        System.out.println(a);
        System.out.println(tString);
    }
}
