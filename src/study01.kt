fun main() {
    // 変数
    // val 変更できない
    // var 変更できる
//    val msg: String = "Hello World"
    // String 文字列 ""で囲う
    // Char 文字　''で囲う
    val msg = "Hello" //型推論
    println(msg)

    // Byte, Short, Int, Long
    // Longの時は末尾にLをつける

    // Float, Double
    // Floatの時は末尾にFをつける(fでも可)

    // Boolean true/false

    // 演算子は基本のものと同じ

    //文字列連結
    println("hello" + "あんずちゃん")
    val name = "あんずちゃん"
    println("hello $name")
    println("杏は${12 + 14} 才" )

    // if
    val score  = 10
//    if(score > 80) {
//        println("good")
//    } else {
//        println("so so")
//    }

    // ifの結果を変数に代入できる
    val result = if (score > 80) "good" else "so so"
    println(result)

    // when 他の言語のswitch
    val num = 13
//    when (num) {
//        0 -> println("Zero")
//        in 4..10 -> println("4から10の間")
//    }

    // whenも結果を変数に代入できる
    val result2 = when (num) {
        0 -> println("Zero")
        in 4..10 -> println("4から10の間")
        else -> "謎の値"
    }
    println(result2)

    // while
//    var i = 0
//    while(i < 3) {
//        println("loop: $i")
//        i ++
//    }

//    do {
//        println("loop $i")
//        i ++
//    } while(i < 3)

    // for文
    // breakとcontinueは他の言語と同じ
//    for (i in 0..3) {
//        println("今は$i")
//    }
//    sayHi("あんずちゃん", 12)
    // 何も渡さないとデフォルト値
    // 引数の名前を渡せば順番は関係ない
    println(sayHi())
}

// 何も返さないのはUnit
//fun sayHi(name: String = "riko", age: Int = 1): Unit {
//    println("$name は $age 才です")
//}

//fun sayHi(name: String = "riko", age: Int = 1): String {
//    println("$name は $age 才です")
//    return "hi"
//}
// 単一のものを返す時はかっこ省略できる
fun sayHi(): String = "hi!"