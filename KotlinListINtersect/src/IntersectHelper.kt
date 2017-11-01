import java.util.*
import java.util.concurrent.ThreadLocalRandom

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
        val random = ThreadLocalRandom.current()
        for (i in 0 until numElems) {
            a.add(random.nextInt(0, maxNum))
        }
    }

    fun fillHashset(numElems: Int, maxNum: Int) {
        val random = ThreadLocalRandom.current()
        for (i in 0 until numElems) {
            h.add(random.nextInt(0, maxNum))
        }
    }

    fun calcIntersection(): Pair<Long, HashSet<Int>> {

        // Getting the timestamp here
        val startTime = System.currentTimeMillis()
        // Doing the intersection
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