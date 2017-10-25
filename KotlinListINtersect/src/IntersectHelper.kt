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

    fun test(){
        a.add(21)
        a.add(43)
        for (item in a) print("$item ")
    }

}