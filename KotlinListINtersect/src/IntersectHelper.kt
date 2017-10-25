import java.util.ArrayList
import java.util.HashSet

class IntersectHelper {
    private val a:ArrayList<Int>
    private val h:HashSet<Int>
    private val res:HashSet<Int>
    // Public constructor
    init{
        a = ArrayList()
        h = HashSet()
        res = HashSet()
    }

    fun fillArray(numElems: Int, maxNum: Int) {
        for (i in 0 until numElems) {
            a.add((Math.random() * maxNum).toInt())
        }
    }

    fun test(){
        for (item in a) print("$item ")
    }

}