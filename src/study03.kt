fun main() {
    val p1 = Point(3, 5)
    val p2 = p1.copy()
    println(p1)
    val (x,y) = p1
    println("$x,$y")

    // Collection
    /*
    List
    Set
    Map
     */
    // immutable 値の変更ができない
    // mutableListOf() でmutableになる
    val sales = listOf(20,10,40)
    println(sales[1])
    println(sales.size)
    for (sale in sales) {
        println(sale)
    }

    sales
//        .map { n -> n*1.08}
        .map {it * 1.08} // 暗黙の引数
        .filter { it > 20}
        .forEach { println(it)}

    // setは順番なし pythonと同じ
    val answers = setOf(1,2,3,5,5)

    // デフォルトだとimmutable
    // mutableMapOf でmutableになる
    val users = mapOf("mai" to 10, "anz" to 40)

    // null安全
    val s: String? = null
//    println(s?.length)
    println(s?.length ?: -1)
    // nullなら例外を投げる
    println(s!!.length)
}

// データクラス
data class Point(val x: Int, val y: Int)



