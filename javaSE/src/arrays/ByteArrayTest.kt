package arrays

/**
 *
 */
object ByteArrayTest {

    @JvmStatic
    fun main(args: Array<String>) {
        A()
    }

    fun A() {
        val data: ByteArray = byteArrayOf(120)
        for (i in 1..120) {
            data[i] = i.toByte()
            println(data[i].toString())
        }

    }
}
