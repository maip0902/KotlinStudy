fun main() {
    val user1 = User("杏")
    user1.team = "blue"
    println("チームは${user1.team}")
    user1.sayHi()
    user1.sayHello()

    val user2 = AdminUser("春")
    println("チームは${user2.team}")
    user2.sayHi()

    val person = Person()
    person.share()
}

// 継承okの時はopenをつける
open class User(var name:String) {
    var team:String = "red"
        // getter,setter が内部で自動生成される
        // 上書きできる
        get() {
            return field.toUpperCase()
        }

        set(value){
            if(value != "") {
                field = value
            }
        }
    open fun sayHi() {
        println("hi ${this.name}")
    }
}

// 継承
// User -> AdminUser
// アクセス修飾子 private クラス内,public どこからでも,protected クラス内,継承クラス内
class AdminUser(name: String): User(name) {
    override fun sayHi() {
        println("hello $name")
    }
}

// クラスの拡張
fun User.sayHello() {
    println("hello $name")
}

//// 抽象クラス
//abstract class Person {
//    // 絶対実装しなきゃならんやつ
//    // 他の言語と同じ
//    abstract fun sayHello()
//}
//
//class American: Person() {
//    override fun sayHello() {
//        println("Hi")
//    }
//}
//
//class Japanese: Person() {
//    override fun sayHello() {
//        println("こんにちは")
//    }
//}

// interface
interface Sharable {
    // 抽象プロパティ
    val version: Double
    // 抽象メソッド
    fun share()
    fun getInfo(){
        println("Share $version")
    }
}

class Person(): Sharable {
    override val version = 1.1
    override fun share() {
        println("share ${this.version}")
    }
}