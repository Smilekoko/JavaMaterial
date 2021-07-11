package genericType;

/**
 * 范型的测试代码
 */
public class GenericTypeTest {
    public static void main(String[] args) {

        Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];
    }
}
