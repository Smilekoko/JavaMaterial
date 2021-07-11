package genericType;

/**
 * 范型方法
 */
class ArrayAlg {

    public static void main(String[] args) {
        String middle1 = ArrayAlg.<String>getMiddle("]ohnM", "koko", "Public");
//        Number middle2 = ArrayAlg.<Double>getMiddle(3.14, 1729, 0);
        Number middle3 = ArrayAlg.<Double>getMiddle(3.14, 1729d, 0d);
        Integer[] a = {1, 2, 3, 4, 5};
        Integer min = min(a);
    }

    @SafeVarargs
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    @SuppressWarnings("rawtypes")
    public static <T extends Comparable> T min(T[] a)
    {
        if (a == null || a.length == 0)
            return null;

        T smallest = a[0];


        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) < 0)
                smallest = a[i];
        }

        return smallest;
    }


}