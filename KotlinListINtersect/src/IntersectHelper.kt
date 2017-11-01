import java.util.*

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

    fun fillHashset(numElems: Int, maxNum: Int) {
        for (i in 0 until numElems) {
            h.add((Math.random() * maxNum).toInt())
        }
    }

    fun calcIntersection(): Pair<Long, HashSet<Int>> {

        // Getting the timestamp here
        val startTime = System.currentTimeMillis()

        a.filterTo(res) { elem -> h.contains(elem) }
        // Getting the timestamp here
        val stopTime = System.currentTimeMillis()

        return Pair(stopTime - startTime, res)
    }

    fun calcIntersectionForLoop(): Pair<Long, HashSet<Int>> {

        // Getting the timestamp here
        val startTime = System.currentTimeMillis()

        for (i in a) {
            for (j in h) {
                if (i.equals(j)) {
                    res.add(i)
                }
            }
        }
        // Getting the timestamp here
        val stopTime = System.currentTimeMillis()

        return Pair(stopTime - startTime, res)
    }

    fun reset() {
        a.clear()
        h.clear()
        res.clear()
    }

}