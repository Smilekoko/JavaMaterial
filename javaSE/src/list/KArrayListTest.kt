package list

object KArrayListTest {
    /**
     * 多个集合合并
     */
    fun aggregateResults(resultLists: ArrayList<ArrayList<String>>): ArrayList<String> {

        var tempArr = ArrayList<String>()

        //合并多个集合
        for (i in resultLists.indices) {
            if (i != resultLists.size - 1)
                resultLists[0].addAll(resultLists[i + 1])
        }
        //合并完后的集合
        tempArr = resultLists[0]

        val newArr = ArrayList<String>()
        //集合去重，顺便排序
        for (str in tempArr) {
            if (!newArr.contains(str))
                newArr.add(str)
        }
        return newArr

    }
}